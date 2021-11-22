#drop table to start as precaution
DROP DATABASE IF EXISTS adlister_db;

#create database
CREATE DATABASE adlister_db;

#use database just created
USE adlister_db;

#as precaution drop any tables that may already exist
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS ads;

#create table for users
CREATE TABLE users(
      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
      username VARCHAR(100) NOT NULL,
      email VARCHAR(255) NOT NULL,
      password VARCHAR(128) NOT NULL,
      PRIMARY KEY (id)
);

#create table for ads
CREATE TABLE ads(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    FOREIGN KEY (user_id) REFERENCES users (id),
    PRIMARY KEY (id)
);

SHOW TABLES;
DESCRIBE users;
DESCRIBE ads;

SELECT users.username FROM users;

