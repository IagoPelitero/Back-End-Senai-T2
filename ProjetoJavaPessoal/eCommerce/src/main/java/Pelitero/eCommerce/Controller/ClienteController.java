package Pelitero.eCommerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pelitero.eCommerce.Model.Cliente;
import Pelitero.eCommerce.Repository.ClienteRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Cliente>> getAllByNomeContainingIgonoreCase(String nome){
		return ResponseEntity.ok(repository.findByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<Cliente>> getById(Long id){
		return ResponseEntity.ok(repository.findById(id));
	}

}
