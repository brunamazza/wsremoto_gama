package br.com.projetofinal.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * Classe de definição de usuário
 */
@Entity //indica para o Spring que a classe tem um componente no BD
@Table(name="tb_usuario")
public class Usuario {
	
	//id do usuario no bd
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", length=50)
	private int id;
	
	//nome do usuario
	@Column(name="nome", length=100)
	private String nome;
	
	//email do usuario
	@Column(name="email", length=50)
	private String email;
	
	//senha do usuario
	@Column(name="senha", length=20)
	private String senha;
	
	//url da foto do usuario
	@Column(name="foto", length=100)
	private String foto;
	
	//getter e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	//toString
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + ", foto=" + foto + "]";
	}
	
	//Construtor com campos
	public Usuario(int id, String nome, String email, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}
	
	//Construtor sem campos
	public Usuario() {
		super();
	}
	
}
