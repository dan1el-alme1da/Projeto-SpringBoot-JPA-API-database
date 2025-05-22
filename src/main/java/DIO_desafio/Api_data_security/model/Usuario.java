package DIO_desafio.Api_data_security.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GERA ID AUTOMATICAMENTE
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)// MEU ID PRECISA SER ATÉ 50 E NÃO ACEITARÁ NULO
    private String nome;
    @Column(length = 20, nullable = false)// MEU NOME PRECISA SER ATÉ 20 E NÃO ACEITARÁ NULO
    private String userName;
    @Column(length = 100, nullable = false)// MEU USERNAME PRECISA SER ATÉ 100 E NÃO ACEITARÁ NULO
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
