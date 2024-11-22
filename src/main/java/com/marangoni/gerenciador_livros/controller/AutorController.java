package com.marangoni.gerenciador_livros.controller;

import com.marangoni.gerenciador_livros.model.Autor;
import com.marangoni.gerenciador_livros.service.AutorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<Autor> criarAutor(@RequestBody @Valid Autor autor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(autorService.criarAutor(autor));
    }

    @GetMapping
    public ResponseEntity<List<Autor>> listarAutores() {
        return ResponseEntity.ok(autorService.listarAutores());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerAutor(@PathVariable Long id) {
        autorService.removerAutor(id);
        return ResponseEntity.noContent().build();
    }
}