package imd.ufrn.br.market.produtos.dto;

import imd.ufrn.br.market.produtos.entity.PedidoEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class ClienteDTO {
    @NotNull
    @NotEmpty
    private String nomeCliente;
    @NotNull
    @NotEmpty
    private List<PedidoEntity> pedidos;

}
