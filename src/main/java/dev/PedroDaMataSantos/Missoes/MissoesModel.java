package dev.PedroDaMataSantos.Missoes;

import dev.PedroDaMataSantos.CadastroDeNinjas.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    private String objetivo;

    private Integer dificuldade;

    @OneToMany
    private List<NinjaModel> ninja;

    public MissoesModel() {
    }
    public MissoesModel(String objetivo, int dificuldade) {
        this.objetivo = objetivo;
        this.dificuldade = dificuldade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        if(dificuldade<0 || dificuldade>10){
            throw new IllegalArgumentException("Dificuldade deve estar entre 0 e 10");
        }
        this.dificuldade = dificuldade;
    }
}
