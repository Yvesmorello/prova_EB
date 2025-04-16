package com.example.atividadeCRUD.service;

import com.example.atividadeCRUD.domain.Pessoa;
import com.example.atividadeCRUD.domain.Trabalho;
import com.example.atividadeCRUD.repository.PessoaRepository;
import com.example.atividadeCRUD.repository.TrabalhoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository repository;

    public Trabalho create(Trabalho trabalho){
        return repository.save(trabalho);
    }

    public List<Trabalho> findAll(){
        return repository.findAll();
    }

    public Trabalho findById(Long id){
        Trabalho trabalhoFound = repository.findById(id).get();
        return trabalhoFound;
    }

    public Trabalho update(Long id, Trabalho trabalho){
        Trabalho trabalhoBanco = repository.findById(id).get();

       trabalhoBanco.setNome(trabalho.getNome());
       trabalhoBanco.setEndereco(trabalho.getEndereco());

        return repository.save(trabalhoBanco);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
