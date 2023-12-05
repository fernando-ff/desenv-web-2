package imd.ufrn.br.market.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class ProdutoPostDTO {
    @NotNull
    @NotEmpty
    private String nomeProduto;

    @NotNull
    @NotEmpty
    private String descricaoProduto;

    @NotNull
    @Min(value = 0)
    private Double precoProduto;

    @NotNull
    @NotEmpty
    private String dataValidade;

    @NotNull
    @Min(value = 0)
    private Integer estoque;

    @NotNull
    @NotEmpty
    private String fornecedor;
}