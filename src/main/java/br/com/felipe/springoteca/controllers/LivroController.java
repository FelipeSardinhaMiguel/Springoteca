package br.com.felipe.springoteca.controllers;

import br.com.felipe.springoteca.models.LivroModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/livros")
public class LivroController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public LivroModel getById("/{id}"){
        return "livro tal";
    }
}
