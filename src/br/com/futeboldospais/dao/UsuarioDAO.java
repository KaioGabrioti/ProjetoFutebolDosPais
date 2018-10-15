package br.com.futeboldospais.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.futeboldospais.dto.UsuarioDTO;
import br.com.futeboldospais.model.Usuario;

@Repository
public class UsuarioDAO {
	@PersistenceContext
	EntityManager manager;
	
	public Integer cadastrarUsuario(UsuarioDTO usuarioDTO) throws IOException {
		manager.persist(usuarioDTO);
		return usuarioDTO.getId();
	}

	public Usuario buscarUsuarioPorId(Integer id) throws IOException{
		return manager.find(Usuario.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> buscarUsuarioPorLogin(String chave) throws IOException {
		Query query = manager.createQuery("select u from usuario u where u.login like :chave");
		query.setParameter("query", "%"+chave+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<UsuarioDTO> buscarUsuario() throws IOException {
		return manager.createQuery("select u from usuario u").getResultList();
	}
	public void atualizarUsuario(UsuarioDTO usuarioDTO) throws IOException{
		manager.merge(usuarioDTO);
	}
	public void excluirUsuario(Integer id) throws IOException{
		manager.remove(manager.find(Usuario.class, id));
	}
	

	@SuppressWarnings("unchecked")
	public List<Usuario> autenticarUsuario(UsuarioDTO autenticado)throws IOException{
		
		Usuario usuario = new Usuario();
		
		autenticado.setLogin(usuario.getLogin());
		
		Query query = manager.createQuery("select u from usuario u where u.login = :autenticado");
		
		query.setParameter("query", "autenticado");
		
		return query.getResultList();
		
		
	}
}