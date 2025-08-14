package Heranca;

public abstract class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private double preco;
	
	private boolean ligado;
	private int start;
	
	public void ligar() {
		if(ligado==false) {
			this.ligado=true;
			this.start=10;
		}else 
			System.out.println("O veículo já está ligado...");
		
	}
	
	public void desligar() {
		if(ligado==true)
			this.ligado=false;
		else
			System.out.println("O veículo já está desligado!");
	}
	
	public void acelerar() {
		if(ligado==true && start<100)
			this.start+=10;
		else
			System.out.println("Velocidade máxima atingida!");
		}
	
	public void freiar() {
		if(ligado==true && start>0)
			this.start-=10;
		else
			System.out.println("Velocidade máxima atingida!");
		}
	
	public void estadoVeiculo() {
		System.out.println("A marca do veículo é: "+this.marca);
		System.out.println("O modelo do veículo é: "+this.modelo);
		System.out.println("A cor escolhida foi: "+this.cor);
		System.out.println("O ano do veículo é: "+this.ano);
		System.out.println("O veículo vale R$"+this.preco);
		System.out.println("O veículo está ligado? "+this.ligado);
		System.out.println("Sua velocidade é: "+this.start);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isLigado() {
		return ligado;
	}

	public int getStart() {
		return start;
	}

}
