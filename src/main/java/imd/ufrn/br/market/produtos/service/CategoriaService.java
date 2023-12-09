package imd.ufrn.br.market.produtos.service;

import imd.ufrn.br.market.exception.BadRequestException;
import imd.ufrn.br.market.produtos.entity.CategoriaEntity;
import imd.ufrn.br.market.produtos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public CategoriaEntity findById(Integer id) throws BadRequestException{
        return repository.findById(id)
                .orElseThrow(() -> new BadRequestException("Produto não encontrado"));
    }
}
