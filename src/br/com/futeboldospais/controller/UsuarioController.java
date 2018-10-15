package br.com.futeboldospais.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.futeboldospais.dto.UsuarioDTO;
import br.com.futeboldospais.model.Usuario;
import br.com.futeboldospais.service.UsuarioService;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value = "/search/{usuario-id}", method = RequestMethod.GET)
	public ResponseEntity<?>buscarUsuario(@PathVariable("usuario-id") Integer id) throws IOException{
		
		usuarioService.buscarUsuarioPorId(id);
		
		if (id != null) {
            return new ResponseEntity<>(id, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity<?>buscarTodosOsUsuarios(@RequestBody List<UsuarioDTO> usuarioDTO) throws IOException{
		
		usuarioDTO = usuarioService.buscarUsuario();
		
		if (usuarioDTO != null) {
            return new ResponseEntity<>(usuarioDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	@RequestMapping(value = "/search/{user-login}", method = RequestMethod.GET)
	public ResponseEntity<?>bsucarUsuarioPorNome(@PathVariable("user-login") UsuarioDTO login) throws IOException{
		
		
		login = usuarioService.buscarUsuarioPorLogin(login);
		
		if (login != null) {
            return new ResponseEntity<>(login, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ResponseEntity<UsuarioDTO> cadastroUsuario(@RequestBody UsuarioDTO usuarioDTO) throws IOException{
		
		Usuario usuario = usuarioService.cadastrarUsuario(usuarioDTO);
		
		usuario.setId(usuario.getId());
		usuario.setLogin(usuario.getLogin());
		usuario.setSenha(usuario.getSenha());
		usuario.setActive(Boolean.TRUE);
		
		return new ResponseEntity<UsuarioDTO>(usuarioDTO, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.POST)
	public ResponseEntity<UsuarioDTO> alterarUsuario(@RequestBody UsuarioDTO usuarioDTO) throws IOException{
		Usuario usuario = usuarioService.atualizarUsuario(usuarioDTO);
		
		usuario.setId(usuario.getId());
		usuario.setLogin(usuario.getLogin());
		usuario.setSenha(usuario.getSenha());
		usuario.setActive(Boolean.TRUE);
		
		return new ResponseEntity<UsuarioDTO>(usuarioDTO, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/delete/{user-id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUsuario(@PathVariable("id") Integer id) throws IOException{
		
		usuarioService.excluirUsuario(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
     public String efetuaLogin(UsuarioDTO usuarioDTO, HttpSession session) {
		 
         try {
			if(usuarioService.efetuaLogin(usuarioDTO)) {
			     session.setAttribute("usuarioLogado", usuarioDTO);
			     return "fazer_login";
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         return "redirect:index";
     }
}
