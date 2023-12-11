package imd.ufrn.br.market.produtos.service;

import imd.ufrn.br.market.exception.BadRequestException;
import imd.ufrn.br.market.produtos.dto.PedidoDTO;
import imd.ufrn.br.market.produtos.entity.ClienteEntity;
import imd.ufrn.br.market.produtos.entity.PedidoEntity;
import imd.ufrn.br.market.produtos.entity.ProdutosEntity;
import imd.ufrn.br.market.produtos.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private ClienteService clienteService;


    public PedidoEntity findById(Integer id) {
        return repository.findByIdAndAtivoTrue(id)
                .orElseThrow(() -> new BadRequestException("PEDIDO NÃO ENCONTRADO"));
    }

    public List<PedidoEntity> findAll() {
        return repository.findAllByAtivoTrue();
    }
    public void save(PedidoDTO pedidoDTO) {
        List<Integer> produtoId = pedidoDTO.getProdutoId();
        Integer clienteId = pedidoDTO.getClienteId();
        Integer quantidade = pedidoDTO.getQuantidade();

        List<ProdutosEntity> produtos = new ArrayList<>();


        for (Integer i : produtoId) {
            ProdutosEntity produto = produtoService.findById(i);
            produtos.add(produto);
        }
        ClienteEntity cliente = clienteService.findById(clienteId);

        PedidoEntity pedido = PedidoEntity.builder()
                .cliente(cliente)
                .produtos(produtos)
                .quantidade(quantidade)
                .ativo(1)
                .build();
        repository.save(pedido);
    }


    public void update(PedidoDTO pedidoDTO) {
        List<Integer> produtoId = pedidoDTO.getProdutoId();
        Integer clienteId = pedidoDTO.getClienteId();
        Integer quantidade = pedidoDTO.getQuantidade();

        List<ProdutosEntity> produtos = new ArrayList<>();


        for (Integer i : produtoId) {
            ProdutosEntity produto = produtoService.findById(i);
            produtos.add(produto);
        }
        ClienteEntity cliente = clienteService.findById(clienteId);

        PedidoEntity pedido = PedidoEntity.builder()
                .cliente(cliente)
                .produtos(produtos)
                .quantidade(quantidade)
                .ativo(1)
                .build();
        repository.save(pedido);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public void deleteLogic(Integer id) {
        repository.findByIdAndAtivoTrue(id)
                .orElseThrow(() -> new BadRequestException("PEDIDO NÃO ENCONTRADO"));

        PedidoEntity pedido = PedidoEntity.builder()
                .id(id)
                .ativo(0)
                .build();
        repository.save(pedido);
    }
}
