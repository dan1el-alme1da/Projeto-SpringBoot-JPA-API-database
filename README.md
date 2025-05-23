# **📚 Projeto SpringBoot JPA API Database**  

**🚀 Uma API robusta para gerenciamento de usuários com segurança integrada**  

---

## **🔧 Funcionalidades**  

✔ **CRUD de Usuários**  
- Criação, leitura de dados 

✔ **Autenticação Básica**  
- Proteção de endpoints com Spring Security  
- Configuração de roles e permissões  

✔ **Banco de Dados PostgreSQL**  
- Modelagem de dados com JPA/Hibernate  
- Migração automática de esquema  

✔ **Documentação com Swagger**  
- Interface interativa para testar endpoints  
- Disponível em: `http://localhost:8080/swagger-ui.html`  

✔ **Configuração Segura**  
- Proteção contra CSRF (desabilitado para APIs stateless)  
- Pronto para implementação de JWT (opcional)  

---

## **⚙️ Requisitos**  

### **📋 Pré-requisitos**  
- **Java 17+**  
- **Maven 3.6+**  
- **PostgreSQL 14+** (ou Docker para container)  
- **Git** (para versionamento)  

## **🛠️ Como Executar**  

1. **Clone o repositório**  
```bash
git clone https://github.com/daniel-almeltai/Projeto-SpringBoot-JPA-API-database.git
```

2. **Configure o banco de dados**  
Edite `application.properties`:  
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

3. **Execute a aplicação**  
```bash
mvn spring-boot:run
```

4. **Acesse a documentação**  
🔗 [Swagger UI](http://localhost:8080/swagger-ui.html)  

---

## **📌 Endpoints Principais**  

| Método | Endpoint       | Descrição                     |
|--------|---------------|-------------------------------|
| POST   | `/usuarios`   | Cria um novo usuário          |
| GET    | `/usuarios`   | Lista todos os usuários       |

---

## **🔒 Segurança**  
- **Usuário padrão**: `seu_usuario` (configure no `application.properties`) 
- **Senha**: `sua_senha` (configure no `application.properties`)  

---

## **📂 Estrutura do Projeto**  
```
src/
├── main/
│   ├── java/
│   │   ├── config/       # Configurações (Security, Swagger)
│   │   ├── controller/   # Endpoints REST
│   │   ├── model/        # Entidades JPA
│   │   ├── repository/   # Interfaces de banco de dados
│   ├── resources/
│   │   ├── application.properties
```

---

## **📜 Licença**  
MIT License © 2025 - [Daniel](https://github.com/dan1el-alme1da)  

---

**🎉 Pronto para usar!** Contribuições são bem-vindas.  
**🌟 Dúvidas?** Abra uma *issue* no repositório!  


--- 

🔗 **Link do Repositório**: [GitHub](https://github.com/dan1el-alme1da/Projeto-SpringBoot-JPA-API-database)  

---

### **📌 Notas Adicionais**  
- Para **testes locais**, você pode usar o H2 Database (já configurado como dependência opcional).  

 
