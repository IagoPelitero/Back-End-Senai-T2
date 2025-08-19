# Explicando linhas do Model

`@Entity` - serve informar que a classe Java representa uma entidade. Ela é uma tabela em Java, faz parte do JPA (Java prestation API). Assim que definido a classe com essa anotação está sinalizando ao servido que ela precisa ser uma tabela no banco de dados. Suas instancias elas serão persistiveis, ou seja, salvas no banco de dados. As intancias serão os meus registros. 
Toda vez que instanciamos um obejeto ele é registrado no banco de dados.
Essa classe pode ser usada em operações utilizando o CRUD(Create, Register, Update, Delete).
Precisa ser realizado o import do Entity para ele rodar usando o persistence que irá fixar ele. Ele precisa ter um método construtor (que irá criar o objeto) e não podemos alterar pois ele deve vir como padrão para não perder o que já consta. Assim que definido precisa ter uma anotação ID que define um campo, ela é nossa PK (primary key). Uma entidade do banco de dados. Vou usar apenas em classes que irão gerar tabelas.

O @Entity sempre vem acompanhado do @Id que é a PK para o banco de dados evitando duplicidade o @Table é a criação da tabela no banco de dados.

Detalhe se essa classe representa uma tabela e preciso instancia-la não podemos instanciar, nem pode ser interface pois não usamos somente métodos pois utilizamos atributos que serão os campos para o banco de dados e ela não pode ser final pois se houver alguma necessidade de ter uma subclasse para executar o trabalho pode atrapalhar.

