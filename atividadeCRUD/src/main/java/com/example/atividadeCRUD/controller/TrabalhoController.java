package com.example.atividadeCRUD.controller;

import com.example.atividadeCRUD.domain.Pessoa;
import com.example.atividadeCRUD.domain.Trabalho;
import com.example.atividadeCRUD.service.PessoaService;
import com.example.atividadeCRUD.service.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {

    @Autowired
    private TrabalhoService service;

    @PostMapping
    public ResponseEntity<Trabalho> create(@RequestBody Trabalho trabalho){
        service.create(trabalho);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .build().toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<List<Trabalho>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trabalho> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trabalho> update(@PathVariable Long id,@RequestBody Trabalho trabalho){
        return ResponseEntity.ok(service.update(id, trabalho));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
       service.delete(id);
       return ResponseEntity.noContent().build();
    }
}
