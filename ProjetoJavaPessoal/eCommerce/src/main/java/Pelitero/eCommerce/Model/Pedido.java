package Pelitero.eCommerce.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="pedido")

public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long nItens;
	private int qItens;
	private double vFinal;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("pedido")
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getnItens() {
		return nItens;
	}

	public void setnItens(long nItens) {
		this.nItens = nItens;
	}

	public int getqItens() {
		return qItens;
	}

	public void setqItens(int qItens) {
		this.qItens = qItens;
	}

	public double getvFinal() {
		return vFinal;
	}

	public void setvFinal(double vFinal) {
		this.vFinal = vFinal;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
