# Programando em JAVA

O que é variável?

É um espaço de memória que guarda informações que podem ser alteradas em um código. Variável ou seja pode mudar a informação armazenada. (guarda em memória RAM)

Curiosidade!!! Tem uma linguagem fortemente typada. 

Para criar uma variável em JAVA:

- Tipo de dados: inteiro (não são fracionados ou possuem mais casas decimais), Float (números com casas decimais), Double (valores decimais, possui um array maior), char (caracteres),
- byte (dados pequenos até 127 ou -127), short (dados entre -32768 e 32767), boolean (true or false), string (grava informações de textos).
Ele não aceita que seja incluso informações de uma variável a outra diferente.
Mais usados: `Int`, `Double`, `Boolean`, `String`.

- Nome: precisa ser escolhido para ser identificado.

Dica: sempre criar a variável no começo do código.

ALgumas varáveis não são aceitas, essas são: comandos (double, while, for, etc), números antes das letras, não pode conter espaço em branco.
Lembre-se!!! O JAVA é altamente case sensitive ou seja lê a instrução em letras minúsculas ou maiúsculas para excutar o comando diferenciando-as.

Não podemos ter uma variável com o mesmo nome no mesmo escopo (ou seja para a mesma caixa de instrução e não pode ser reutilizado uma variável que está sendo usada em uma caixa maior).

Quando criar uma nova class e nomeá-la sempre colocar a primeira letra em maiúsculo como boa prática.

Tem um comando que preenche automático que é o sysout depois `ctrl + espaço`

## Excercício 01

Faça um programa onde o usuário entre com 4 notas e o programa mostre a média.
~~~Java
package introducao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner media = new Scanner(System.in);
		double nota1, nota2, nota3, nota4;
		System.out.print("Digite sua primeira nota: ");
		nota1=media.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		nota2=media.nextDouble();
		System.out.print("Digite sua terceira nota: ");
		nota3=media.nextDouble();
		System.out.print("Digite sua última nota: ");
		nota4=media.nextDouble();
		double notaFinal= (nota1 + nota2 + nota3 + nota4)/4;		
		System.out.print("Sua nota final é a: "+notaFinal);
		

	}

}
~~~

## Excercício 02
Crie um programa onde o usuário entre com sua idade em anos, meses e dias e o programe mostre quantos dias o usuário tem de nascido.
~~~Java
package introducao;

import java.util.Scanner;

public class Exercecio02 {

	public static void main(String[] args) {
		Scanner diasNasc = new Scanner(System.in);
		int anos, meses, dias;
		System.out.print("Digite quantos anos tem: ")
		anos=diasNasc.nextInt();
		System.out.print("Digite quantos meses tem: ")
		meses=diasNasc.nextInt();
		System.out.print("Digite quantos dias tem: ")
		dias=diasNasc.nextInt();
		int diasTotais= (anos * 365) + (meses * 30) + dias;
		System.out.print("Você possui: "+diasTotais);
		
	}

}
~~~
