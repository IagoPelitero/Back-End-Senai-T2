package Pelitero.eCommerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pelitero.eCommerce.Model.Pedido;
import Pelitero.eCommerce.Repository.PedidoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nitens/{nitens}") 
	public ResponseEntity<List<Pedido>> getAllNItens(long nItens){
		return ResponseEntity.ok(repository.findByAllNItens(nItens));
	}

	@GetMapping("/qitens/{qitens}") 
	public ResponseEntity<List<Pedido>> getAllQItens(int qItens){
		return ResponseEntity.ok(repository.findByAllQItens(qItens));
	}
	
	@GetMapping("/vfinal/{vfinal}") 
	public ResponseEntity<List<Pedido>> getAllVFinal(double vFinal){
		return ResponseEntity.ok(repository.findByAllVFinal(vFinal));
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<Pedido>> getById(@PathVariable Long id){
		return ResponseEntity.ok(repository.findById(id));
	}
}
