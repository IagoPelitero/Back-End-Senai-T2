package Polimorfismo;

public class ExemploSobrecarga {
	int n1=5, n2= 8;	

	public void soma() {
		System.out.println("A soma é: "+(n1+n2));
	}
	
	public void soma(int x) {
		System.out.println("A soma é: "+(n1+x));
	}
	
	public void soma(double x) {
		System.out.println("A soma é: "+(n1+x));
	}
	
	public void soma(int x, int y) {
		System.out.println("A soma é: "+(y+x));
	}
	
	public void soma(int x, double y) {
		System.out.println("A soma é: "+(y+x));
	}
	
	public void soma(double y, int x) {
		System.out.println("A soma é: "+(y+x));
	}
	
	public void soma(int x, int y, int z) {
		System.out.println("A soma é: "+(n1+x+z));
	}
	
	public void soma(int x, int y, double z) {
		System.out.println("A soma é: "+(n1+x+z));
	}
}
