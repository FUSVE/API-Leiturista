package br.edu.universidadedevassouras.reository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.universidadedevassouras.model.Leiturista;

@Repository
public interface LeituristaRepository extends JpaRepository<Leiturista, Long> {

}
