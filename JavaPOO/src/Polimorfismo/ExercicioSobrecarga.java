package Polimorfismo;

public class ExercicioSobrecarga {
	int n1=5, n2=7;
	
	public void soma() {
		
		System.out.println(n1+n2);
	}
	
	public void soma(int x) {
		System.out.println(n1+x);
	}
	
	public void soma(double x) {
		System.out.println(x+n2);
	}
	
	public void soma(int x, double y) {
		System.out.println(x+y);
	}

	public void subtracao() {
		System.out.println(n1-n2);
	}
	
	public void subtracao(int x) {
		System.out.println(n1-x);
	}
	public void subtracao(double x) {
		System.out.println(x-n2);
	}
	public void subtracao(int x, double y) {
		System.out.println(x-y);
	}
	
	public void multiplicacao() {
		System.out.println(n1*n2);
	}
	public void multiplicacao(int x) {
		System.out.println(n1*x);
	}
	public void multiplicacao(double x) {
		System.out.println(x*n2);
	}
	public void multiplicacao(int x, double y) {
		System.out.println(x*y);
	}
	
	public void divisao() {
		System.out.println(n1/n2);
	}
	public void divisao(int x) {
		System.out.println(n1/x);
	}
	public void divisao(double x) {
		System.out.println(x/n2);
	}
	public void divisao(int x, double y) {
		System.out.println(x/y);
	}
}
