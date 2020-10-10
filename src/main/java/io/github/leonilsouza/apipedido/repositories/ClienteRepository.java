package io.github.leonilsouza.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.github.leonilsouza.apipedido.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	@Transactional(readOnly=true)// Melhora a performance de pesquisa no banco
	Cliente findByEmail(String email);

}
