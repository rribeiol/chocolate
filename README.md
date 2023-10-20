# Chocolate API

## Índice

- [Visão Geral](#visão-geral)
- [Instalação](#instalação)
  - [Pré-requisitos](#pré-requisitos)
  - [Passos para instalação](#passos-para-instalação)
- [Uso](#uso)
  - [Autenticação](#autenticação)
  - [Endpoints](#endpoints)
- [Documentação Swagger UI](#documentação-swagger-ui)
- [Actuator](#actuator)
- [Testes](#testes)
- [Pilha de Tecnologia](#pilha-de-tecnologia)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Visão Geral

Esta API é usada para calcular a quantidade de cacau necessária para produzir diferentes tipos de chocolate. Ela oferece funcionalidades como iniciar a máquina de chocolate, verificar seu status e acompanhar as estatísticas de produção.

## Instalação

### Pré-requisitos

- JDK 11
- Maven

### Passos para instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/seuusername/api-chocolate.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd api-chocolate
    ```
3. Construa o projeto:
    ```bash
    mvn clean install
    ```
4. Execute a aplicação:
    ```bash
    java -jar target/chocolate-0.0.1-SNAPSHOT.jar
    ```

## Uso

### Autenticação

A API utiliza OAuth2 para autenticação segura. Para obter um token:
    ```bash
    curl -X POST -u 'client:secret' -d 'grant_type=password&username=USERNAME&password=PASSWORD' http://localhost:8080/oauth/token
    ```

### Endpoints

- Iniciar Máquina: `POST /api/v1/máquina/iniciar`
- Parar Máquina: `POST /api/v1/máquina/parar`
- Status da Máquina: `GET /api/v1/máquina/status`
- Quantidade de Cacau Necessária: `GET /api/v1/cacau`
- Estatísticas: `GET /api/v1/estatísticas`

## Documentação Swagger UI

A documentação completa da API está disponível no Swagger UI:
    ```
    http://localhost:8080/swagger-ui/
    ```

## Actuator

O Actuator fornece várias métricas e informações sobre o estado da aplicação. Para acessá-lo, use o seguinte endpoint:
    ```
    http://localhost:8080/actuator
    ```

## Testes

Para rodar os testes, execute o seguinte comando:
    ```bash
    mvn test
    ```

## Pilha de Tecnologia

- Java 11
- Spring Boot
- Actuator
- Swagger

## Contribuição

Para contribuir com este projeto, por favor faça um fork e envie um pull request.

## Licença

Este projeto está licenciado sob a Licença Apache 2.0 - veja o arquivo [LICENSE.md](LICENSE.md) para mais detalhes.
