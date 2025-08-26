package SENAI.Ipiranga.com.blogPessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SENAI.Ipiranga.com.blogPessoal.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findByNomeContainingIgnoreCase(String nome);
	public List<Usuario> findById(long id);
	public List<Usuario> findAll();
}
