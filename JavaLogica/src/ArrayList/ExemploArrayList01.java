package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList01 {

	public static void main(String[] args) {
		String aula1 = "MySql";
		String aula2 = "Java";
		String aula3 = "Phyton";
		
		ArrayList<String> curso = new ArrayList<>();
		System.out.println(curso);
		curso.add(aula1);
		curso.add(aula2);
		curso.add(aula3);
		System.out.println(curso);
		curso.add("JavaScript");
		System.out.println(curso);
		curso.remove(3);
		System.out.println(curso);
		System.out.println(curso.get(1));
		String x=curso.get(1);
		System.out.println(x);
		System.out.println(curso.size());
		//curso.remove(1);
		if(curso.contains("Java"))
			System.out.println("E um ótimo curso");
		else
			System.out.println("Que pena eu queria aprender Java");
		Collections.sort(curso);
		System.out.println(curso);
		curso.clear();
		System.out.println(curso);
	}

}
