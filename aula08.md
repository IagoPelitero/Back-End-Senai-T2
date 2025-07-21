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

