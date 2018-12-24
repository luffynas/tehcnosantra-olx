-- -----------------------------------------------------
-- Table `olx`.`Province`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `province` (
  `id` INT UNIQUE NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` TEXT(500) NULL,
  `thumbnail` VARCHAR(45) NULL,
  `created_at` TIMESTAMP NOT NULL DEFAULT current_timestamp,
  `updated_at` TIMESTAMP NULL DEFAULT current_timestamp,
  `country_id` INT NOT NULL,
  PRIMARY KEY (`id`, `country_id`),
  INDEX `fk_Province_country_idx` (`country_id` ASC)
  )ENGINE=InnoDB DEFAULT CHARSET=UTF8MB3;