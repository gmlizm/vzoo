/* users */
CREATE TABLE users(
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    PASSWORD VARCHAR(50) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities (
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY(username) REFERENCES users(username)
);
CREATE UNIQUE INDEX ix_auth_username ON authorities (username,authority);


/* groups */
CREATE TABLE groups (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    group_name VARCHAR(50) NOT NULL
);

CREATE TABLE group_authorities (
    group_id BIGINT NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_group_authorities_group FOREIGN KEY(group_id) REFERENCES groups(id)
);

CREATE TABLE group_members (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    group_id BIGINT NOT NULL,
    CONSTRAINT fk_group_members_group FOREIGN KEY(group_id) REFERENCES groups(id)
);


/* persistent login */
CREATE TABLE persistent_logins (
    username VARCHAR(64) NOT NULL,
    series VARCHAR(64) PRIMARY KEY,
    token VARCHAR(64) NOT NULL,
    last_used TIMESTAMP NOT NULL
);