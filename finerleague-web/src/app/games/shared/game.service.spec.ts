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
        { id: "1", name: 'Game 1', image: 'image1.png' },
        { id: "2", name: 'Game 2', image: 'image2.png' }
      ];
      mockBackend.connections.subscribe((connection: MockConnection) => {
        connection.mockRespond(new Response(new ResponseOptions({ body: mockResponse })));
      });

      gameService.findAll().subscribe((data) => {
          expect(data.length).toBe(2);
          expect(data[0].id).toBe("1");
          expect(data[0].name).toBe('Game 1');
          expect(data[0].image).toBe('image1.png');
      });
  })));

  it('should get game by id', async(inject([GameService], (gameService) => {
      const mockResponse = { id: "1", name: 'Game 1', image: 'image1.png' };

      mockBackend.connections.subscribe((connection: MockConnection) => {
        // make sure the URL is correct
        expect(connection.request.url).toMatch(/\/api\/game\/1/);
        connection.mockRespond(new Response(new ResponseOptions({ body: mockResponse })));
      });

      gameService.findById("1").subscribe((game: Game) => {
          expect(game.id).toBe("1");
          expect(game.name).toBe('Game 1');
          expect(game.image).toBe('image1.png');
      });
  })));
});
