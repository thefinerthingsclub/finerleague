import { FinerleagueWebPage } from './app.po';

describe('finerleague-web App', () => {
  let page: FinerleagueWebPage;

  beforeEach(() => {
    page = new FinerleagueWebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
