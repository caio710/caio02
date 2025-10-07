package com.example.aularevi.controller;

import com.example.aularevi.model.Endereco;
import com.example.aularevi .reporsitory.EnderecoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    private final EnderecoRepository repository;

    public EnderecoController(EnderecoRepository repository) {
        this.repository = repository;
    }

    // Listar todos os endereços
    @GetMapping
    public List<Endereco> listarTodos() {
        return repository.findAll();
    }

    // Buscar endereço por ID
    @GetMapping("/{id}")
    public Endereco buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado com id: " + id));
    }

    // Criar novo endereço
    @PostMapping
    public Endereco criar(@RequestBody Endereco endereco) {
        return repository.save(endereco);
    }

    // Atualizar endereço
    @PutMapping("/{id}")
    public Endereco atualizar(@PathVariable Long id, @RequestBody Endereco enderecoAtualizado) {
        Endereco endereco = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado com id: " + id));

        endereco.setCep(enderecoAtualizado.getCep());
        endereco.setLogradouro(enderecoAtualizado.getLogradouro());
        endereco.setNumero(enderecoAtualizado.getNumero());
        endereco.setCidade(enderecoAtualizado.getCidade());
        endereco.setUf(enderecoAtualizado.getUf());

        return repository.save(endereco);
    }

    // Deletar endereço
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}