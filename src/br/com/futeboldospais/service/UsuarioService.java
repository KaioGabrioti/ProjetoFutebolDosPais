package br.com.futeboldospais.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.futeboldospais.dao.UsuarioDAO;
import br.com.futeboldospais.dto.UsuarioDTO;
import br.com.futeboldospais.model.Usuario;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioDAO dao;
	
	public Usuario buscarUsuarioPorId(Integer id) throws IOException{
		return dao.buscarUsuarioPorId(id);
	}
	
	public List<UsuarioDTO> buscarUsuario() throws IOException{
		return dao.buscarUsuario();
	}
	
	public UsuarioDTO buscarUsuarioPorLogin(UsuarioDTO usuarioDTO){
		try {
			dao.buscarUsuarioPorLogin(usuarioDTO.getLogin());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarioDTO;
	}
	
	//@Transactional
	public Usuario cadastrarUsuario(UsuarioDTO usuarioDTO) throws IOException {
		dao.cadastrarUsuario(usuarioDTO);
		
		Usuario usuario = new Usuario();
		
		usuario.setId(usuarioDTO.getId());
		
		return usuario;
	}

	@Transactional
	public Usuario atualizarUsuario(UsuarioDTO usuarioDTO) throws IOException{
		dao.atualizarUsuario(usuarioDTO);
	}
	
	//@Transactional
	public void excluirUsuario(Integer id) throws IOException{
		dao.excluirUsuario(id);
	}
	
	@Transactional
	public boolean efetuaLogin (UsuarioDTO usuarioDTO) throws IOException{
		dao.autenticarUsuario(usuarioDTO);
		
		return true;
	}
}
