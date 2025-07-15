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
