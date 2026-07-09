package br.com.felipe.springoteca.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "livros")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LivroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Long idAutor;
    private Long idEditora;
    private Integer quantidade;
    //Anotação que serve para informar o jpa que o atributo abaixo (dataPublicacao) é o nome da coluna no sql (dtPublicacao); informando que é not null
    @Column(name = "dtPublicacao", nullable = false)
    private LocalDate dataPublicacao;
}
