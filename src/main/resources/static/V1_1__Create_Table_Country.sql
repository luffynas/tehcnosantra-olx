-- -----------------------------------------------------
-- Table `olx`.`Country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Country` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `country_name` VARCHAR(30) NULL,
  `country_code` VARCHAR(15) NULL,
  `iso_code` VARCHAR(10) NULL,
  `currency_code_a` VARCHAR(3) NULL,
  `currency_code_n` VARCHAR(3) NULL,
  `currency_name` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));