package dev.PedroDaMataSantos.CadastroDeNinjas.model;

import dev.PedroDaMataSantos.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data //getters e setter
@NoArgsConstructor //construtor no args
@AllArgsConstructor //construtor all args

public class NinjaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column

    private Long id;

     private String nome;

     private String email;

     private int idade;

     @ManyToOne
     @JoinColumn(name="missoes_id") //Foreing key
     private MissoesModel  missoes;



}
