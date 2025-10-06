package dev.PedroDaMataSantos.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem vindo ao cadastro de ninjas!";
    }


}
