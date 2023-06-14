# E-commerce

Este é o repositório do projeto E-commerce. O projeto foi desenvolvido usando as seguintes tecnologias e ferramentas:

- IntelliJ IDEA Community Edition 2023.1.1
- Java 17
- MySQL 8.0.21
- Spring Boot 3.1.0
- Maven 3.0.1

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- IntelliJ IDEA Community Edition (disponível em: https://www.jetbrains.com/idea/download/)
- Java Development Kit (JDK) 17 (disponível em: https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- MySQL 8.0.21 (disponível em: https://dev.mysql.com/downloads/)
- Maven 3.0.1 (disponível em: https://maven.apache.org/download.cgi)

## Configuração do Banco de Dados

Antes de executar o projeto, você precisará configurar o banco de dados MySQL. Siga as etapas abaixo:

1. Instale o MySQL em seu sistema operacional, se ainda não estiver instalado.
2. Crie um banco de dados no MySQL para o projeto E-commerce.
3. Abra o arquivo `src/main/resources/application.properties` e atualize as configurações do banco de dados com as suas informações. As propriedades que precisam ser atualizadas são:

   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco_de_dados
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

Certifique-se de substituir `nome_do_banco_de_dados`, `seu_usuario` e `sua_senha` pelos valores correspondentes às suas configurações.

## Executando o Projeto

1. Abra o IntelliJ IDEA Community Edition.
2. Selecione a opção "Open" (Abrir) no menu principal e navegue até a pasta do projeto E-commerce.
3. Aguarde o IntelliJ IDEA importar e configurar o projeto.
4. Após a importação ser concluída, vá para a classe `src/main/java/com/example/ecommerce/ECommerceApplication.java` e execute a aplicação clicando no botão "Run" (Executar) ao lado do método `main()`.
5. O Spring Boot iniciará a aplicação e você poderá acessar o E-commerce por meio do seu navegador.

## Executando o Projeto

1. Clone este repositório em sua máquina local.
2. Abra o IntelliJ IDEA e importe o projeto selecionando o diretório raiz do projeto.
3. Aguarde até que as dependências do Maven sejam baixadas automaticamente.
4. Com o projeto aberto no IntelliJ IDEA, localize a classe "EcommerceApplication" no diretório "src/main/java/com/yourpackage/ecommerce".
5. Clique com o botão direito do mouse na classe e escolha a opção "Run 'EcommerceApplication'".

O projeto será compilado e executado, e você poderá acessar a aplicação através do navegador em http://localhost:8080.

## Funcionalidades

A aplicação E-commerce inclui as seguintes funcionalidades básicas:

- Registro e login de usuários
- Exibição de produtos disponíveis
- Adição de produtos ao carrinho de compras
- Visualização do carrinho de compras
- Criação e finalização de pedidos

Sinta-se à vontade para explorar e personalizar o projeto de acordo com suas necessidades.

## Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT). Sinta-se livre para usar, modificar e distribuir este código conforme necessário.
