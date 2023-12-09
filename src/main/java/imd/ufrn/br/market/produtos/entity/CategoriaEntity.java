package imd.ufrn.br.market.produtos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "categoria")
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_categoria", nullable = false, length = 50)
    private String nomeCategoria;

    @OneToMany(mappedBy = "categoria")
    private List<ProdutosEntity> produtos;
}