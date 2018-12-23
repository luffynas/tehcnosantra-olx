-- -----------------------------------------------------
-- Table `olx`.`District`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `District` (
  `id` INT UNIQUE NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(75) NOT NULL,
  `description` TEXT(500) NULL,
  `thumbnail` VARCHAR(45) NULL,
  `created_at` TIMESTAMP NOT NULL DEFAULT current_timestamp,
  `updated_at` TIMESTAMP NULL DEFAULT current_timestamp,
  `zip_code` VARCHAR(9) NOT NULL,
  `city_id` INT NOT NULL,
  `province_id` INT NOT NULL,
  `country_id` INT NOT NULL,
  PRIMARY KEY (`id`, `city_id`, `province_id`, `country_id`),
  INDEX `fk_District_City1_idx` (`city_id` ASC, `province_id` ASC, `country_id` ASC));