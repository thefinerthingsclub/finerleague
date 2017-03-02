## Instrucciones

El módulo `finerleague-mocks` es un simple servidor node para mockear los servicios *REST* sin tener que arrancar el servidor *Java*:
- Los datos son random y se generan cada vez que se arranca el servidor.
- Se pueden crear, eliminar y actualizar recursos, pero no se persiste entre reinicios.

## Instalación
Situarse en la carpeta y ejecutar `npm install` en la terminal la primera vez.
Para arrancar el servidor node: `npm run mock` o `json-server apiMocks.js`

## Ampliar servicios
Añadir un objeto como los existentes con los atributos necesarios en `apiMock.js` y reiniciar el servidor. La librería usada ([json-server](https://github.com/typicode/json-server) + [faker](https://github.com/marak/Faker.js/)) genera automáticamente los endpoints.
