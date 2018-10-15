package br.com.futeboldospais.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.futeboldospais.dto.JogadorDTO;
import br.com.futeboldospais.model.Jogador;

@Repository
public class JogadorDAO {

	@PersistenceContext
	EntityManager manager;
	
	public Integer cadastrarJogador(JogadorDTO jogadorDTO) throws IOException {
		manager.persist(jogadorDTO);
		return jogadorDTO.getId();
	}

	public Jogador buscarJogadorPorId(Integer id) throws IOException{
		return manager.find(Jogador.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Jogador> buscarJogadorPorNome(String chave) throws IOException {
		Query query = manager.createQuery("select j from jogador j where j.nome like :chave");
		query.setParameter("query", "%"+chave+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<JogadorDTO> buscarJogador() throws IOException {
		return manager.createQuery("select j from jogador j").getResultList();
	}
	public void atualizarJogador(JogadorDTO jogadorDTO) throws IOException{
		manager.merge(jogadorDTO);
	}
	public void excluirJogador(Integer id) throws IOException{
		manager.remove(manager.find(Jogador.class, id));
	}	
}
