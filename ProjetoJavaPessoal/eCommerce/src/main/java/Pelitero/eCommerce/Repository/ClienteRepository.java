package Pelitero.eCommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pelitero.eCommerce.Model.Cliente;

@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	public List<Cliente> findByNomeContainingIgnoreCase(String nome);
	public List<Cliente> findById(long id);

}
