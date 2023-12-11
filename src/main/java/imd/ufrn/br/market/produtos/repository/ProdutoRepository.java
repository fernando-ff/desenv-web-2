package imd.ufrn.br.market.produtos.repository;

import imd.ufrn.br.market.produtos.entity.ProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<ProdutosEntity, Integer> {

    Optional<ProdutosEntity> findByIdAndAtivoTrue(Integer id);

    List<ProdutosEntity> findAllByAtivoTrue();}
