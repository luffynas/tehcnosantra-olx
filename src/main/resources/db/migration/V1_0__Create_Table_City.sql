-- -----------------------------------------------------
-- Table `olx`.`City`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS city (
  `id` INT UNIQUE NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT(500) NULL,
  `thumbnail` VARCHAR(45) NULL,
  `created_at` TIMESTAMP NOT NULL DEFAULT current_timestamp,
  `updated_at` TIMESTAMP NULL DEFAULT current_timestamp,
  `province_id` INT NOT NULL,
  `country_id` INT NOT NULL,
  PRIMARY KEY (id)
  )ENGINE=InnoDB DEFAULT CHARSET=UTF8MB3;
