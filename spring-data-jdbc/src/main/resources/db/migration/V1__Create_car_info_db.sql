CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Создание таблицы Continent
CREATE TABLE continent
(
    continent_id UUID PRIMARY KEY,
    name         VARCHAR(255) NOT NULL
);

-- Создание таблицы Country
CREATE TABLE country
(
    country_id   UUID PRIMARY KEY,
    name         VARCHAR(255) NOT NULL,
    continent_id UUID REFERENCES continent (continent_id)
);

-- Создание таблицы Manufacturer
CREATE TABLE manufacturer
(
    manufacturer_id UUID PRIMARY KEY,
    name            VARCHAR(255) NOT NULL,
    country_id      UUID REFERENCES country (country_id)
);

-- Создание таблицы Car
CREATE TABLE car
(
    car_id          UUID PRIMARY KEY,
    model           VARCHAR(255) NOT NULL,
    year            INT,
    manufacturer_id UUID REFERENCES manufacturer (manufacturer_id)
);

-- Создание таблицы Owner
CREATE TABLE owner
(
    owner_id UUID PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    car_id   UUID REFERENCES car (car_id)
);

-- Создание таблицы ServiceHistory
CREATE TABLE service_history
(
    history_id   UUID PRIMARY KEY,
    service_date DATE NOT NULL,
    details      TEXT,
    car_id       UUID REFERENCES car (car_id)
);

-- Создание таблицы CarFeatures
CREATE TABLE car_features
(
    feature_id   UUID PRIMARY KEY,
    feature_name VARCHAR(255) NOT NULL,
    car_id       UUID REFERENCES car (car_id)
);