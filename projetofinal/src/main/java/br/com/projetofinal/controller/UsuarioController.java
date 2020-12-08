package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@RestController
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public List<Usuario> getAll() {
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		return lista;		
	}
	
	@GetMapping("/usuario/{idusr}")
	public Usuario getUser(int idusr) {
		Usuario objeto = dao.findById(idusr).orElse(null);
		if (objeto==null) {
			return new Usuario(0,"nao encontrado", "","","");
		} else {
		return objeto;
		}
	}

}
