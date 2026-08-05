package br.com.felipe.springoteca.services;

import br.com.felipe.springoteca.models.LivroModel;
import br.com.felipe.springoteca.repositorys.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    //construtor do repository do livro
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    //buscar um livro pelo id
    public LivroModel getById(Long id)
    {
        return livroRepository.findById(id).orElse(null);
    }

    //cadastrar um livro
    public LivroModel cadastrarLivro(LivroModel livro)
    {
        return livroRepository.save(livro);
    }

    //buscar todos os livros
    public List<LivroModel> listarLivros()
    {
        return livroRepository.findAll();
    }
}
