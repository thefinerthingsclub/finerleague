/**
 * Created by yduartep on 3/2/2017.
 */
module.exports = function() {
    var faker = require("faker");

    return {
        division: Array(6).fill(0).map(i => {
            return {
                "name": faker.name.firstName(),
                "priority": faker.random.number(),
                "id": faker.random.uuid()
            }
        }),
        game: Array(20).fill(0).map(i => {
            return {
                "name": faker.name.firstName(),
                "image": faker.random.image(),
                "id": faker.random.uuid(),
                "seasonDefinition": {
                    "id": faker.random.uuid(),
                    "firstDate": faker.date.future()
                }
            }
        }),
        person: Array(10).fill(0).map(i => {
            return {
                "identifier": faker.random.uuid(),
                "name": faker.name.firstName(),
                "email": faker.internet.email(),
                "id": faker.random.uuid(),
                "seasonDefinition": {
                    "id": faker.random.uuid(),
                    "firstDate": faker.date.future()
                }
            }
        }),
        team: Array(10).fill(0).map(i => {
              return {
                  "id": faker.random.uuid(),
                  "name": faker.name.firstName(),
              }
        })
    }
}
