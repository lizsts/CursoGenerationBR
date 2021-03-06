-- MySQL Script generated by MySQL Workbench
-- Thu Apr 22 20:43:17 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_pizzaria_legal
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_pizzaria_legal
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_pizzaria_legal` DEFAULT CHARACTER SET utf8 ;
USE `db_pizzaria_legal` ;

-- -----------------------------------------------------
-- Table `db_pizzaria_legal`.`tb_categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria_legal`.`tb_categoria` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `massa` VARCHAR(25) NOT NULL,
  `borda` VARCHAR(40) NOT NULL,
  `doce` TINYINT NOT NULL,
  PRIMARY KEY (`id_categoria`),
  UNIQUE INDEX `id_categoria_UNIQUE` (`id_categoria` ASC) VISIBLE);


-- -----------------------------------------------------
-- Table `db_pizzaria_legal`.`tb_pizza`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria_legal`.`tb_pizza` (
  `id_pizza` INT NOT NULL AUTO_INCREMENT,
  `sabor` VARCHAR(50) NOT NULL,
  `tamanho` VARCHAR(25) NOT NULL,
  `preco` DECIMAL(4,2) NOT NULL,
  `mesa` INT NOT NULL,
  `funcionário` VARCHAR(35) NOT NULL,
  `fk_categoria` INT NOT NULL,
  PRIMARY KEY (`id_pizza`, `fk_categoria`),
  INDEX `fk_tb_pizza_tb_categoria_idx` (`fk_categoria` ASC) VISIBLE,
  CONSTRAINT `fk_tb_pizza_tb_categoria`
    FOREIGN KEY (`fk_categoria`)
    REFERENCES `db_pizzaria_legal`.`tb_categoria` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
