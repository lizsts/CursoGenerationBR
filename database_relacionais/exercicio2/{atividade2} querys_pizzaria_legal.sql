SELECT * FROM db_pizzaria_legal.tb_categoria;

INSERT INTO tb_categoria (massa, borda, doce) VALUES
("tradicional", "tradicional", false), 
("tradicional", "recheada com catupiry", false),
("pan", "recheada com cheddar", false), 
("fina", "tradicional", true); 

INSERT INTO tb_pizza(sabor, tamanho, preco, mesa, funcionário, fk_categoria) VALUES
("portuguesa", "grande", 50.00, 3, "João", 1),
("bacon", "individual", 28.00, 5, "João", 2),
("frango caipira", "familia", 85.00, 9, "Marta", 3), 
("palmito", "familia", 75.00, 7, "Roberta", 1),
("morango com chocolate", "media", 40.90, 10, "Roberta", 5), 
("banana com doce de leite", "media", 40.90, 3, "João", 5),
("quatro queijos", "grande", 60.50, 3, "Marta", 4), 
("camarão", "familia", 99.00, 15, "Marcos", 5); 

SELECT * FROM db_pizzaria_legal.tb_pizza;

SELECT * FROM db_pizzaria_legal.tb_pizza WHERE preco > 45.00; 

SELECT * FROM db_pizzaria_legal.tb_pizza WHERE preco > 29 and preco < 60; 

SELECT * FROM db_pizzaria_legal.tb_pizza WHERE sabor LIKE "%C%";

SELECT * FROM tb_categoria inner join tb_pizza on tb_categoria.id_categoria = tb_pizza.fk_categoria; 

SELECT * FROM tb_categoria inner join tb_pizza on tb_categoria.massa = "tradicional"; 