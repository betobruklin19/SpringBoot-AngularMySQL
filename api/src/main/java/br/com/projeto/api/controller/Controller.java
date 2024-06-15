package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Cliente;
import br.com.projeto.api.repository.Repository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private Repository repository;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar() {
        return repository.findAll();
    }

    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable long codigo) {
        repository.deleteById(codigo);
    }

}
