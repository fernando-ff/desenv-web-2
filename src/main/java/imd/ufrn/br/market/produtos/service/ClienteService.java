package imd.ufrn.br.market.produtos.service;

import imd.ufrn.br.market.exception.BadRequestException;
import imd.ufrn.br.market.produtos.entity.ClienteEntity;
import imd.ufrn.br.market.produtos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;
    public ClienteEntity findById(Integer id) {
        return repository.findByIdAndAtivoTrue(id)
                .orElseThrow(() -> new BadRequestException("CLIENTE NÃO ENCONTRADO"));
    }
}
