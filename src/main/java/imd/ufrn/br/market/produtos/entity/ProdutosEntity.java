package imd.ufrn.br.market.produtos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Builder
@Data
@Entity
@Table(name = "produto")
@NoArgsConstructor
@AllArgsConstructor
public class ProdutosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeProduto;

    private Integer estoqueProduto;

    private Boolean ativo;

    private String fornecedorProduto;

    private Double precoCompraProduto;

    private Double precoVendaProduto;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;

    @ManyToMany(mappedBy = "produtos")
    private List<PedidoEntity> pedidos;
}