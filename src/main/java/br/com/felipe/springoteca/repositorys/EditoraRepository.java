package br.com.felipe.springoteca.repositorys;

import br.com.felipe.springoteca.models.EditoraModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditoraRepository extends JpaRepository<EditoraModel, Long> {
}
