/**
 * Created by yduartep on 3/2/2017.
 */
module.exports = function() {
    var faker = require("faker");

    return {
        division: Array(6).fill(0).map(i => {
            return {
                "name": faker.commerce.department(),
                "priority": faker.random.number(),
                "id": faker.random.number()
            }
        }),
        game: Array(20).fill(0).map(i => {
            return {
                "name": faker.commerce.productName(),
                "image": faker.random.image(),
                "id": faker.random.number()
            }
        }),
        person: Array(10).fill(0).map(i => {
            return {
                "identifier": faker.random.uuid(),
                "name": faker.name.findName(),
                "email": faker.internet.email(),
                "id": faker.random.number()
            }
        }),
        team: Array(10).fill(0).map(i => {
              return {
                  "id": faker.random.number(),
                  "name": faker.company.companyName(),
              }
        })
    }
}
