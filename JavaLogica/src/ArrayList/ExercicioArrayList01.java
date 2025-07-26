package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> compras = new ArrayList<>();
		String lCompras;
		int decisao;
		
		System.out.println("Lista de compras");
		System.out.println("Digite o produto: ");
		lCompras=ler.next();
		compras.add(lCompras);
		System.out.println("Deseja adicionar mais algum outro produto? (Digite 1 para sim ou 0 para não)");
		decisao=ler.nextInt();
		while(decisao==1)
		{
			System.out.println("Digite o produto: ");
			lCompras=ler.next();
			compras.add(lCompras);
			System.out.println("Deseja adicionar mais algum outro produto? (Digite 1 para sim ou 0 para não)");
			decisao=ler.nextInt();
		}
		
		System.out.println(compras);
		
		System.out.println("Deseja apagar a lista?(Digite 1 para sim ou 0 para não)");
		decisao=ler.nextInt();
		
		if(decisao==1) {
			compras.clear();
			System.out.println("Lista apagada!");
		}
		else
			System.out.println("Fim do laço");
		
		
		
		/*if(decisao==1) {
		
		System.out.println("Informe o outro produto: ");
		lCompras=ler.next();
		compras.add(lCompras);		
		System.out.println("Deseja adicionar mais algum outro produto? (Digite 1 para sim ou 0 para não)");
		decisao=ler.nextInt();
		}
		System.out.println(compras);
		*/
	}

}
