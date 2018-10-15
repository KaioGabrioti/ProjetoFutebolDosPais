package br.com.futeboldospais.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.futeboldospais.dto.TimeDTO;
import br.com.futeboldospais.model.Time;

@Repository
public class TimeDAO {
	
	@PersistenceContext
	EntityManager manager;
	
	public Integer cadastrarTime(TimeDTO timeDTO) throws IOException {
		manager.persist(timeDTO);
		return timeDTO.getId();
	}

	public Time buscarTimePorId(Integer id) throws IOException{
		return manager.find(Time.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Time> buscarTimePorNome(String chave) throws IOException {
		Query query = manager.createQuery("select t from time t where t.nome like :chave");
		query.setParameter("query", "%"+chave+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<TimeDTO> buscarTime() throws IOException {
		return manager.createQuery("select t from time t").getResultList();
	}
	public void atualizarTime(TimeDTO timeDTO) throws IOException{
		manager.merge(timeDTO);
	}
	public void excluirTime(Integer id) throws IOException{
		manager.remove(manager.find(Time.class, id));
	}
}
