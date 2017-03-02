/**
 * Created by yduartep on 3/2/2017.
 */
module.exports = function() {
    var faker = require("faker");
    var _ = require("lodash");

    return {
        division: _.times(6, function(n) {
            return {
                "name": faker.name.firstName(),
                "priority": faker.random.number(),
                "id": faker.random.uuid()
            }
        }),
        game: _.times(20, function(n) {
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
        person: _.times(10, function(n) {
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
        })
    }
};