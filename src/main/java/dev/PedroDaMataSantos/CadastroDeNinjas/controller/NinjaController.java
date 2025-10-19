package dev.PedroDaMataSantos.CadastroDeNinjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem vindo ao cadastro de ninjas!";
    }


}
