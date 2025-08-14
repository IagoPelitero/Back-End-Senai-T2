package Arraylist;

import java.util.ArrayList;

public class ExemploAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Power Bi", 30);
		Aula a2 = new Aula("Python", 30);
		Aula a3 = new Aula("Back End", 160);
		
		ArrayList<Aula> curso = new ArrayList<Aula>();
		System.out.println(curso);
		curso.add(a3);
		curso.add(a2);
		curso.add(a1);
		System.out.println(curso);
		curso.remove(1);
		System.out.println(curso);

	}

}
