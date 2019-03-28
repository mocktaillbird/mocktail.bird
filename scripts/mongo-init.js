use admin;

db.auth("mockbird", "Ilovethisbird");

db.createUser({
    user: "adam",
    pwd: "adamjohn",
    roles: [ { role: "readWrite", db: "mocktail" },
             { role: "read", db: "reporting" } ]
  }
);