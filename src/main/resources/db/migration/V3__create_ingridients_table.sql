CREATE TABLE IF NOT EXISTS ingridients (
                                     id VARCHAR(255) PRIMARY KEY NOT NULL,
                                     name VARCHAR(255) NOT NULL,
                                     description VARCHAR(255) NOT NULL,
                                     available BOOL DEFAULT TRUE,
                                     price NUMERIC(10,2)
);
