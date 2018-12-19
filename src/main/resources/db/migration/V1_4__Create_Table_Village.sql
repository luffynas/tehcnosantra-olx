-- -----------------------------------------------------
-- Table `olx`.`Village`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olx`.`Village` (
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
  PRIMARY KEY (`id`, `district_id`, `city_id`, `province_id`, `country_id`),
  INDEX `fk_Village_District1_idx` (`district_id` ASC, `city_id` ASC, `province_id` ASC, `country_id` ASC));
