package imd.ufrn.br.market.produtos.controller;

import imd.ufrn.br.market.produtos.dto.ProdutoDTO;
import imd.ufrn.br.market.produtos.entity.ProdutosEntity;
import imd.ufrn.br.market.exception.BadRequestException;
import imd.ufrn.br.market.produtos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<ProdutosEntity> getAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public ProdutosEntity getById(@PathVariable Integer id) throws BadRequestException {
        return service.findById(id);
    }
    @PostMapping
    public void postProduct(@RequestBody @Valid ProdutoDTO produtoDTO) throws BadRequestException {
        service.save(produtoDTO);
    }
    @PutMapping
    public void putProduct(@RequestBody @Valid ProdutoDTO produtoDTO) throws BadRequestException {
        service.update(produtoDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLogic(@PathVariable Integer id) {
        service.deleteLogic(id);
    }
}
