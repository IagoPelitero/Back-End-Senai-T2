package introducao;

import java.util.Scanner;

public class ExemploVar02 {

	public static void main(String[] args) {
		Scanner onePiece = new Scanner(System.in);
		String nome= "Monkey D. Luffy";
		int idade;
		double altura;
		System.out.print("Digite sua idade: ");
		idade=onePiece.nextInt();
		System.out.print("Digite sua altura: ");
		altura=onePiece.nextDouble();
		System.out.println("Seu nome é: "+nome+" você tem "+altura+" de altura e "+idade+" anos de idade");

	}

}
