package br.com.futeboldospais.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.futeboldospais.dto.ArbitroDTO;
import br.com.futeboldospais.model.Arbitro;

@Repository
public class ArbitroDAO {

	@PersistenceContext
	EntityManager manager;
	
	public Integer cadastrarArbitro(ArbitroDTO arbitroDTO) throws IOException {
		manager.persist(arbitroDTO);
		return arbitroDTO.getId();
	}

	public Arbitro buscarArbitroPorId(Integer id) throws IOException{
		return manager.find(Arbitro.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Arbitro> buscarArbitroPorNome(String chave) throws IOException {
		Query query = manager.createQuery("select a from arbitro a where a.nome like :chave");
		query.setParameter("query", "%"+chave+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<ArbitroDTO> buscarArbitro() throws IOException {
		return manager.createQuery("select a from arbitro a").getResultList();
	}
	public void atualizarArbitro(ArbitroDTO arbitroDTO) throws IOException{
		manager.merge(arbitroDTO);
	}
	public void excluirArbitro(Integer id) throws IOException{
		manager.remove(manager.find(Arbitro.class, id));
	}
}
