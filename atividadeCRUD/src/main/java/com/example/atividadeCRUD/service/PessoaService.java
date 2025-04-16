package com.example.atividadeCRUD.service;

import com.example.atividadeCRUD.domain.Pessoa;
import com.example.atividadeCRUD.repository.PessoaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa create(Pessoa pessoa){
        return repository.save(pessoa);
    }

    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    public Pessoa findById(Long id){
        Pessoa pessoaFound = repository.findById(id).get();
        return pessoaFound;
    }

    public Pessoa update(Long id, Pessoa pessoa){
        Pessoa pessoaBanco = repository.findById(id).get();

        pessoaBanco.setIdade(pessoa.getIdade());
        pessoaBanco.setCpf(pessoa.getCpf());

        return repository.save(pessoaBanco);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
