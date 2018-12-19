-- -----------------------------------------------------
-- Table `olx`.`City`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olx`.`City` (
  `id` INT UNIQUE NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT(500) NULL,
  `thumbnail` VARCHAR(45) NULL,
  `created_at` TIMESTAMP NOT NULL DEFAULT current_timestamp,
  `updated_at` TIMESTAMP NULL DEFAULT current_timestamp,
  `province_id` INT NOT NULL,
  `country_id` INT NOT NULL,
  PRIMARY KEY (`id`, `province_id`, `country_id`),
  INDEX `fk_City_Province1_idx` (`province_id` ASC, `country_id` ASC));