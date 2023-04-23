CREATE TABLE IF NOT EXISTS users
(
    username VARCHAR(255) PRIMARY KEY NOT NULL,
    password VARCHAR(255)             NOT NULL,
    enabled  BOOL DEFAULT TRUE,
    role     VARCHAR(30)              NOT NULL,
    CHECK (role IN ('ROLE_ADMIN', 'ROLE_EMPLOYEE', 'ROLE_USER'))
)