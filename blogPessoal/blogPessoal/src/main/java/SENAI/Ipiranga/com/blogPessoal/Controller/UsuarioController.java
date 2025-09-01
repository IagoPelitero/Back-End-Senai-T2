package SENAI.Ipiranga.com.blogPessoal.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SENAI.Ipiranga.com.blogPessoal.Model.Usuario;
import SENAI.Ipiranga.com.blogPessoal.Repository.UsuarioRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/nome/{nome}") 
	public ResponseEntity<List<Usuario>> getAllByNomeContainingIgnoreCase(@PathVariable String nome){
		return ResponseEntity.ok(repository.findByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<Usuario>> getById(@PathVariable Long id){
		return ResponseEntity.ok(repository.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> post(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
	}
	
    @PutMapping
    public ResponseEntity put (@RequestBody Usuario usuario) {
    	return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
    }
    
    @DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
