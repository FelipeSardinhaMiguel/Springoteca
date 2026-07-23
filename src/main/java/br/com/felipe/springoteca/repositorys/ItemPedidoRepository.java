package br.com.felipe.springoteca.repositorys;

import br.com.felipe.springoteca.models.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, Long> {
}
