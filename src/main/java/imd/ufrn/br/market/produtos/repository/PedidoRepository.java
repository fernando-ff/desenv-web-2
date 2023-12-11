package imd.ufrn.br.market.produtos.repository;


import imd.ufrn.br.market.produtos.dto.PedidoDTO;
import imd.ufrn.br.market.produtos.entity.ClienteEntity;
import imd.ufrn.br.market.produtos.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Integer> {
    Optional<PedidoEntity> findByIdAndAtivoTrue(Integer id);

    List<PedidoEntity> findAllByAtivoTrue();
}