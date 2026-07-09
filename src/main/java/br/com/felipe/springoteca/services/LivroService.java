package br.com.felipe.springoteca.services;

import br.com.felipe.springoteca.models.LivroModel;
import br.com.felipe.springoteca.repositorys.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    public final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public LivroModel getById(Long id)
    {
        return livroRepository.findById(id).orElse(null);
    }

}
