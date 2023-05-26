package br.com.cotiinformatica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario") // nome da tabela
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario { // mapeamento para traduzir ao spring data como fica no banco de dados para
						// fazer o cadastro dos usuários

	@Id // chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // campo serial = para ser numerado automaticamente AUTOWIRED é
														// pro controlador e GeneratedValue é pro banco de dados
	@Column(name = "idusuario") // mapeia a coluna Id Usuario
	private Integer idUsuario;

	@Column(name = "nome", length = 150, nullable = false)
	private String nome;

	@Column(name = "email", length = 100, nullable = false, unique = true)
	private String email;

	@Column(name = "senha", length = 40, nullable = false)
	private String senha;

}
