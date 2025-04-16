package com.example.atividadeCRUD.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "TB_TRABALHO")
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    //@OneToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "pessoa_id")
//public Pessoa pessoa;
}

