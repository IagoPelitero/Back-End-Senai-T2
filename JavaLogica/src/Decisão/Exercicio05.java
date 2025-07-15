package Decisão;

import java.util.Scanner;

public class Exercicio05 {

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
