package Repetição;

import java.util.Scanner;

public class ExercicioDoWhile01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, resp;
		do {
			int op;
			System.out.print("Digite o primeiro número: ");
			n1=ler.nextDouble();
			System.out.print("Digite o segundo número: ");
			n2=ler.nextDouble();
			System.out.println("1-Soma:\n2-subtração:\n3-divisão:\n4-multiplicação:");
			op=ler.nextInt();
			switch(op) {
			case 1:
				System.out.println("A soma é: "+(n1+n2));
				break;
			case 2:
				System.out.println("A subtração é: "+(n1-n2));
				break;
			case 3:
				if(n2==0)
					System.out.println("Erro divisão por 0!");
				else
					System.out.println("A divisão é: "+n1/n2);
				break;
			case 4:
				System.out.println("A multiplicação é: "+n1*n2);
				break;
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("Digite 0 para sair ou 1 para continuar: ");
			resp=ler.nextDouble();

	} while (resp!=0);

}
}
