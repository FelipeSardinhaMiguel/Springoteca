package br.com.felipe.springoteca.models;

import br.com.felipe.springoteca.enuns.StatusCompra;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_user;
    private Date dt_pedido;
    private double valorTotal;
    private StatusCompra status;
}
