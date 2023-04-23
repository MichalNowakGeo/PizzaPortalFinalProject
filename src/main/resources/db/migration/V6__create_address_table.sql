CREATE TABLE IF NOT EXISTS address
(
    id           BIGINT PRIMARY KEY NOT NULL,
    line1        VARCHAR(50),
    line2        VARCHAR(50),
    postal_code  VARCHAR(6),
    citi         VARCHAR(50),
    phone_number VARCHAR(15)
);
