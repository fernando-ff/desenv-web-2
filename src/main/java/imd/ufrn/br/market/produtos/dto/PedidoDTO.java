package imd.ufrn.br.market.produtos.dto;

import imd.ufrn.br.market.produtos.entity.ClienteEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PedidoDTO {
    @NotNull
    @NotEmpty
    private List<Integer> produtoId;
    @NotNull
    @NotEmpty
    private Integer clienteId;
    @NotNull
    @NotEmpty
    private Integer quantidade;
}
