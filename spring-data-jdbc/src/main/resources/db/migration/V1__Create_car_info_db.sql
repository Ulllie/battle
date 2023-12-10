CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Создание таблицы Continent
CREATE TABLE Continent
(
    continent_id UUID PRIMARY KEY,
    name         VARCHAR(255) NOT NULL
);

-- Создание таблицы Country
CREATE TABLE Country
(
    country_id   UUID PRIMARY KEY,
    name         VARCHAR(255) NOT NULL,
    continent_id UUID REFERENCES Continent (continent_id)
);

-- Создание таблицы Manufacturer
CREATE TABLE Manufacturer
(
    manufacturer_id UUID PRIMARY KEY,
    name            VARCHAR(255) NOT NULL,
    country_id      UUID REFERENCES Country (country_id)
);

-- Создание таблицы Car
CREATE TABLE Car
(
    car_id          UUID PRIMARY KEY,
    model           VARCHAR(255) NOT NULL,
    year            INT,
    manufacturer_id UUID REFERENCES Manufacturer (manufacturer_id)
);

-- Создание таблицы Owner
CREATE TABLE Owner
(
    owner_id UUID PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    car_id   UUID REFERENCES Car (car_id)
);

-- Создание таблицы ServiceHistory
CREATE TABLE ServiceHistory
(
    history_id   UUID PRIMARY KEY,
    service_date DATE NOT NULL,
    details      TEXT,
    car_id       UUID REFERENCES Car (car_id)
);

-- Создание таблицы CarFeatures
CREATE TABLE CarFeatures
(
    feature_id   UUID PRIMARY KEY,
    feature_name VARCHAR(255) NOT NULL,
    car_id       UUID REFERENCES Car (car_id)
);