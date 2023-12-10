package imd.ufrn.br.market.produtos.service;

import imd.ufrn.br.market.produtos.dto.ProdutoPostDTO;
import imd.ufrn.br.market.produtos.dto.ProdutoPutDTO;
import imd.ufrn.br.market.produtos.entity.CategoriaEntity;
import imd.ufrn.br.market.produtos.entity.ProdutosEntity;
import imd.ufrn.br.market.exception.BadRequestException;
import imd.ufrn.br.market.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    @Autowired
    private CategoriaService categoriaService;
    public ProdutosEntity findById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new BadRequestException(""));
    }

    public List<ProdutosEntity> findAll() {
        return repository.findAll();
    }

    public void save(ProdutoPostDTO produtoPostDTO) throws BadRequestException{
        CategoriaEntity categoria = categoriaService.findById(produtoPostDTO.getCategoriaId());

        ProdutosEntity produtosEntity = ProdutosEntity.builder()
                .categoria(categoria)
                .build();
        repository.save(produtosEntity);
    }

    public void update(ProdutoPutDTO produtoPutDTO) {
        ProdutosEntity produtosEntity = repository.findById(produtoPutDTO.getId())
                .orElseThrow(() -> new BadRequestException("Produto não encontrado!"));

        repository.save(produtosEntity);
    }

    public void deleteById(Integer id) {
        repository.findById(id)
                .orElseThrow(() -> new BadRequestException("Produto não encontrado!"));
        repository.deleteById(id);
    }

    public void deleteLogic(Integer id) {
        ProdutosEntity resposta = repository.findById(id)
                .orElseThrow(() -> new BadRequestException("Produto não encontrado!"));
        repository.save(resposta);
    }
}
