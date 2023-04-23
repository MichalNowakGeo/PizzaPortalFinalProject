CREATE TABLE IF NOT EXISTS address
(
    id           BIGINT PRIMARY KEY NOT NULL,
    line1        VARCHAR(50)        NOT NULL,
    line2        VARCHAR(50)        NOT NULL,
    postal_code  VARCHAR(6)         NOT NULL,
    citi         VARCHAR(50)        NOT NULL,
    phone_number VARCHAR(15)        NOT NULL,
);
