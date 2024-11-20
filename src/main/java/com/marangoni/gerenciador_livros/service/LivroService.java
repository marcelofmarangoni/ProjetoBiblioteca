package com.marangoni.gerenciador_livros.service;

import com.marangoni.gerenciador_livros.model.Livro;
import com.marangoni.gerenciador_livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro criarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> listarLivrosPorAutor(Long autorId) {
        return livroRepository.findByAutorId(autorId);
    }

    public Livro atualizarLivro(Long id, Livro livroAtualizado) {
        livroAtualizado.setId(id);
        return livroRepository.save(livroAtualizado);
    }

    public void removerLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
