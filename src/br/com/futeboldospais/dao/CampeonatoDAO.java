package br.com.futeboldospais.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.futeboldospais.dto.CampeonatoDTO;
import br.com.futeboldospais.model.Campeonato;

@Repository
public class CampeonatoDAO {
	
	@PersistenceContext
	EntityManager manager;
	
	public Integer cadastrarCampeonato(CampeonatoDTO campeonatoDTO) throws IOException {
		manager.persist(campeonatoDTO);
		return campeonatoDTO.getId();
	}

	public Campeonato buscarCampeonatoPorId(Integer id) throws IOException{
		return manager.find(Campeonato.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Campeonato> buscarCampeonatoPorNome(String chave) throws IOException {
		Query query = manager.createQuery("select c from campeonato c where c.name like :chave");
		query.setParameter("query", "%"+chave+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<CampeonatoDTO> buscarCampeonato() throws IOException {
		return manager.createQuery("select c from campeonato c").getResultList();
	}
	
	public void atualizarCampeonato(CampeonatoDTO campeonatoDTO) throws IOException{
		manager.merge(campeonatoDTO);
	}
	public void excluirCampeonato(Integer id) throws IOException{
		manager.remove(manager.find(Campeonato.class, id));
	}
}
