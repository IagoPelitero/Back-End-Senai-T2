package Pelitero.eCommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pelitero.eCommerce.Model.Pedido;

@Repository

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	public List<Pedido> findByNItens(long nItens);
	public List<Pedido> findByQItens(int qItens);
	public List<Pedido> findByVFinal(double vFinal);
	public List<Pedido> findById(long id);
	public List<Pedido> findAll();

}
