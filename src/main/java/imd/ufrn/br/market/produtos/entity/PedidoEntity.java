package imd.ufrn.br.market.produtos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "pedido")
@AllArgsConstructor
@NoArgsConstructor
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero_pedido", nullable = false)
    private String numeroPedido;


    // One-to-Many relationship with ProdutosEntity
    @OneToMany(mappedBy = "pedido")
    private List<ProdutosEntity> produtos;
}