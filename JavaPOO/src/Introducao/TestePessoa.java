package Introducao;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa dados = new Pessoa();
		System.out.println("Digite seu nome: ");
		String x=ler.next();
		System.out.println("Digite sua idade: ");
		int y=ler.nextInt();
		System.out.println("Digite sua profissao: ");
		String z=ler.next();
		dados.setNome(x);
		dados.setIdade(y);
		dados.setProfissao(z);
		
		System.out.println("O nome digitado é "+dados.getNome());
		System.out.println("A profissão digitada é "+dados.getProfissao());
		System.out.println("A idade digitada é "+dados.getIdade());;
	

	}

}
