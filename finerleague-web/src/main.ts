import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule)
  .then(success => console.log(`... bootstraping completed successfully!!`))
  .catch(err => console.error('Bootstrap Error: ' + err.message ? err.message : err.toString()));
