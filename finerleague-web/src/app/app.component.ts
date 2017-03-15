import { Component, LOCALE_ID, Inject } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  languages = [
    { code: 'en', label: 'English'},
    { code: 'es', label: 'Español'},
    { code: 'it', label: 'Italian'}
  ];
  constructor(@Inject(LOCALE_ID) protected localeId: string) { }

  public onLanguageChange(language: string): void {
    let url = location.pathname.replace(new RegExp("/" + this.localeId, "g"), "");
    if(language !== 'en' && language !== 'en-US'){
      url += language;
    }
    localStorage.setItem('localeId', language);
    location.href = url;
  }
}
