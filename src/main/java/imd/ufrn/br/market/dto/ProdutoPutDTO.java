package imd.ufrn.br.market.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoPutDTO {

    @NotNull
    private Integer id;
    private String nomeProduto;
    private String descricaoProduto;
    private Double precoProduto;
    private String dataValidade;
    private Integer estoque;
    private String fornecedor;
    private Integer ativo;
}
