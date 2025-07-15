package Decisão;

import java.text.DecimalFormat;
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
		DecimalFormat formato = new DecimalFormat("#.##");
		String imcformatado = formato.format(imc);
		
		if(imc<17)
			System.out.println("Seu IMC e: "+imcformatado+" Muito abaixo do peso!");
		else if(imc>17 && imc<18.5)
			System.out.println("Seu IMC e: "+imcformatado+" Abaixo do peso");
		else if(imc>18.5 && imc<25)
			System.out.println("Seu IMC e: "+imcformatado+" Peso ideal!");
		else if(imc>25 && imc<30)
			System.out.println("Seu IMC e: "+imcformatado+" Acima do peso");
		else if(imc>30 && imc<35)
			System.out.println("Seu IMC e: "+imcformatado+" Muito acima do peso");
		else if(imc>35 && imc<40)
			System.out.println("Seu IMC e: "+imcformatado+" Cuidado!Obesidade severa!");
		else
			System.out.println("Seu IMC e: "+imcformatado+" Atenção! Obesidade mórbida!");
	}

}
