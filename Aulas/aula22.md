# Exercicios

1 - O que são atributos?
R: São como variáveis para serem usados no código para executar uma determinada ação

2 - O que são métodos?
R: São as instruções(ações ou comportamentos) que o programa irá executar quando chamado.

3 - O que é um método construtor?
R: É um método que permite a inicialização do objeto com instruções definidas, quando não definidas ele vem com o padrão assim que o método for chamado. Exemplo: cor: null para cor: nenhum. 

4 - O que é uma classe? Use uma analogia do mundo real para ajudar a explicar.
R: São modelos ou moldes que definem e comportamentos comuns a um conjunto de objetos. Por exemplo o molde de uma barra de chocolate.

5 - Explique o que é Abstração.
R: É algo que existe, mas não temos como tocar. Usada quando queremos criar algum método do qual não queremos que seja modificado.

6 - Explique o que é Programação Orientada a Objeto.
R: Foi uma tecnologia criada por Alan Key. Serve para que o código seja organizado, possa ser reutilizado, seja adaptado, e consiga melhorar a efeciência do desenvolvimento e a manutenção de sistemas complexos.

7 - Quais são os 4 pilares da Programação Orientada a Objeto.
R: Abstração, Encapsulamento, Polimorfismo e Herança.

8 - O que é um objeto POO?
R: É um plano criado em uma classe que deverá conter: características (atributos), comportamentos(métodos) e estado atual.

9 - Como se instancia um objeto em Java?
R: No Java instanciamos um obejto quando chamamos ele na criação de algum programas que estamos criando. Exemplo: 

~~~Java
Caneta bic = new Caneta();
~~~

Isso faz com que o objeto seja acionado e que possamos utilizar seus métodos criados.

10 - Quais são os elementos que fazem parte do instanciamento de um objeto em Java?
R: Primeiro elemento: `New`
Segundo elemento: `Parâmetro`
Terceiro elemento: `Método`
Quarto elemento: `Refrência`.

Exemplo:

~~~Java
ContaBancaria cb/*referência*/ = new/*instancia do obejto*/ ContaBancaria(qualquerCoisa);/*dentro do obejto se cria o parâmetro quando necessário*/

cb.ligar(); /*solicita que execute a ação criada no método do obejto*/
~~~

11 - O que são modificadores de acesso?
R: São usados para limitar ou seja, quem pode acessar aquele código ou atributo.

12 - Quais são os modificadroes de acesso?
R: Package, Public, Private, Protect.

13 - Explique cada um dos modificadores de acesso.
R: Package: limita que a classe seja acessada apenas dentro do mesmo pacote, Public: Qualquer classe ou pacote pode acessar, Private: apenas a classe em que foi criado tem acesso (evita que algum dev modifique indevidamente), Protect: Apenas o pacote, classe ou subclasses tenha acesso.

14 - O que são métodos acessores e como funcionam?
São métodos getters que retornam a solicitação de mesmo atritbuto. 

~~~Java
qualquerCoisa.getMetodo();
~~~

15 - O que são os métodos modificadores e como funcionam?
São métodos que subescrevem uma instrução e sempre vai receber um parâmetro do mesmo tipo do atributo.

~~~Java
qualquerCoisa.setMetodo(variável ou instrução);
~~~

16 - O que é uma interface?
Lista de serviços fornecidos por um componente. É o contato com o mundo exterior. É formada apenas por métodos, geralmente abstratos. Nela criamos apenas métodos geralmente abstratos para serem usados em mais de uma classe se preciso.

17 - O que devemos fazer para implementar uma interface?
R: Primeiro criamos um arquivo interface e atribuimos um nome.
Segundo incluímos quais métodos deverão conter na interface.

Exemplo de interface:

~~~Java
public interface qualquerCoisa {
	public abstract void qualquerCoisa();
	public abstract void outraCoisa();
}
~~~

18 - Quais são os tipos de polimorfismo que existem?
Sobreposição e sobrecarga

19 - Explique o polimorfismo de sobrecarga.
R: Quando uma mesma classe possui mais de um método com o mesmo nome, mas com parâmetros diferentes.

20 - Explique o polimorfismo de sobreposição.
R: Quando tem dois métodos do mesmo tipo com o mesmo valor com a mesma assinatura, só que em classes diferentes.