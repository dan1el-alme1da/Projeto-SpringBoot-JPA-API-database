package DIO_desafio.Api_data_security.dados;

import DIO_desafio.Api_data_security.model.Usuario;
import DIO_desafio.Api_data_security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DadosApp implements CommandLineRunner {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Criando um usuário
        Usuario usuario = new Usuario();
        usuario.setNome("fuck");
        usuario.setUserName("Papai");
        usuario.setPassword("234");

        // Salvando no banco
        repository.save(usuario);

        // Listando todos os usuários
        for (Usuario u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
