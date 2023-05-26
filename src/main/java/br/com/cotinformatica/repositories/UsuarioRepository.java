package br.com.cotinformatica.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.entities.Usuario;

@Repository // annotation do spring boot para definir um repositorio do spring data para
			// herdar as operações de CRUD //JPQL = JAVA
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> { // interface é para herdar tudo pronto da
																				// classe Usuário

	@Query("select u from Usuario u where u.email = :email")
	Optional<Usuario> findByEmail(@Param("email") String email); // um único usuário baseado por email

	@Query("select u from Usuario u where u.email = :email and u.senha = :senha") // para trazer um único usuário
																					// baseado por email e senha
	Optional<Usuario> findByEmailAndSenha(@Param("email") String email, @Param("senha") String senha); // método para
																										// passar dois
																										// argumentos
																										// email e senha

}
