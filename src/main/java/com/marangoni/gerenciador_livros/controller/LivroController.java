
package com.marangoni.gerenciador_livros.controller;

import com.marangoni.gerenciador_livros.model.Livro;
import com.marangoni.gerenciador_livros.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@Validated
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<Livro> criarLivro(@RequestBody @Valid Livro livro) {
        return ResponseEntity.status(HttpStatus.CREATED).body(livroService.criarLivro(livro));
    }

    @GetMapping
    public ResponseEntity<List<Livro>> listarLivrosPorAutor(@RequestParam Long autorId) {
        return ResponseEntity.ok(livroService.listarLivrosPorAutor(autorId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody @Valid Livro livroAtualizado) {
        return ResponseEntity.ok(livroService.atualizarLivro(id, livroAtualizado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerLivro(@PathVariable Long id) {
        livroService.removerLivro(id);
        return ResponseEntity.noContent().build();
    }
}
