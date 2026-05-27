package br.com.felipe.springoteca.controllers;

import br.com.felipe.springoteca.models.LivroModel;
import br.com.felipe.springoteca.services.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LivroModel getLivroById(@PathVariable Long id){
        return livroService.getById(id);
    }
}
