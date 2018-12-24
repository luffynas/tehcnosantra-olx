-- -----------------------------------------------------
-- Table `olx`.`Village`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `village` (
  `id` INT UNIQUE NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(75) NOT NULL,
  `description` TEXT(500) NULL,
  `thumbnail` VARCHAR(45) NULL,
  `created_at` TIMESTAMP NOT NULL DEFAULT current_timestamp,
  `updated_at` TIMESTAMP NULL DEFAULT current_timestamp,
  `district_id` INT NOT NULL,
  `city_id` INT NOT NULL,
  `province_id` INT NOT NULL,
  `country_id` INT NOT NULL,
  PRIMARY KEY (id)
  )ENGINE=InnoDB DEFAULT CHARSET=UTF8MB3;

--DB: 'utf8' is currently an alias for the character set UTF8MB3