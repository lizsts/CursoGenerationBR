SELECT * FROM db_generation_game_online.tb_classe; 

INSERT INTO tb_classe(nome, combatentes, conjuradores) VALUES ("Magos", false, true), 
("Guerreiros", true, false), 
("Paladinos", true, true), 
("Vikings", true, false); 

  
INSERT INTO tb_personagem(nome, velocidade, poder_de_ataque, poder_de_defesa, resistencia, fk_classe) VALUES 
("Luis", 60, 3000, 500, 56, 1), 
("Toco", 50, 2500, 80, 50, 2), 
("Carol", 100, 1050, 600, 50, 3); 

SELECT * FROM db_generation_game_online.tb_personagem; 

SELECT * FROM db_generation_game_online.tb_personagem WHERE poder_de_ataque > 2000; 

SELECT * FROM db_generation_game_online.tb_personagem WHERE poder_de_defesa BETWEEN 1000 and 2000; 

SELECT * FROM db_generation_game_online.tb_personagem WHERE  nome LIKE "%c%"; 

SELECT * FROM tb_personagem INNER JOIN tb_classe on tb_classe.id_classe = tb_personagem.fk_classe; 

SELECT * FROM tb_personagem INNER JOIN tb_classe on tb_classe.id_classe = tb_personagem.fk_classe WHERE tb_classe.nome LIKE "Magos"; 