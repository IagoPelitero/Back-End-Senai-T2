# Explicando linhas do Model

`@Entity` - serve informar que a classe Java representa uma entidade. Ela é uma tabela em Java, faz parte do JPA (Java prestation API). Assim que definido a classe com essa anotação está sinalizando ao servido que ela precisa ser uma tabela no banco de dados. Suas instancias elas serão persistiveis, ou seja, salvas no banco de dados. As intancias serão os meus registros. 
Toda vez que instanciamos um obejeto ele é registrado no banco de dados.
Essa classe pode ser usada em operações utilizando o CRUD(Create, Register, Update, Delete).
Precisa ser realizado o import do Entity para ele rodar usando o persistence que irá fixar ele. Ele precisa ter um método construtor (que irá criar o objeto) e não podemos alterar pois ele deve vir como padrão para não perder o que já consta. Assim que definido precisa ter uma anotação ID que define um campo, ela é nossa PK (primary key). Uma entidade do banco de dados. Vou usar apenas em classes que irão gerar tabelas.

O @Entity sempre vem acompanhado do @Id que é a PK para o banco de dados evitando duplicidade o @Table é a criação da tabela no banco de dados.

Detalhe se essa classe representa uma tabela e preciso instancia-la não podemos instanciar, nem pode ser interface pois não usamos somente métodos pois utilizamos atributos que serão os campos para o banco de dados e ela não pode ser final pois se houver alguma necessidade de ter uma subclasse para executar o trabalho pode atrapalhar.

Ele também consulta se a tabela existe e/ou atualizar no banco de dados no hibernate criado dentro da application.propieties.

O @Id indica ou define que o primeiro atributo será o PK(chave primária) dentro do Java. 

`@GeneratedValue(strategy = GenerationType.IDENTITY)` -> depende da estratégia da chave primária, pois ela preenche automaticamente. Em sistuações que precisa ser digitado a mão o dado de referência ela não é usada. Auto_Increment no banco de dados é a mesma função que gera o ID automaticamente.

log está para int assim como o double está para o float.

`@Temporal` ele informa que o campo no hibernate será do tipo data. TIMESTAMP traz a data completa com horário. 

`@ManyToOne` -> indica que são muitos para 1. Indica que o próximo campo é o extrangeiro FK.

`@JsonIgnoreProperties("postagem")` -> Dentro da anotação JSON que é um formato de transmissão de dados alocados nele. Nesse comando ele ignora algumas propriedades do Java ou seja facilita o envio das informações para que não haja crash nos dados.
Ex: token que serve para segurança, senha. São campos criptografados e por isso é usado para deixar os dados limpos para não crashar os dados.

`@OneToMany` -> um para muitos `mapped = "tema", cacadde = CascadeType.ALL` ele será minha tabela estrangeira e ele tem uma relação em cascata, onde todos os registros caso sejam deletados terão a mesma ação.

`private List<Postagem> postagem` o tema tem uma lista de postagem, ou seja, temos uma classe em um array.


# Definir um projeto

1 -> Definir o projeto = Mini mercado com carrinho de pagamento
2 -> Definir as tabelas (pelo menos até 3) = Cliente, produto, pedido
3 -> Relacionamento entre tabelas = 1 cliente para N produtos, N produtos para 1 pedido.
4 -> Definir os campos de cada tabela = Cliente - id, nome, usuario e senha; Produtos: categoria, quantidade, valor unitário e o produto; pedido: nº pedido, quantidade de itens, valor final.
5 -> Spring Boot 
6 -> Aplication Propieties
7 -> Models