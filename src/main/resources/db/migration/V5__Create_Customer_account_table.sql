CREATE TABLE IF NOT EXISTS customer_account
(
    id             BIGINT PRIMARY KEY NOT NULL,
    users_username VARCHAR(255)       NOT NULL,
    address_id     BIGINT
);