package com.testeunitario.Contatos;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.testeunitario.Models.ContatoModel;
import com.testeunitario.Repository.ContatoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContatosRepositoryIntegrationTest {

	private ContatoModel contato;

	@Autowired
	private ContatoRepository contatoRepository;

	@Before
	public void start() {
		contato = new ContatoModel("Liz", "011", "957121456");
	}
	@Test(expected = RuntimeException.class)
	public void salvarComTelNulo() throws Exception {
		contato.setTelefone(null);
		contatoRepository.save(contato);

	}
	@Test(expected = RuntimeException.class)
	public void salvarComDddNulo() throws Exception {
		contato.setDdd(null);
		contatoRepository.save(contato);
	}
    @Test(expected = RuntimeException.class)
	public void salvarComNomeNulo() throws Exception {
		contato.setNome(null);
		contatoRepository.save(contato);
	}
}
