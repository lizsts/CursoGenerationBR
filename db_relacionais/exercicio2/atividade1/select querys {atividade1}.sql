SELECT * FROM db_generation_game_online.tb_personagem WHERE  nome LIKE "%c%"; 


SELECT * FROM tb_personagem INNER JOIN tb_classe on tb_classe.id_classe = tb_personagem.fk_classe; 

SELECT * FROM tb_personagem INNER JOIN tb_classe on tb_classe.id_classe = tb_personagem.fk_classe WHERE tb_classe.nome LIKE "Magos"; 