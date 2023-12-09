package imd.ufrn.br.market.produtos.repository;


import imd.ufrn.br.market.produtos.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Integer> {
}