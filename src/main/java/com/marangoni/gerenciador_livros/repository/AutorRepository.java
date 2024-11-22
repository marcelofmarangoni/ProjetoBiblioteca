package com.marangoni.gerenciador_livros.repository;

import com.marangoni.gerenciador_livros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}