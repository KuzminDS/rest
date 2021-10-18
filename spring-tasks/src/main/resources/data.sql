DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  patronymic VARCHAR(250) DEFAULT NULL,
  email VARCHAR(250) DEFAULT NULL,
  number VARCHAR(250) DEFAULT NULL,
  password VARCHAR(250) DEFAULT NULL,
);

INSERT INTO users (first_name, last_name, patronymic, email, number, password) VALUES
    ('Петров', 'Петр', 'Петрович', 'user1@hosp.com', '123', 'user1'),
    ('Емельянов', 'Емельян', 'Емельянович', 'user2@hosp.com', '123', 'user2');
