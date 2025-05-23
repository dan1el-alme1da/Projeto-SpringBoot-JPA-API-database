package DIO_desafio.Api_data_security.controller;

import DIO_desafio.Api_data_security.model.Usuario;
import DIO_desafio.Api_data_security.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Tag(name = "Usuários", description = "API para gerenciamento de usuários")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    @Operation(summary = "Criar um novo usuário")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        // Garante que o ID seja nulo para criar um novo registro
        usuario.setId(null);
        return usuarioRepository.save(usuario);
    }

    @GetMapping
    @Operation(summary = "Listar todos os usuários")
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();

        // Mostra os usuários no terminal
        System.out.println("\n=== LISTA DE USUÁRIOS ===");
        usuarios.forEach(usuario -> {
            System.out.println("ID: " + usuario.getId());
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Username: " + usuario.getUserName());
            System.out.println("Password: " + usuario.getPassword());
            System.out.println("----------------------");
        });

        return usuarios;
    }
}
