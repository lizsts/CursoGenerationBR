CREATE DATABASE db_construindo_a_nossa_vida; 

USE db_construindo_a_nossa_vida; 

CREATE TABLE tb_categoria(
id_categoria INT NOT NULL AUTO_INCREMENT,
setor VARCHAR(25) NOT NULL, 
entrega BOOLEAN NOT NULL,
forma_pagamento VARCHAR(20) NOT NULL,
PRIMARY KEY (id_categoria),
UNIQUE INDEX category_id_UNIQUE (id_categoria ASC) VISIBLE); 

CREATE TABLE tb_produto(
id_produto INT NOT NULL AUTO_INCREMENT, 
nome VARCHAR(25),
preco DECIMAL(6,2),
quantidade INT,
disponivel BOOLEAN, 
vendedor VARCHAR(25), 
fk_categoria INT NOT NULL, 
PRIMARY KEY (id_produto, fk_categoria), 
INDEX fk_tb_produto_tb_categoria_idx (fk_categoria ASC) VISIBLE, 
CONSTRAINT fk_tb_produto_tb_categoria 
FOREIGN KEY (fk_categoria) REFERENCES db_construindo_a_nossa_vida.tb_categoria(id_categoria)
ON DELETE NO ACTION
ON UPDATE NO ACTION); 

SELECT * FROM tb_categoria; 
SELECT * FROM tb_produto; 

INSERT INTO tb_categoria(setor, entrega, forma_pagamento) VALUES ("elétrico", 1, "dinheiro"),
("hidráulico", 0, "crédito"), 
("construção", 0, "débito"); 

INSERT INTO tb_produto(nome, preco, quantidade, disponivel, vendedor, fk_categoria) VALUES ("aganassa", 25.00, 5, 1, "Maurício", 3),
("cano", 12.00, 1, 1 , "Carlos", 2),
("torneira", 89.50, 3, 1, "Carlos", 2),
("lâmapada led", 58.00, 3, 1, "Maria", 1); 


SELECT * FROM tb_produto WHERE valor > 50.00; 

SELECT * FROM tb_produto WHERE valor BETWEEN 3.00 and 60.00; 

SELECT * FROM tb_produto WHERE nome_curso LIKE "%C%"; 

SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_produto.fk_categoria; 
USE db_construindo_a_nossa_vida;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_produto.fk_categoria WHERE fk_categoria = 2; 

