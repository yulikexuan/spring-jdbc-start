CREATE TABLE IF NOT EXISTS purchase (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product varchar(64) NOT NULL,
    price BIGINT NOT NULL
);