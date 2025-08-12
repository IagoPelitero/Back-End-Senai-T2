package Heranca;

public class ExemploHeranca01 {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		Pessoa p = new Pessoa();
		
		System.out.println("Dados do objeto Pessoa");
		p.cadastro("Pedro", "Rua da visao", "11986628804", 10);
		p.estado();
		System.out.println("Dados do obejto Aluno");
		a.cadastro("Iago", "Rua da visao, 0, bl82 ap21, Jd Sto Andre", "11978059550", 27);
		a.estado();

	}

}
