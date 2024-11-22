package com.marangoni.gerenciador_livros.repository;

import com.marangoni.gerenciador_livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByAutorId(Long autorId);

    void deleteByAutorId(Long autorId);
}
