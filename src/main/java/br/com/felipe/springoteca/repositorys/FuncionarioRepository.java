package br.com.felipe.springoteca.repositorys;

import br.com.felipe.springoteca.models.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
}
