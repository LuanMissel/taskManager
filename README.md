# Task Manager API

API REST para gerenciamento de tarefas, desenvolvida com **Java e Spring Boot** como projeto de estudo em desenvolvimento backend.

O projeto tem como objetivo aplicar conceitos de programação orientada a objetos, organização de código e construção de APIs REST, utilizando uma arquitetura baseada na separação de responsabilidades.

## Tecnologias utilizadas

- Java
- Spring Boot
- API REST
- Arquitetura MVC
- Postman para testes de requisições HTTP

## Funcionalidades

- Criar tarefas
- Consultar tarefas
- Atualizar tarefas
- Excluir tarefas

As funcionalidades são organizadas por meio de operações CRUD (*Create, Read, Update, Delete*).

## Arquitetura

O projeto utiliza o padrão MVC para organizar os componentes e separar suas responsabilidades:

- **Model:** representa as entidades e os dados utilizados pela aplicação.
- **Controller:** recebe e gerencia as requisições HTTP.
- **Service:** concentra a lógica de negócio da aplicação.

Essa organização facilita a manutenção, a compreensão e a evolução do código.

## Como executar o projeto

### Pré-requisitos

- Java instalado e configurado.
- Maven, caso o projeto utilize essa ferramenta.
- Git para clonar o repositório.

### Instalação

1. Clone o repositório:

   ```bash
   git clone [URL_DO_SEU_REPOSITORIO](https://github.com/LuanMissel/taskManager)
   ```

2. Entre na pasta do projeto:

   ```bash
   cd task-manager
   ```

3. Execute a aplicação conforme a configuração do projeto.

   Se utilizar Maven Wrapper no Windows:

   ```bash
   .\mvnw.cmd spring-boot:run
   ```

   No Linux ou macOS:

   ```bash
   ./mvnw spring-boot:run
   ```

> Os comandos podem precisar de ajustes conforme a estrutura e a configuração real do projeto.

## Testes da API

As requisições HTTP podem ser realizadas pelo Postman para verificar o funcionamento dos endpoints e das operações CRUD.

Consulte os controllers do projeto para identificar as rotas, os métodos HTTP e os parâmetros disponíveis.

## Aprendizados

Durante o desenvolvimento, foram praticados conceitos como:

- Programação orientada a objetos com Java.
- Criação e organização de endpoints REST.
- Separação de responsabilidades utilizando MVC.
- Implementação de operações CRUD.
- Testes de requisições HTTP com Postman.
- Organização e manutenção de código backend.

## Próximas melhorias

- Persistência de dados em banco de dados relacional.
- Validação de dados de entrada.
- Tratamento padronizado de exceções.
- Testes automatizados.
- Documentação dos endpoints com Swagger/OpenAPI.

## Autor

**Luan Missel Lourenço**

Estudante de Análise e Desenvolvimento de Sistemas, com foco em desenvolvimento backend utilizando Java e Spring Boot.

- LinkedIn: https://www.linkedin.com/in/luanmissel/
- GitHub: https://github.com/luanmissel
