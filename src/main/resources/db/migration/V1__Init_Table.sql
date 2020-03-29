CREATE TABLE users
(
    username VARCHAR(50)  NOT NULL PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    enabled  BOOLEAN      NOT NULL
) ENGINE = InnoDb;
CREATE TABLE authorities
(
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES users (username),
    UNIQUE INDEX authorities_idx_1 (username, authority)
) ENGINE = InnoDb;

CREATE TABLE customers
(
    id         BIGINT(50) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    firstname  VARCHAR(50)                         NOT NULL,
    lastname   VARCHAR(255)                        NOT NULL,
    email      VARCHAR(255)                        NOT NULL UNIQUE,
    added_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
) ENGINE = InnoDb;

INSERT INTO customers (id, firstname, lastname, email, added_date)
VALUES (1, 'Uchiha', 'Sasuke', 'uchiha_sasuke@konohagakure.com', '2020-03-29 07:52:34'),
       (2, 'Uzumaki', 'Naruto', 'uzumaki_naruto2@konohagakure.com', '2020-03-29 08:18:59'),
       (3, 'Uzumaki', 'Naruto', 'uzumaki_naruto3@konohagakure.com', '2020-03-29 08:18:59'),
       (4, 'Uzumaki', 'Naruto', 'uzumaki_naruto4@konohagakure.com', '2020-03-29 08:18:59'),
       (5, 'Uzumaki', 'Naruto', 'uzumaki_naruto5@konohagakure.com', '2020-03-29 08:18:59'),
       (6, 'Uzumaki', 'Naruto', 'uzumaki_naruto6@konohagakure.com', '2020-03-29 08:18:59'),
       (7, 'Uzumaki', 'Naruto', 'uzumaki_naruto7@konohagakure.com', '2020-03-29 08:18:59'),
       (8, 'Uzumaki', 'Naruto', 'uzumaki_naruto8@konohagakure.com', '2020-03-29 08:18:59'),
       (9, 'Uzumaki', 'Naruto', 'uzumaki_naruto9@konohagakure.com', '2020-03-29 08:18:59'),
       (10, 'Uzumaki', 'Naruto', 'uzumaki_naruto10@konohagakure.com', '2020-03-29 08:18:59'),
       (11, 'Uzumaki', 'Naruto', 'uzumaki_naruto11@konohagakure.com', '2020-03-29 08:18:59'),
       (12, 'Uzumaki', 'Naruto', 'uzumaki_naruto12@konohagakure.com', '2020-03-29 08:18:59'),
       (13, 'Uzumaki', 'Naruto', 'uzumaki_naruto13@konohagakure.com', '2020-03-29 08:18:59'),
       (14, 'Uzumaki', 'Naruto', 'uzumaki_naruto14@konohagakure.com', '2020-03-29 08:18:59'),
       (15, 'Uzumaki', 'Naruto', 'uzumaki_naruto15@konohagakure.com', '2020-03-29 08:18:59'),
       (16, 'Uzumaki', 'Naruto', 'uzumaki_naruto16@konohagakure.com', '2020-03-29 08:18:59'),
       (17, 'Uzumaki', 'Naruto', 'uzumaki_naruto17@konohagakure.com', '2020-03-29 08:18:59'),
       (18, 'Uzumaki', 'Naruto', 'uzumaki_naruto18@konohagakure.com', '2020-03-29 08:18:59'),
       (19, 'Uzumaki', 'Naruto', 'uzumaki_naruto19@konohagakure.com', '2020-03-29 08:18:59'),
       (20, 'Uzumaki', 'Naruto', 'uzumaki_naruto20@konohagakure.com', '2020-03-29 08:18:59');
