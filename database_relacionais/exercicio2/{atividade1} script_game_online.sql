-- MySQL Script generated by MySQL Workbench
-- Sat Apr 24 20:41:18 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_generation_game_online
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_generation_game_online
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_generation_game_online` DEFAULT CHARACTER SET utf8 ;
USE `db_generation_game_online` ;

-- -----------------------------------------------------
-- Table `db_generation_game_online`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`category` (
  `category_id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`category_id`));


-- -----------------------------------------------------
-- Table `db_generation_game_online`.`category_1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`category_1` (
  `category_id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`category_id`));


-- -----------------------------------------------------
-- Table `db_generation_game_online`.`tb_classe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`tb_classe` (
  `id_classe` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(25) NOT NULL,
  `combatentes` TINYINT NOT NULL,
  `conjuradores` TINYINT NOT NULL,
  PRIMARY KEY (`id_classe`),
  UNIQUE INDEX `id_classe_UNIQUE` (`id_classe` ASC) VISIBLE);


-- -----------------------------------------------------
-- Table `db_generation_game_online`.`tb_personagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`tb_personagem` (
  `id_personagem` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(25) NOT NULL,
  `velocidade` INT NOT NULL,
  `poder_de_ataque` INT NOT NULL,
  `poder_de_defesa` INT NOT NULL,
  `resistencia` INT NOT NULL,
  `fk_classe` INT NOT NULL,
  PRIMARY KEY (`id_personagem`, `fk_classe`),
  UNIQUE INDEX `id_personagem_UNIQUE` (`id_personagem` ASC) VISIBLE,
  INDEX `fk_tb_personagem_tb_classe_idx` (`fk_classe` ASC) VISIBLE,
  CONSTRAINT `fk_tb_personagem_tb_classe`
    FOREIGN KEY (`fk_classe`)
    REFERENCES `db_generation_game_online`.`tb_classe` (`id_classe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;