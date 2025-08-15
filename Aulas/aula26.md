# Array com class

POO é uma metodologia de trabalhar com programação!

# Banco de dados

bloco final

Back End será trabalhado com alguns programas. Usaremos o MySQL devido ao consumo de API.

Usaremos:

MySQL
Eclipse
Spring Boot
PostMan

Iremos trabalhar com 2 APIs

1ª API será em conjunto => comum
2ª API será particular

Existem 2 tipos de banco de dados e nós trabalharemos com um software chamado SGDBR(Sistema Gerenciador Data Base Relacional) usaremos o MySQL

Em base de dados temos 1 ou mais tabelas no mínimo. 

Cliente, fornecedor, funcionário, produto. Tudo isso é uma compõe a tabela para a base de Dados

Dentro das tabelas teremos registros. Um conjunto de informações que é um dado que estamos armazenando. EX: cadastro do cliente -> nome, endereço.

Campos -> são os tipos de dados/informação cadastrada no registro

Banco de dados relacionais permite que o banco tenha uma integridade de dados. Evitar que tenhamos no sistema informações que sejam imprecisas ou incoerentes(ou seja se removido não pode ter o dado)!

Relacionamento 1 para 1. Em duas tabelas por exemplo apenas 1 elemento se relacionamento apenas com um 1 de outra tabela.

Relacionamento 1 para n. Em duas tabelas por exemplo 1 elemento pode se relacionar com n elementos de outra tabela mas o inverso não acontece.

Relacionamento N para N. Em duas tabelas n se relaciona com n de outra tabela.

PK - uma chave que permite cadastrar apenas 1 produto impedindo duplicidade. O campo chave primária impede que a duplicidade de produto. Primary Key.Único não null

Na tabela 1 ela é PK e para ter realcionamento na tabela 2 e torna-se FK e a tabela 2 tem PK.

# API

API (Application Programing Interface - Interface de programação de aplicativo) é um conjunto de regras que permite que sistemas se comuniquem entre si. Atua como um contato entre cliente e servidor. Exemplo: Um aplicativo de clima que conecta a uma API para buscar a previsão do tempo.

### O que é uma API rest?

Representation State Transfer - Transferência de Estado Represenacional.

Baseada em recursos e métodos HTTP protocolo de tranferência de texto (GET, POST, PUT, DELETE)
Stateless (sem estado): Cada requisição é independente. Usa URls amigáveis e formao geralmente JSON.

### O que é Spring boot?
É uma ferramenta(framework) para criar aplicações em Java. Ajuda os desenvolvedores a criarem sistemas web (como sites e APIs) mais rápido e com menos código. Ele faz "muita coisa por você", sem precisar configurar tudo manualmente. Sem ele, criar uma aplicação Java pode ser demorado e complicado. Ele já vem com configurações prontas.

Sem spring boot:
configurar servidor
configurar banco de dados
escrever muito código

com spring boot:
Só escreve o básico, e ele já te entrega:
servidor funcionando
conexão com banco de dados
Site ou API no ar

O que o spring boot tem por dentro?

banco de dados
segurança testes
criação de páginas web
ele se conecta com tudo isso

Como funciona um projeto Spring boot?
Partes principais:
Controller: end point, é responsável por manipular todas as requisições do lado de fora da API, através de url`s seguindo o protocolo HTTP;
Service: classe responsável por toda a regra de negocio e tatativa de dados.
Respository/DAO(object acsses dade): interface responsável pela comunicação direta com o banco de dados.
Model/ Entity: classe responsável pela abstração de tabelas e relacionamento entre tabelas em nosso banco de dados.

front<->Controller<->service<->repository<->model<->database