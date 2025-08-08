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