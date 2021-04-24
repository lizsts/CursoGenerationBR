CREATE DATABASE db_cidade_das_carnes; 
USE db_cidade_das_carnes; 

CREATE TABLE tb_categorias(
id_categoria INT NOT NULL AUTO_INCREMENT, 
carnes BOOLEAN, 
aves BOOLEAN, 
cortes_nobres BOOLEAN,
PRIMARY KEY (id_categoria), 
UNIQUE INDEX category_id_UNIQUE(id_categoria ASC) VISIBLE); 

CREATE TABLE tb_produtos(
id_produto INT NOT NULL AUTO_INCREMENT, 
tipo_corte VARCHAR(25), 
peso DECIMAL (6,1), 
preco DECIMAL (8,2),
cartao BOOLEAN, 
dinheiro BOOLEAN,
PRIMARY KEY (id_produto), 
fk_categoria INT NOT NULL,
UNIQUE INDEX category_id_UNIQUE(id_produto ASC) VISIBLE,
  CONSTRAINT fk_tb_produtos_tb_categorias 
    FOREIGN KEY (fk_categoria)
    REFERENCES db_cidade_das_carnes.tb_categorias(id_categoria)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


SELECT * FROM tb_categorias; 

INSERT INTO tb_categorias(carnes, aves, cortes_nobres) VALUES (true, false, false), 
(false, false, true), 
(false, true, false), 
(true, false, false); 

ALTER TABLE tb_produtos
CHANGE peso peso VARCHAR(25) NOT NULL;

INSERT INTO tb_produtos(tipo_corte, peso, preco, cartao, dinheiro, fk_categoria) VALUES 
("maminha", "1,5KG", 56.00, 1, 0, 1), 
("T-bone", "1KG", 85.00, 0, 1, 2), 
("Coxa de frango", "2,5KG", 25.00, 0, 1, 3), 
("Carne moída", "500g", 17.00, 0, 1, 4); 

SELECT * FROM tb_produtos; 

SELECT * FROM tb_produtos WHERE preco > 50.00;

SELECT * FROM tb_produtos WHERE preco BETWEEN 3.00 AND 60.00;

SELECT * FROM tb_produtos WHERE tipo_corte LIKE "%C%"; 

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_categoria; 

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_categoria WHERE carnes = true; 