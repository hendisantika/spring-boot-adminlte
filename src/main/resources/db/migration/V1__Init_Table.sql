CREATE TABLE users (
  username VARCHAR(50)  NOT NULL PRIMARY KEY,
  password VARCHAR(255) NOT NULL,
  enabled  BOOLEAN      NOT NULL
)
  ENGINE = InnoDb;
CREATE TABLE authorities (
  username  VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users (username),
  UNIQUE INDEX authorities_idx_1 (username, authority)
)
  ENGINE = InnoDb;

CREATE TABLE customers (
  id         BIGINT(50)   NOT NULL PRIMARY KEY,
  firstname  VARCHAR(50)  NOT NULL,
  lastname   VARCHAR(255) NOT NULL,
  email      VARCHAR(255) NOT NULL UNIQUE,
  added_date TIMESTAMP    NOT NULL
)
  ENGINE = InnoDb;
