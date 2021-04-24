CREATE DATABASE db_cursoDaMinhaVida; 

USE db_cursoDaMinhaVida; 

CREATE TABLE tb_categoria(
id_categoria INT NOT NULL AUTO_INCREMENT,
setor VARCHAR(25) NOT NULL, 
gratuito BOOLEAN NOT NULL,
certificado BOOLEAN NOT NULL,
PRIMARY KEY (id_categoria),
UNIQUE INDEX category_id_UNIQUE (id_categoria ASC) VISIBLE); 

CREATE TABLE tb_curso(
id_curso INT NOT NULL AUTO_INCREMENT, 
nome_curso VARCHAR(25),
valor DECIMAL(6,2),
professor INT,
disponivel BOOLEAN, 
carga_horaria VARCHAR(0), 
fk_categoria INT NOT NULL, 
PRIMARY KEY (id_curso, fk_categoria), 
INDEX fk_tb_curso_tb_categoria_idx (fk_categoria ASC) VISIBLE, 
CONSTRAINT fk_tb_curso_tb_categoria 
FOREIGN KEY (fk_categoria) REFERENCES db_cursoDaMinhaVida.tb_categoria(id_categoria)
ON DELETE NO ACTION
ON UPDATE NO ACTION); 

SELECT * FROM tb_categoria; 
SELECT * FROM tb_curso; 

DELETE FROM tb_categoria; 
SET SQL_SAFE_UPDATES=0;

INSERT INTO tb_categoria(setor, gratuito, certificado) VALUES ("Gestão de projetos", 0, 1), 
("Tecnologia da informação", 1, 1), 
("Educação", 1, 1); 

ALTER TABLE tb_curso 
CHANGE nome_curso nome_curso VARCHAR(40);

INSERT INTO tb_curso(nome_curso, valor, professor, disponivel, carga_horaria, fk_categoria) VALUES ("métodos ágeis: SCRUM", 27.90, "Michelle", 1, "12h", 7),
("java: orientação a objetos", 0.0, "Luis", 0, "40h", 8), 
("metodologias ativas", 0.0, "Fernanda", 1, "20h", 9), 
("introdução ao devOps", 150.00, "Luciana", 1, "40h", 8); 

UPDATE tb_curso SET valor = 56.90 WHERE id_curso = 10;

SELECT * FROM tb_curso WHERE valor > 50.00; 

SELECT * FROM tb_curso WHERE valor BETWEEN 3.00 and 60.00; 

SELECT * FROM tb_curso WHERE nome_curso LIKE "%J%"; 

SELECT * FROM tb_curso INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_curso.fk_categoria; 

SELECT * FROM tb_curso INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_curso.fk_categoria WHERE setor LIKE "Tec%";  
SELECT * FROM tb_curso INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_curso.fk_categoria WHERE fk_categoria = 7; 

SET SQL_SAFE_UPDATES=1; 