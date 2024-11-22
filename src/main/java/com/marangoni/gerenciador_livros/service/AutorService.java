package com.marangoni.gerenciador_livros.service;

import com.marangoni.gerenciador_livros.model.Autor;
import com.marangoni.gerenciador_livros.repository.AutorRepository;
import com.marangoni.gerenciador_livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private LivroRepository livroRepository;

    public Autor criarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public void removerAutor(Long id) {
        livroRepository.deleteByAutorId(id);
        autorRepository.deleteById(id);
    }
}
