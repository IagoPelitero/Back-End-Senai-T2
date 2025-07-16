package Decisão;

import java.util.Scanner;

public class ExemploSwitch01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, op;
		System.out.println("Digite o primeiro número: ");
		n1=ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2=ler.nextInt();
		System.out.println("Escolha uma operação matematica\n1-soma\n2-subtracao\n3-divisao\n4-multiplicacao:");
		op=ler.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("A soma dos dois numeros e: "+(n1+n2));
			break;
		case 2:
			System.out.println("A subtracao dos dois numeros e: "+(n1-n2));
			break;
		case 3:
			if(n2==0)
				System.out.println("Divisao invalida!!!");
			else
				System.out.println("A divisao dos dois numeros e: "+n1/n2);
			break;
		case 4:
				System.out.println("A multiplicacao dos dois numeros e: "+n1*n2);
				break;
		default: System.out.println("Opcao invalida!!!"); 
		}
	}

}