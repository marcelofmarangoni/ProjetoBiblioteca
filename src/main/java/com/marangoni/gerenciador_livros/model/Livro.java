package com.marangoni.gerenciador_livros.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título do livro é obrigatório e não pode ser vazio")
    private String titulo;

    @NotBlank(message = "O gênero é obrigatório")
    private String genero;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
}