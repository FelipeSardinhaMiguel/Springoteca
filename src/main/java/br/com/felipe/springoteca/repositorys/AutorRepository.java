package br.com.felipe.springoteca.repositorys;

import br.com.felipe.springoteca.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}
