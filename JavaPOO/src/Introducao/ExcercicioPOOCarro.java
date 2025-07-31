package Introducao;

import java.util.Scanner;

import Teste.Carro;

public class ExcercicioPOOCarro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o modelo: ");
		String x=ler.next();
		System.out.println("Digite a marca: ");
		String y=ler.next();
		System.out.println("Digite a cor desejada: ");
		String z=ler.next();
		Carro car = new Carro(x,y,z);
		car.setAno(2001);
		car.ligar();
		car.acelerar();
		System.out.println("O carro está ligado? "+car.isLigado());
		System.out.println("A velocidade atual é: "+car.getVelocidade());
		car.estado();
	}

}
