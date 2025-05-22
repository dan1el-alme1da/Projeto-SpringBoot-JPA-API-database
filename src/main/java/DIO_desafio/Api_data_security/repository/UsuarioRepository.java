package DIO_desafio.Api_data_security.repository;

import DIO_desafio.Api_data_security.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    }

