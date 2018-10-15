package br.com.futeboldospais.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.futeboldospais.dto.EstadioDTO;
import br.com.futeboldospais.model.Estadio;

@Repository
public class EstadioDAO {

	@PersistenceContext
	EntityManager manager;
	
	public Integer cadastrarEstadio(EstadioDTO estadioDTO) throws IOException {
		manager.persist(estadioDTO);
		return estadioDTO.getId();
	}

	public Estadio buscarEstadioPorId(Integer id) throws IOException{
		return manager.find(Estadio.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Estadio> buscarEstadioPorNome(String chave) throws IOException {
		Query query = manager.createQuery("select e from estadio e where e.nome like :chave");
		query.setParameter("query", "%"+chave+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<EstadioDTO> buscarEstadio() throws IOException {
		return manager.createQuery("select e from estadio e").getResultList();
	}
	public void atualizarEstadio(EstadioDTO estadioDTO) throws IOException{
		manager.merge(estadioDTO);
	}
	public void excluirEstadio(Integer id) throws IOException{
		manager.remove(manager.find(Estadio.class, id));
	}	
}
