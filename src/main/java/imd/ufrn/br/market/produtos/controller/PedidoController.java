package imd.ufrn.br.market.produtos.controller;

import imd.ufrn.br.market.exception.BadRequestException;
import imd.ufrn.br.market.produtos.dto.PedidoDTO;
import imd.ufrn.br.market.produtos.dto.ProdutoPutDTO;
import imd.ufrn.br.market.produtos.entity.PedidoEntity;
import imd.ufrn.br.market.produtos.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
    @Autowired
    private PedidoService service;

    @GetMapping
    public List<PedidoEntity> getAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public PedidoEntity getById(@PathVariable Integer id) throws BadRequestException {
        return service.findById(id);
    }
    @PostMapping
    public void postProduct(@RequestBody @Valid PedidoDTO pedidoDTO) throws BadRequestException {
        service.save(pedidoDTO);
    }
    @PutMapping
    public void putProduct(@RequestBody @Valid PedidoDTO pedidoDTO) throws BadRequestException {
        service.update(pedidoDTO);
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
