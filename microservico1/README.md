# Microserviço 1 - User Service 👥

O **Microserviço 1** é um serviço Spring Boot responsável pelo cadastro e gerenciamento de usuários (`User`). Ele possui persistência direta com o banco de dados PostgreSQL.

---

## ⚙️ Características Técnicas

- **Versão do Java:** 21
- **Porta do Servidor:** `443` (HTTPS)
- **Banco de Dados:** PostgreSQL (`banco`)
- **SSL / Keystore:** Utiliza `keystore.p12` na raiz do diretório.

---

## 🏛️ Estrutura do Módulo

O microsserviço está estruturado da seguinte forma:

- **[Microservico1Application](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico1/src/main/java/br/pucrs/microdemo/microservico1/Microservico1Application.java)**: Classe de inicialização do Spring Boot.
- **[User](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico1/src/main/java/br/pucrs/microdemo/microservico1/domain/User.java)**: Entidade JPA que mapeia a tabela `USERS` no PostgreSQL, contendo os campos:
  - `id` (Gerado automaticamente)
  - `firstName` (Nome)
  - `lastName` (Sobrenome)
- **[UserController](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico1/src/main/java/br/pucrs/microdemo/microservico1/controller/UserController.java)**: Controlador REST expondo o endpoint `/user`.

---

## 🔌 API Endpoints

### Obter / Cadastrar Usuário
* **Rota:** `/user`
* **Método:** `GET`
* **Parâmetros de Query:**
  - `fn` (Primeiro Nome)
  - `ln` (Último Nome)
* **Comportamento:** Retorna um objeto `User` contendo os nomes duplicados (ex: `michaelmichael` e `moramora`) e imprime no console.
* **Exemplo de URL local:**
  ```
  https://localhost:443/user?fn=michael&ln=mora
  ```
* **Resposta JSON:**
  ```json
  {
    "id": 1,
    "firstName": "michaelmichael",
    "lastName": "moramora"
  }
  ```

---

## 🐳 Dockerização e Execução

O microsserviço é construído usando o [dockerfile](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico1/dockerfile) contido na pasta. Ele copia o JAR gerado e o arquivo de keystore para o container.

Para empacotar manualmente sem rodar via docker-compose global:
```bash
mvn clean package -DskipTests
docker build -t microservico1 .
```

*Nota: Garanta que o PostgreSQL esteja em execução e acessível via rede de host sob o alias `banco` se executado manualmente.*
