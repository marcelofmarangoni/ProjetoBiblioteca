package com.marangoni.gerenciador_livros.controller;

import com.marangoni.gerenciador_livros.model.Livro;
import com.marangoni.gerenciador_livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro criarLivro(@RequestBody Livro livro) {
        return livroService.criarLivro(livro);
    }

    @GetMapping
    public List<Livro> listarLivrosPorAutor(@RequestParam Long autorId) {
        return livroService.listarLivrosPorAutor(autorId);
    }

    @PutMapping("/{id}")
    public Livro atualizarLivro(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        return livroService.atualizarLivro(id, livroAtualizado);
    }

    @DeleteMapping("/{id}")
    public void removerLivro(@PathVariable Long id) {
        livroService.removerLivro(id);
    }
}
