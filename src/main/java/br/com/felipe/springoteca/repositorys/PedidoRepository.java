package br.com.felipe.springoteca.repositorys;

import br.com.felipe.springoteca.models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
