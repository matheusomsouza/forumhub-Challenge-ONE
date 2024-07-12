# <h1 align="center"> ForumHub - Challenge ONE - Back end

# Indíce
* [Descrição do Projeto](#descrição-do-projeto)
* [Status do Projeto](#status-do-projeto)
* [Funcionalidades](#funcionalidades)
* [Tecnologias Envolvidas](#tecnologias-envolvidas)
* [Desenvolvedores](#desenvolvedores)
* [Conclusão](#conclusão)

# Descrição do Projeto
O projeto ForumHub é um dos Challenges do programa ONE (Oracle Next Education), sendo o terceiro Challenge, que abrenge todo o conteúdo do programa. O programa ONE é um programa educacional realizado pela Oracle + Alura.
O challenge em questão faz parte da trilha de conhecimento em Back end, utilizando a linguagem de programação Java + Spring Boot. O projeto consiste em uma aplicação que apresenta uma API, tendo somente o Back end,
para o usuário. Como não foi desenvolvido a parte do Front end, todos os testes e verificação de funcionamento da API deve ser feito com alguma aplicação como o Insomnia ou Postman, para disparo de requisições HTTP.
O projeto consiste em um fórum de dúvidas, onde o usuário deve fazer um login para obter um token de autorização para poder criar tópicos e responder outros tópicos no fórum. Toda a parte de seguraça da API foi também
desenvolvida, exigindo a autenticação e autorização para uso desta.

# Status do Projeto
CONCLUÍDO

# Funcionalidades
A aplicação consiste em um fórum de dúvidas e debates. O cliente deve fazer uma requisição de login, onde colocará sua senha e usúario, previamente cadastrados no banco de dados. Com a autenticação, um token será
gerado(é uma aplicação stateless). Toda requisição será necessário o envio do token para autorização. O cliente já autenticado tem a opção de cadastrar um tópico no banco de dados, requerer a lista de tópicos cadastrados,
requerer um tópico específico em detalhe, cadastrar uma resposta em algum tópico e deletar algum tópico que tenha cadastrado. Todas as requisições contam com validações que devem ser respeitadas para que sejam
confirmadas. São validações de campos obrigatórios e formato de dados obrigatórios.

# Tecnologias Envolvidas
O projeto foi desenvolvido em Java (Java 17) e Spring Boot framework. Maven, com JPA e Spring Security. No projeto também utilizamos o banco de dados MySQL, em conjunto com Flyway migrations para registrar alterações,
fazer um controle de versões do banco de dados. Foi todo desenvolvido na IDE IntelliJ. Foi usado o Insomnia para disparar requisições e testar a API.

# Desenvolvedores
O projeto foi inteiro desenvolvido por Matheus Oliveira Machado de Souza.

# Conclusão
O projeto foi desenvolvido durante o programa ONE, com os conhecimentos adquiridos no programa atráves dos cursos da Alura. É um projeto que usa todo o conhecimento adquirido na formação,
fazendo uma boa base para um desenvolvedor Back-end Java.
Um agradecimento a um dos principais instrutores dessa formação, Rodrigo da Silva Ferreira Caneppele, e o instrutor do challenge, Eric Monné Fraga de Oliveira.
