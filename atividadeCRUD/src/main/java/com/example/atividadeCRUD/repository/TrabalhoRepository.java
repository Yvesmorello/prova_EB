package com.example.atividadeCRUD.repository;

import com.example.atividadeCRUD.domain.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
}
