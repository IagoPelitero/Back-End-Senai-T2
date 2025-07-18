# Operadores aritiméticos, relacionais e atribuição.

## Operadores aritiméticos

`+` -> adição
`-` -> subtração
`*` -> multiplicação
`/` -> divisão
`%` - módulo (resto da divisão)

## Operadores relacionais

`>` maior que
`<` menor que
`>=` maior ou igual a
`<=` menor ou igual a
`==` igual a
`!=` diferente de

### Incremento ou decremento
A posição do ++ ou -- são muito importantes no Java: (variável) ++ (Eu uso a variável e acrescento 1) ou ++(variável) (eu acrescento 1 antes da variável)

System.out.printIn("b="+b) => siginifica que b vale x ou seja o + uma única vez concatane com a variável.

# Exercícios 
1. Elaborar um programa onde o usuário digite sua idade, caso seja menor, apareça a mensagem proibida a entrada.
2. Refaça o programa anterior mostrando entrada proibida se o usuário for menor de 18 anos e seja bem vindo se o usuário tiver 18 anos ou mais.
3. Elabore um programa onde o usuário digite um número e programa informe se o número é par ou ímpar.
4. Elabora um programa onde o usuário informe a altura de duas pessoas e o programa retorne que é mais alto ou se não da mesma altura.
5. Faça um programa onde o usuário entre com seu peso, e altura e o programa mostre o IMC e uma das seguintes frases: IMC menor que 17 muito abaixo do peso, IMC maior que 17 e mnor que 18.5 abaixo do peso, IMC maior que 18.5 e menor que 25 parabéns peso ideal, IMC maior que 25 e menor que 30 acima do peso, IMC maior que 30 e menor que 35 obesidade 1, IMC maior que 35 e menor que 40 obesidade 2 (severa), IMC maior que 40 obesidade 3 (mórbida).

## Respostas em Java
1 - 
~~~Java
package Decisão;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade=ler.nextInt();
		if(idade < 18)
			System.out.println("Ops! Você não tem a idade permitida!");

	}

}
~~~
2 -
~~~Java
package Decisão;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade=ler.nextInt();
		if(idade < 18)
			System.out.println("Ops! Você não tem a idade permitida!");
		else
			System.out.println("Usuário aceito (Possui 18 anos ou mais). Seja bem vindo!");

	}

}
~~~
3 - 
~~~Java
package Decisão;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int number, result;
		System.out.println("Digite um número: ");
		number=ler.nextInt();
		result = number % 2;
		if(result==0)
			System.out.println("Este número é par!");
		else
			System.out.println("Este número é ímpar!");

	}

}
~~~
4 - 
~~~Java
package Decisão;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float alt1, alt2;
		System.out.println("Digite a primeira altura: ");
		alt1=ler.nextFloat();
		System.out.println("Digite a segunda altura: ");
		alt2=ler.nextFloat();
		if(alt1<alt2)
			System.out.println("A segunda digitada é mais alta!");
		else if(alt1==alt2)
			System.out.println("Ambos possuem a mesma altura!");
		else
			System.out.println("A primeira digitada é mais alta!");

	}

}
~~~
5 -
~~~Java
public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int peso;
		float alt, imc;
		System.out.println("Informe seu peso: ");
		peso=ler.nextInt();
		System.out.println("Informe sua altura: ");
		alt=ler.nextFloat();
		imc=peso/(alt*alt);
		if(imc<17)
			System.out.println("Muito abaixo do peso!");
		else if(imc>17 && imc<18.5)
			System.out.println("Abaixo do peso");
		else if(imc>18.5 && imc<25)
			System.out.println("Peso ideal!");
		else if(imc>25 && imc<30)
			System.out.println("Acima do peso");
		else if(imc>30 && imc<35)
			System.out.println("Muito acima do peso");
		else if(imc>35 && imc<40)
			System.out.println("Cuidado!Obesidade severa!");
		else
			System.out.println("Atenção! Obesidade mórbida!");
	}

}
~~~
