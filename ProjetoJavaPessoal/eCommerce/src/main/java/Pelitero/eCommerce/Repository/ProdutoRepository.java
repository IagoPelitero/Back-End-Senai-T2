package Pelitero.eCommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pelitero.eCommerce.Model.Produto;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByCategoriaContainingIgnoreCase(String categoria);
	public List<Produto> findAllByProdutoContainingIgnoreCase(String produto);
	public List<Produto> findAllByQuantidade(double quantidade);
	public List<Produto> findAllByVUnitario(double vUninitario);
	public List<Produto> findAll();

}
