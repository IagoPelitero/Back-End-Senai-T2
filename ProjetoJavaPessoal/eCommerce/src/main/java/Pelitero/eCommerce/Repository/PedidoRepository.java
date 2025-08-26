package Pelitero.eCommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pelitero.eCommerce.Model.Pedido;

@Repository

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	public List<Pedido> findByAllNItens(long nItens);
	public List<Pedido> findByAllQItens(int qItens);
	public List<Pedido> findByAllVFinal(double vFinal);
	public List<Pedido> findAll();

}
