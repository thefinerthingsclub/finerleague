export class Game {
  private _id: string;
  private _image: string;
  private _name: string;

  constructor(id: string, name: string, image: string) {
    if (id) {
      this._id = id;
    }
    this._name = name;
    this._image = image;
  }

  get id(): string {
    return this._id;
  }

  get name(): string {
    return this._name;
  }

  set name(newName: string) {
      this._name = newName;
  }

  get image(): string {
    return this._image;
  }

  set image(newImage: string) {
      this._image = newImage;
  }

  json() {
    return JSON.stringify(this);
  }

  clone() {
    return new Game(this.id, this.name, this.image);
  }
}
