package com.testeunitario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testeunitario.Models.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
