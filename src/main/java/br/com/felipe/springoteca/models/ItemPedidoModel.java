package br.com.felipe.springoteca.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "itemPedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemPedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_pedido;
    private int quantidade;
    private double valor_unitario;
}
