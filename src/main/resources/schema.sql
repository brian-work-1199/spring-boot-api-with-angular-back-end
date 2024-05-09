CREATE SCHEMA IF NOT EXISTS employeemanager;

SET NAMES 'UTF8MB4';

SET TIME_ZONE = '+7:00';

USE employeemanager;

DROP TABLE IF EXISTS Employees;

CREATE TABLE Employees
(
    id           BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name         VARCHAR(50)     NOT NULL,
    email        VARCHAR(100)    NOT NULL,
    jobTitle     VARCHAR(50)     NOT NULL,
    phone        VARCHAR(30)  DEFAULT NULL,
    employeeCode VARCHAR(20)  DEFAULT NULL,
    imageUrl     VARCHAR(255) DEFAULT 'https://cdn-icons-png.flaticon.com/512/149/149071.png',
    CONSTRAINT UQ_Employees_Email UNIQUE (email)
);
