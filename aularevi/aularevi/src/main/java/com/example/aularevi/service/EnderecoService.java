package com.example.aularevi.service;

import com.example.aularevi.model.Endereco;
import com.example.aularevi.reporsitory.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    public List<Endereco> listarTodos() {
        return repository.findAll();
    }

    public Endereco buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado com id: " + id));
    }

    public Endereco criar(Endereco endereco) {
        return repository.save(endereco);
    }

    public Endereco atualizar(Long id, Endereco enderecoAtualizado) {
        Endereco endereco = buscarPorId(id);

        endereco.setCep(enderecoAtualizado.getCep());
        endereco.setLogradouro(enderecoAtualizado.getLogradouro());
        endereco.setNumero(enderecoAtualizado.getNumero());
        endereco.setCidade(enderecoAtualizado.getCidade());
        endereco.setUf(enderecoAtualizado.getUf());

        return repository.save(endereco);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}