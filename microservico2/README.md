# Microserviço 2 - Citation Service 💬

O **Microserviço 2** é um serviço Spring Boot responsável por retornar citações inspiradoras aleatórias. Ele também ilustra a integração de dependência de biblioteca local (`commons`) e ferramentas de qualidade de código (JaCoCo e SonarQube).

---

## ⚙️ Características Técnicas

- **Versão do Java:** 21
- **Porta do Servidor:** `443` (mapeada para `444` no docker-compose) (HTTPS)
- **SSL / Keystore:** Utiliza `keystore.p12` na raiz do diretório.
- **Integrações de Qualidade:** JaCoCo (relatório de cobertura) e SonarQube Scanner.

---

## 🏛️ Estrutura do Módulo

O microsserviço está estruturado da seguinte forma:

- **[Microservico2Application](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico2/src/main/java/br/pucrs/microdemo/microservico2/Microservico2Application.java)**: Classe principal de inicialização.
- **[CitationCollection](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico2/src/main/java/br/pucrs/microdemo/microservico2/business/CitationCollection.java)**: Classe de serviço annotated com `@Service` contendo uma coleção estática de citações inspiradoras e um método `getCitation()` para obter uma citação aleatória.
- **[CitationController](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico2/src/main/java/br/pucrs/microdemo/microservico2/controller/CitationController.java)**: Controlador REST expondo a rota `/citation`. Durante o processamento da requisição, ele instancia a classe `ClasseComumSimples` vinda do módulo `commons` para demonstração de uso de dependência externa local.

---

## 🔌 API Endpoints

### Obter Citação Aleatória
* **Rota:** `/citation`
* **Método:** `GET`
* **Comportamento:** Retorna uma string simples com uma citação aleatória.
* **Exemplo de URL local:**
  ```
  https://localhost:444/citation
  ```
* **Resposta de Exemplo:**
  ```text
  Vulnerability sounds like faith and looks like courage.
  ```

---

## 🧪 Testes Unitários e Cobertura (JaCoCo)

O módulo contém testes unitários básicos em [Microservico2ApplicationTests.java](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico2/src/test/java/br/pucrs/microdemo/microservico2/Microservico2ApplicationTests.java) que testam o comportamento da `CitationCollection`.

Para rodar os testes e gerar a cobertura com o plugin do **JaCoCo**:
```bash
mvn clean test
```
O HTML com a cobertura de código poderá ser aberto em:
`target/site/jacoco/index.html`

---

## 🔍 Análise de Código (SonarQube)

As configurações de análise estática de código com o SonarQube estão definidas no [pom.xml](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico2/pom.xml) e no arquivo [sonar-project.properties](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/microservico2/sonar-project.properties).

Para disparar a análise estática no SonarQube:
```bash
mvn sonar:sonar
```

*Nota: Garanta que o servidor SonarQube esteja em execução em `http://localhost:9000` ou altere a propriedade do host conforme necessário.*
