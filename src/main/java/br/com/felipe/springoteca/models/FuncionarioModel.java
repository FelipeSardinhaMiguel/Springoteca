package br.com.felipe.springoteca.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "funcionario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String f_name;
    private String m_name;
    private String sm_name;
    private String l_name;
    private double salario;
    private double comissao;
    private int qtdLivroVendido;
}
