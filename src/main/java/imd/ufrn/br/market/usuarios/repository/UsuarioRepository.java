package imd.ufrn.br.market.usuarios.repository;

import imd.ufrn.br.market.usuarios.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UserDetails findByLogin(String login);
}
