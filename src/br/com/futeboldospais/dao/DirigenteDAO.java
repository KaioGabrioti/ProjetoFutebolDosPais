package br.com.futeboldospais.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.futeboldospais.dto.DirigenteDTO;
import br.com.futeboldospais.model.Dirigente;

@Repository
public class DirigenteDAO {

	@PersistenceContext
	EntityManager manager;
	
	public Integer cadastrarDirigente(DirigenteDTO dirigenteDTO) throws IOException {
		manager.persist(dirigenteDTO);
		return dirigenteDTO.getId();
	}

	public Dirigente buscarDirigentePorId(Integer id) throws IOException{
		return manager.find(Dirigente.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Dirigente> buscarDirigentePorNome(String chave) throws IOException {
		Query query = manager.createQuery("select d from dirigente d where d.nome like :chave");
		query.setParameter("query", "%"+chave+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<DirigenteDTO> buscarDirigente() throws IOException {
		return manager.createQuery("select d from dirigente d").getResultList();
	}
	public void atualizarDirigente(DirigenteDTO dirigenteDTO) throws IOException{
		manager.merge(dirigenteDTO);
	}
	public void excluirDirigente(Integer id) throws IOException{
		manager.remove(manager.find(Dirigente.class, id));
	}	
}
