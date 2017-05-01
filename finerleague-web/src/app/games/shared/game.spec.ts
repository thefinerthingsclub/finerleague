import { Game } from './game';

describe('Game', () => {
  it('should create an instance with id', () => {
    expect(new Game('123', 'string', 'string')).toBeTruthy();
  });

  it('should create an instance with all values', () => {
      expect(new Game('123', 'Game1', 'image1.png')).toBeTruthy();
  });

  it('should accept values in the constructor', () => {
      const id = '123', name = 'Game1', image = 'image1.png';
      const game = new Game(id, name, image);
      expect(game.id).toBe(id);
      expect(game.name).toBe(name);
      expect(game.image).toBe(image);
  });
});
