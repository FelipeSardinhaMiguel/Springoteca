package br.com.felipe.springoteca.models;

import jakarta.persistence.*;
import lombok.*;

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
    private Long id_user; //id do user que está anunciando o livro
    private Long id_livro;
    private double preco;
    private int qtd_disponivel;
    private Date dt_anuncio;
}
