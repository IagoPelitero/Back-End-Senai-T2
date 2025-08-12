package Heranca;

public class Aluno extends Pessoa{
	private int ra;
	private String curso;
	
	public void entregarAtividade() {
		System.out.println("Atividade entregue...");
	}

	@Override
	public void estado() {
		System.out.println("O nome do aluno e: "+this.nome);
		System.out.println("O endereco do aluno e: "+this.endereco);
		System.out.println("O telefone do aluno e: "+this.tel);
		System.out.println("A idade da pessoa do aluno e: "+this.idade+" anos");
	}
}
