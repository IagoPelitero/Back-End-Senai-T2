# Laço do-while

Ele é usado para que o laço seja executado pelo menos 1 vez.

~~~Java
do
{
instrução;
instrução;
instrução;
} while(teste);
~~~

### Exemplo:
~~~Java
Scanner ler = new Scanner (System.in);
int nr;
do{
	System.out.printIn("Digite um numero (0 para finalizar):");
	nr=ler.nextInt();
	if (nr%2==0)//* se o resto da divisão por 2 for 0
		System.out.printIn("Este número é par");
	else
		System.out.printIn("Este número é impar");
}while (nr!=0); //enquanto nr for diferente de 0
~~~

## Exercício

1 - Faça um programa onde o usuário entre com números e possa escolher qual das operações matemáticas irá ser realizada. Após a realização do cálculo o programa devera perguntar se o usuário deseja realizar outro cáculo, até quando o usuário quiser encerrar o programa.

2 - Faça um programa onde o usuário entre com um número e o programa mostre se é um número par ou ímpar, em seguida o programa deverá perguntar se o usuário repetir o processo.

3 - Faça um programa em que o usuário entre com um número de elementos que deseja que o programa mostre a sequência Fibonacci. (1,1,2,3,5,8,13,21...), em seguida o programa deverá perguntar se o usuário deseja repetir o processo.

4 - Faça um programa onde o usuário escolha a tabuada de inicio e faça até a tabuada do 9, em seguida o programa deverá perguntar se o usuário deseja repertir o processo.

# Vetores e matrizes

Um vetor é coleção de variáveis do mesmo tipo que é referenciada por um nome comum. A sintaxe para
declaração de um vetor é: `tipo nome = new tipo[qtde_elementos]`;

Exemplo: `int vet[]=new int[5];// vetor com 5 elementos do tipo int`

1 - Informar quais são os elementos referencionados pelas expressões a seguir.
mat 5.8 | 7.9 | 4.5 | 3.8 | 1.2 | 2.3 | 7.9 | 4.6 | 2.9 | 2.35 | 8.9 | 10.9

a)mat[2]- 4.5 b)mat[0] - 5.8 c)mat[10] - 8.9 d)mat[6] - 7.9

2 - Qual é a diferença entre os números "4" das duas intruções?
int mat[] = new int[4] // Aqui é a quantidade de indíces que o vetor terá.
mat[4]=5 // Aqui é o índice em que será armazenado o valor.

3 - Desenvolva um programa que leia um vetor de números inteiros, uma variável (também inteira) e 
imprima o resultado da multplicação do vetor pela variável.