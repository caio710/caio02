package com.example.aularevi.service;

import com.example.aularevi.model.Funcionario;
import com.example.aularevi.reporsitory.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public List<Funcionario> listarTodos() {
        return repository.findAll();
    }

    public Funcionario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado com id: " + id));
    }

    public Funcionario criar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public Funcionario atualizar(Long id, Funcionario funcionarioAtualizado) {
        Funcionario funcionario = buscarPorId(id);

        funcionario.setNome(funcionarioAtualizado.getNome());
        funcionario.setMatricula(funcionarioAtualizado.getMatricula());
        funcionario.setDataNascimento(funcionarioAtualizado.getDataNascimento());
        funcionario.setSalario(funcionarioAtualizado.getSalario());
        funcionario.setEmail(funcionarioAtualizado.getEmail());
        funcionario.setEndereco(funcionarioAtualizado.getEndereco());

        return repository.save(funcionario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}