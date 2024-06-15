package br.com.projeto.api.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.projeto.api.model.Cliente;

// @org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Cliente, Long> {

}
