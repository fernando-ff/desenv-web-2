package imd.ufrn.br.market.service;

import imd.ufrn.br.market.dto.ProdutoPostDTO;
import imd.ufrn.br.market.dto.ProdutoPutDTO;
import imd.ufrn.br.market.entity.ProdutosEntity;
import imd.ufrn.br.market.exception.BadRequestException;
import imd.ufrn.br.market.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public ProdutosEntity findById(@PathVariable Integer id) {
        return repository.findByIdAndAtivoTrue(id)
                .orElseThrow(() -> new BadRequestException("Produto não encontrado!"));
    }

    public List<ProdutosEntity> findAll() {
        return repository.findAllByAtivoTrue();
    }

    public void save(ProdutoPostDTO produtoPostDTO) {
        ProdutosEntity produtosEntity = ProdutosEntity.builder()
                .nomeProduto(produtoPostDTO.getNomeProduto())
                .descricaoProduto(produtoPostDTO.getDescricaoProduto())
                .dataValidade(produtoPostDTO.getDataValidade())
                .estoque(produtoPostDTO.getEstoque())
                .precoProduto(produtoPostDTO.getPrecoProduto())
                .fornecedor(produtoPostDTO.getFornecedor())
                .ativo(1)
                .build();
        repository.save(produtosEntity);
    }

    public void update(ProdutoPutDTO produtoPutDTO) {
        ProdutosEntity produtosEntity = repository.findByIdAndAtivoTrue(produtoPutDTO.getId())
                .orElseThrow(() -> new BadRequestException("Produto não encontrado!"));

        String nomeProduto = produtoPutDTO.getNomeProduto() == null ? produtosEntity.getNomeProduto() : produtoPutDTO.getNomeProduto();
        String descricaoProduto = produtoPutDTO.getDescricaoProduto() == null ? produtosEntity.getDescricaoProduto() : produtoPutDTO.getDescricaoProduto();
        String dataValidade = produtoPutDTO.getDataValidade() == null ? produtosEntity.getDataValidade() : produtoPutDTO.getDataValidade();
        Integer estoque = produtoPutDTO.getEstoque() == null ? produtosEntity.getEstoque() : produtoPutDTO.getEstoque();
        Double preco = produtoPutDTO.getPrecoProduto() == null ? produtosEntity.getEstoque() : produtoPutDTO.getPrecoProduto();

        produtosEntity.setNomeProduto(nomeProduto);
        produtosEntity.setDescricaoProduto(descricaoProduto);
        produtosEntity.setDataValidade(dataValidade);
        produtosEntity.setEstoque(estoque);
        produtosEntity.setPrecoProduto(preco);

        repository.save(produtosEntity);
    }

    public void deleteById(Integer id) {
        repository.findById(id)
                .orElseThrow(() -> new BadRequestException("Produto não encontrado!"));
        repository.deleteById(id);
    }

    public void deleteLogic(Integer id) {
        ProdutosEntity resposta = repository.findByIdAndAtivoTrue(id)
                .orElseThrow(() -> new BadRequestException("Produto não encontrado!"));
        resposta.setAtivo(0);
        repository.save(resposta);
    }
}
