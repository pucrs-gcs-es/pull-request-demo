# Commons Module 📦

Módulo Java compartilhado contendo classes comuns, utilitários e modelos DTOs reutilizáveis entre os diversos microsserviços do projeto.

---

## ⚙️ Especificações Técnicas

- **Versão do Java:** 17
- **Biblioteca Lombok:** Inclusa para geração automática de getters, setters, construtores e padrões estruturais.

---

## 🏛️ Estrutura do Código

A classe principal contida neste módulo é a:
* **[ClasseComumSimples](file:///mnt/c/Users/mcmor/Dropbox/M/WSGitLocalNew/%23SpringDemos/springmicroservicesdemo/commons/src/main/java/br/pucrs/microdemo/commons/ClasseComumSimples.java)**
  - Possui um único atributo: `String texto`.
  - Anotada com `@Setter`, `@Getter`, `@AllArgsConstructor` e `@NoArgsConstructor` do Lombok.
  - Usada como demonstração de compartilhamento de classes entre serviços separados (como importação em `microservico2`).

---

## 🛠️ Como Instalar no Repositório Maven Local

Para usar o módulo `commons` como uma dependência Maven em outros projetos em sua máquina local, execute:

```bash
mvn clean install
```

Isso compilará o projeto e gerará o arquivo JAR (`commons-1.0.jar`), salvando-o no diretório `~/.m2/repository/br/pucrs/microdemo/commons/1.0/`.

---

## 🔌 Importando em Outros Microsserviços

Uma vez instalado localmente, declare a dependência no arquivo `pom.xml` do microsserviço que deseja utilizá-lo:

```xml
<dependency>
    <groupId>br.pucrs.microdemo</groupId>
    <artifactId>commons</artifactId>
    <version>1.0</version>
</dependency>
```
