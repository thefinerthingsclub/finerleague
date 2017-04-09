import { TestBed, getTestBed, async, inject } from '@angular/core/testing';
import { MockBackend, MockConnection } from '@angular/http/testing';
import { Headers, BaseRequestOptions, Response, HttpModule, Http, XHRBackend, RequestMethod, ResponseOptions } from '@angular/http';
import { Game } from './game';
import { GameService } from './game.service';

describe('GamesService', () => {
  let mockBackend: MockBackend;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [
        GameService,
        MockBackend,
        BaseRequestOptions,
        {
              provide: Http,
              deps: [MockBackend, BaseRequestOptions],
              useFactory: (backend: XHRBackend, defaultOptions: BaseRequestOptions) => {
                  return new Http(backend, defaultOptions);
              }
         }],
         imports: [HttpModule]
    });
    mockBackend = getTestBed().get(MockBackend);
  });

  it('should create an instance of the GameService', inject([GameService], (service: GameService) => {
    expect(service).toBeTruthy();
  }));

  it('should get list of all games', async(inject([GameService], (gameService) => {
      const mockResponse = [
        { id: '1', name: 'Game 1', image: 'image1.png' },
        { id: '2', name: 'Game 2', image: 'image2.png' }
      ];
      mockBackend.connections.subscribe((connection: MockConnection) => {
        connection.mockRespond(new Response(new ResponseOptions({ body: mockResponse })));
      });

      gameService.findAll().subscribe((data) => {
          expect(data.length).toBe(2);
          expect(data[0].id).toBe('1');
          expect(data[0].name).toBe('Game 1');
          expect(data[0].image).toBe('image1.png');
      });
  })));

  it('should get game by id', async(inject([GameService], (gameService) => {
      const mockResponse = { id: '1', name: 'Game 1', image: 'image1.png' };

      mockBackend.connections.subscribe((connection: MockConnection) => {
        // make sure the URL is correct
        expect(connection.request.url).toMatch(/\/api\/game\/1/);
        connection.mockRespond(new Response(new ResponseOptions({ body: mockResponse })));
      });

      gameService.findById('1').subscribe((game: Game) => {
          expect(game.id).toBe('1');
          expect(game.name).toBe('Game 1');
          expect(game.image).toBe('image1.png');
      });
  })));

  it('should insert new Game', async(inject([GameService], (gameService) => {
      mockBackend.connections.subscribe((connection: MockConnection) => {
        // is it the correct REST type for an insert? (POST)
        expect(connection.request.method).toBe(RequestMethod.Post);
        // if ok
        connection.mockRespond(new Response(new ResponseOptions({status: 201})));
      });
      let game = new Game(null, 'Game new', 'imageNew.jspg');
      gameService.save(game).subscribe((successResult) => {
          expect(successResult).toBeDefined();
          expect(successResult.status).toBe(201);
          expect(successResult.ok).toBe(true);
        });
    })));

    it('should save updates to an existing Game', async(inject([GameService], (gameService) => {
        mockBackend.connections.subscribe((connection: MockConnection) => {
          // is it the correct REST type for update? (PUT)
          expect(connection.request.method).toBe(RequestMethod.Put);
          // if ok
          connection.mockRespond(new Response(new ResponseOptions({status: 204})));
        });

        let game = new Game("1", 'Game changed', 'imageChanged.jspg');
        gameService.save(game).subscribe((successResult) => {
            expect(successResult).toBeDefined();
            expect(successResult.status).toBe(204);
            expect(successResult.ok).toBe(true);
          });
      })));

    it('should delete an existing Game', async(inject([GameService], (gameService) => {
      mockBackend.connections.subscribe(connection => {
        expect(connection.request.method).toBe(RequestMethod.Delete);
        connection.mockRespond(<Response>new ResponseOptions({status: 204}));
      });

      gameService.delete('1').subscribe(
        (successResult) => {
          expect(successResult).toBeDefined();
          expect(successResult.status).toBe(204);
        },
        (errorResult) => {
          throw (errorResult);
        });
    })));
});
