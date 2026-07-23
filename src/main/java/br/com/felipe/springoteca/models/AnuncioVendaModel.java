package br.com.felipe.springoteca.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "anuncioVenda")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnuncioVendaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUser; //id do user que está anunciando o livro
    private Long idLivro;
    private BigDecimal preco;
    private int qtdDisponivel;
    private LocalDate dataAnuncio;
}
