CREATE TABLE IF NOT EXISTS ingredients
(
    id          BIGINT PRIMARY KEY NOT NULL,
    name        VARCHAR(255)       NOT NULL UNIQUE,
    description VARCHAR(255)       NOT NULL,
    available   BOOL DEFAULT TRUE,
    price       NUMERIC(10, 2)
);

CREATE UNIQUE INDEX idx_ingredients_name ON ingredients (name);
