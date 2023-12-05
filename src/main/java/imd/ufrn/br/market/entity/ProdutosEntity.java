package imd.ufrn.br.market.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@Entity
@Table(name = "produto")
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_produto", nullable = false, length = 50)
    private String nomeProduto;

    @Column(name = "descricao_produto", nullable = false, length = 100)
    private String descricaoProduto;

    @Column(name = "preco_produto")
    private Double precoProduto;

    @Column(name = "data_validade", length = 15)
    private String dataValidade;

    @Column(name = "estoque")
    private Integer estoque;

    @Column(name = "fornecedor", length = 50)
    private String fornecedor;

    @Column(name = "ativo")
    private Integer ativo;
}
