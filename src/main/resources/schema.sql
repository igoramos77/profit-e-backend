CREATE TABLE product (
     id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
     name VARCHAR(255) NOT NULL,
     image VARCHAR (255) NOT NULL,
     old_price FLOAT NOT NULL,
     price FLOAT NOT NULL,
     description VARCHAR(500),
     instalments INT NOT NULL
);
