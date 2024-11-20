package com.marangoni.gerenciador_livros.controller;

import com.marangoni.gerenciador_livros.model.Autor;
import com.marangoni.gerenciador_livros.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor) {
        return autorService.criarAutor(autor);
    }

    @GetMapping
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }

    @DeleteMapping("/{id}")
    public void removerAutor(@PathVariable Long id) {
        autorService.removerAutor(id);
    }
}
