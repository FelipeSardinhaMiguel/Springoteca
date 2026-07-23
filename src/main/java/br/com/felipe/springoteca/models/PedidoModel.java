package br.com.felipe.springoteca.models;

import br.com.felipe.springoteca.enuns.StatusCompra;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
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
    private Long idUser;
    private LocalDate dataPedido;
    private BigDecimal valorTotal;
    private StatusCompra status;
}
