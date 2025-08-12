package Heranca;

public class Pessoa {
	protected String nome;
	protected String endereco;
	protected String tel;
	protected int idade;
	
	public void aniversario() {
		this.idade++;
	}
	
	public void cadastro (String n, String e, String t, int i) {
		this.nome=n;
		this.endereco=e;
		this.tel=t;
		this.idade=i;
		
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTel() {
		return tel;
	}


	public int getIdade() {
		return idade;
	}
	
	public void estado() {
		System.out.println("O nome e: "+this.nome);
		System.out.println("O endereco e: "+this.endereco);
		System.out.println("O telefone e: "+this.tel);
		System.out.println("A idade da pessoa e: "+this.idade+" anos");
	}

}
