package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

/*
 * Design Pattern => DAO => Data Access Object
 * O DAO é uma classe ou interface responsável pelo CRUD (Create Read Update Delete).
 */
public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
	
	/*
	 * save() => salta um registro da tabela
	 * findById() => pesquisa pela chave primaria
	 * findAll() => pesquida todos
	 * deleteById() => deleta pelo ID
	 * deleteAll => apaga todas as linhas da tabela
	 */
	
	
}
