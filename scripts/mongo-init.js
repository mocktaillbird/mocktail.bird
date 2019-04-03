db.auth("mockbird", "Ilovethisbird");
db.createUser({
    user: "adam",
    pwd: "adamjohn",
    roles: [ { role: "readWrite", db: "mocktail" },
             { role: "read", db: "reporting" } ]
  }
);
db = db.getSiblingDB('mocktail');
db.mock.createIndex( { "expireAt": 1 }, { expireAfterSeconds: 0 } );