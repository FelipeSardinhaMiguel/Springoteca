package br.com.felipe.springoteca.repositorys;

import br.com.felipe.springoteca.models.AnuncioVendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnuncioVendaRepository extends JpaRepository<AnuncioVendaModel, Long> {
}
