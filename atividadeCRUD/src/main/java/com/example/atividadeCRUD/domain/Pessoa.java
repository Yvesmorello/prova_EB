package com.example.atividadeCRUD.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cpf;
    private Integer idade;
   // @OneToOne(fetch = FetchType.EAGER)
   // @JoinColumn (name = "trabalho_id")
   // public Trabalho trabalho;


}
