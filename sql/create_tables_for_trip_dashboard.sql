CREATE DATABASE `flight-system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

-- `flight-system`.airport definition

CREATE TABLE `airport` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `icao` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `airport_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.city definition

CREATE TABLE `city` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `country` varchar(20) NOT NULL,
  `continent` varchar(20) DEFAULT NULL,
  `description` longtext,
  PRIMARY KEY (`id`),
  UNIQUE KEY `city_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.city_airport definition

CREATE TABLE `city_airport` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `city_id` bigint NOT NULL,
  `airport_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `city_airport_id_uindex` (`id`),
  KEY `city_airport_airport_id_fk` (`airport_id`),
  KEY `city_airport_city_id_fk` (`city_id`),
  CONSTRAINT `city_airport_airport_id_fk` FOREIGN KEY (`airport_id`) REFERENCES `airport` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `city_airport_city_id_fk` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.city_poi definition

CREATE TABLE `city_poi` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `city_id` bigint NOT NULL,
  `poi_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `city_poi_id_uindex` (`id`),
  KEY `city_poi_city_id_fk` (`city_id`),
  KEY `city_poi_poi_id_fk` (`poi_id`),
  CONSTRAINT `city_poi_city_id_fk` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `city_poi_poi_id_fk` FOREIGN KEY (`poi_id`) REFERENCES `poi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.city_weather definition

CREATE TABLE `city_weather` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `city_id` bigint NOT NULL,
  `weather_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `city_weather_id_uindex` (`id`),
  KEY `city_weather_city_id_fk` (`city_id`),
  KEY `city_weather_weather_id_fk` (`weather_id`),
  CONSTRAINT `city_weather_city_id_fk` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `city_weather_weather_id_fk` FOREIGN KEY (`weather_id`) REFERENCES `weather` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.flight definition

CREATE TABLE `flight` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `flight_date` date NOT NULL,
  `dep_terminal` int DEFAULT NULL COMMENT 'departure terminal -- can be null',
  `dep_gate` varchar(10) DEFAULT NULL COMMENT 'departure gate',
  `dep_time_sch` timestamp NULL DEFAULT NULL COMMENT 'departure time scheduled',
  `dep_time_est` timestamp NULL DEFAULT NULL COMMENT 'departure time estimated',
  `arr_terminal` int DEFAULT NULL COMMENT 'arrival terminal -- can be null',
  `arr_gate` varchar(10) DEFAULT NULL COMMENT 'arrival gate',
  `arr_time_sch` timestamp NULL DEFAULT NULL COMMENT 'arrival time scheduled',
  `arr_time_est` timestamp NULL DEFAULT NULL COMMENT 'arrival time estimated',
  `icao` varchar(10) NOT NULL,
  `airline` varchar(20) DEFAULT NULL,
  `airplane` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `flight_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.flight_airport definition

CREATE TABLE `flight_airport` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `flight_id` bigint NOT NULL,
  `airport_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `flight_airport_id_uindex` (`id`),
  KEY `flight_airport_airport_id_fk` (`airport_id`),
  KEY `flight_airport_flight_id_fk` (`flight_id`),
  CONSTRAINT `flight_airport_airport_id_fk` FOREIGN KEY (`airport_id`) REFERENCES `airport` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `flight_airport_flight_id_fk` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.flight_city definition

CREATE TABLE `flight_city` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `flight_id` bigint NOT NULL,
  `origin_id` bigint DEFAULT NULL,
  `destination_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `flight_city_id_uindex` (`id`),
  KEY `flight_city_flight_id_fk` (`flight_id`),
  KEY `flight_city_destination_id_index` (`destination_id`),
  KEY `flight_city_origin_id_index` (`origin_id`),
  CONSTRAINT `flight_city_city_id_fk` FOREIGN KEY (`origin_id`) REFERENCES `city` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `flight_city_city_id_fk_2` FOREIGN KEY (`destination_id`) REFERENCES `city` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `flight_city_flight_id_fk` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.poi definition

CREATE TABLE `poi` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `type` enum('HOTEL','RESTAURANT','SIGHTSEEING','OTHER') NOT NULL,
  `address` text,
  `description` longtext,
  `rate` decimal(1,1) DEFAULT NULL,
  `comment` longtext,
  `url` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `poi_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.`user` definition

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) NOT NULL,
  `birth_date` date NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `table_name_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- `flight-system`.weather definition

CREATE TABLE `weather` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_time` datetime NOT NULL,
  `city` varchar(20) DEFAULT NULL,
  `weather_condition` varchar(20) DEFAULT NULL,
  `temperature` decimal(2,1) DEFAULT NULL COMMENT 'grad celcius',
  `wind` tinyint DEFAULT NULL COMMENT 'km/h',
  `humidity` decimal(3,2) DEFAULT NULL COMMENT 'percentage',
  `rain` decimal(3,2) DEFAULT NULL COMMENT 'percentage',
  PRIMARY KEY (`id`),
  UNIQUE KEY `weather_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;