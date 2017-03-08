export class Game {
  private _id: string;
  private _image: string;
  private _name: string;

  constructor(id: string, name: string, image: string) {
    this._id = id;
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
}
