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

import Pelitero.eCommerce.Model.Produto;
import Pelitero.eCommerce.Repository.ProdutoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/categoria/{categoria}")
	public ResponseEntity<List<Produto>> getAllByCategoriaContainingIgnoreCase(String categoria){
		return ResponseEntity.ok(repository.findAllByCategoriaContainingIgnoreCase(categoria));
	}
	
	@GetMapping("/produto/{produto}")
	public ResponseEntity<List<Produto>> getAllByProdutoContainingIgnoreCase(String produto){
		return ResponseEntity.ok(repository.findAllByProdutoContainingIgnoreCase(produto));
	}
	
	@GetMapping("/quantidade/{quantidade}")
	public ResponseEntity<List<Produto>> getAllByQuantidade(double quantidade){
		return ResponseEntity.ok(repository.findAllByQuantidade(quantidade));
	}
	
	@GetMapping("/vunitario/{vunitario}")
	public ResponseEntity<List<Produto>> getAllByVUnitario(double vUnitario){
		return ResponseEntity.ok(repository.findAllByVUnitario(vUnitario));
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<Produto>> getById(@PathVariable Long id){
		return ResponseEntity.ok(repository.findById(id));
	}
}
