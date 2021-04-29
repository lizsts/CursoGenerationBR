SELECT * FROM db_farmacia_do_bem.tb_categoria; 

INSERT INTO tb_categoria(setor, cartao, dinheiro) VALUES ("medicamentos", true, false), 
("pele e cabelo", true, false), 
("assepsia", false, true), 
("alimentos", false, true);  

SELECT * FROM db_farmacia_do_bem.tb_produtos;

INSERT INTO tb_produtos(nome, preco, quantidade, marca_da_loja, farmacia_popular, fk_produtos) VALUES 
("Nimesulida", 12.00, 5, false, true, 1), 
("Cetaphil", 149.00, 8, false, false, 2), 
("Algodão", 15.00, 9, true, false, 3), 
("Barra de cereal", 5.00, 19, false, false, 4); 

UPDATE tb_produtos SET preco = 11.50, quantidade = 14 WHERE id_produtos = 2;  

ALTER TABLE tb_produtos 
CHANGE preco preco DECIMAL (5,2); 

SELECT * FROM tb_produtos WHERE preco > 50.00; 

SELECT * FROM tb_produtos WHERE preco BETWEEN 3 and 60; 

SELECT * FROM tb_produtos WHERE nome LIKE "%B%"; 

SELECT * FROM tb_categoria INNER JOIN tb_produtos ON tb_categoria.id_categoria = fk_produtos; 

SELECT * FROM tb_categoria INNER JOIN tb_produtos ON tb_categoria.id_categoria = fk_produtos WHERE id_categoria = 1; 