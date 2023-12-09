package imd.ufrn.br.market.produtos.repository;

import imd.ufrn.br.market.produtos.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {
}