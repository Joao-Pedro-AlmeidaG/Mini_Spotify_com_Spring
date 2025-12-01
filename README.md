# 🎶 Mini Spotify com Spring Boot

Este é um projeto de simulação simplificada de um serviço de streaming de música, inspirado no Spotify, desenvolvido utilizando o framework **Spring Boot**. O objetivo é demonstrar a construção de uma aplicação web robusta, modular e orientada a serviços (Service-Oriented Architecture - SOA) com foco em APIs RESTful.

---

## 🌟 Tecnologias Utilizadas

| Categoria | Tecnologia | Versão Principal |
| :--- | :--- | :--- |
| **Framework** | Spring Boot | 3.x.x |
| **Linguagem** | Java | 17+ |
| **Persistência** | Spring Data JPA | - |
| **Banco de Dados** |  PostgreSQL (Prod) | - |
| **APIs** | RESTful Services | - |
| **Documentação** | Springdoc-OpenAPI / Swagger UI | - |

---

## 🚀 Funcionalidades Principais

O "Mini Spotify" oferece as seguintes funcionalidades através de endpoints REST:

* **Gerenciamento de Usuários:** Cadastro, login (simulado ou real, dependendo da implementação de segurança) e perfil.
* **Gerenciamento de Músicas:** Adicionar, listar, atualizar e excluir faixas musicais.
* **Gerenciamento de Playlists:** Criar, editar, adicionar/remover músicas e listar playlists.
* **Serviço de Assinatura (Simulado):** Diferenciação entre usuários *Free* e *Premium*.
* **Busca:** Busca eficiente de músicas e playlists por nome, artista ou gênero.

---

## ⚙️ Pré-requisitos

Para executar o projeto localmente, você precisará ter instalado:

1.  **Java Development Kit (JDK):** Versão 17 ou superior.
2.  **Maven:** Para gerenciamento de dependências e construção do projeto.
3.  **IDE (Opcional):** IntelliJ IDEA, Eclipse ou VS Code.

### 🛠️ Configuração e Execução

Siga os passos abaixo para colocar o projeto em execução na sua máquina:

#### 1. Clonar o Repositório

```bash
git clone [https://github.com/Joao-Pedro-AlmeidaG/Mini_Spotify_com_Spring.git](https://github.com/Joao-Pedro-AlmeidaG/Mini_Spotify_com_Spring.git)
cd Mini_Spotify_com_Spring
```
### 2. Configurar o Banco de Dados
O projeto utiliza o H2 Database por padrão em modo de desenvolvimento.

Se você optar por usar o PostgreSQL (ou outro DB), atualize o arquivo src/main/resources/application.properties com suas credenciais:

Properties

```Bash

spring.datasource.url=jdbc:postgresql://localhost:5432/mini_spotify_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```
---
### 3. Compilar e Executar
Utilize o Maven para construir o projeto e rodar a aplicação:

```Bash

mvn clean install
mvn spring-boot:run
A aplicação estará acessível em http://localhost:8080.
```
---

##📄 Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

##👨‍💻 Autor
João Pedro Almeida G.
