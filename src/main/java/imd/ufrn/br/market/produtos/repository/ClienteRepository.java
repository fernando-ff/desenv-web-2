package imd.ufrn.br.market.produtos.repository;

import imd.ufrn.br.market.produtos.entity.ClienteEntity;
import imd.ufrn.br.market.produtos.entity.PedidoEntity;
import imd.ufrn.br.market.produtos.entity.ProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
    Optional<ClienteEntity> findByIdAndAtivoTrue(Integer id);

    List<ClienteEntity> findAllByAtivoTrue();
}