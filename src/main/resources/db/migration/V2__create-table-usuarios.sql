DROP TABLE IF EXISTS usuarios;
CREATE TABLE usuarios(
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         login VARCHAR(255) NOT NULL UNIQUE,
                         password VARCHAR(255) NOT NULL,
                         role VARCHAR(255) NOT NULL
);