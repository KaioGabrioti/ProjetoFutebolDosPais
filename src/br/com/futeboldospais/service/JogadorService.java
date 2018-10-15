package br.com.futeboldospais.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.futeboldospais.dao.JogadorDAO;
import br.com.futeboldospais.dto.EstadioDTO;
import br.com.futeboldospais.dto.JogadorDTO;
import br.com.futeboldospais.model.Estadio;
import br.com.futeboldospais.model.Jogador;

@Service
public class JogadorService {
	
	@Autowired
	private JogadorDAO dao;
	
	public Jogador buscarJogadorPorId(Integer id) throws IOException{
		return dao.buscarJogadorPorId(id);
	}
	
	public List<JogadorDTO> buscarJogador() throws IOException{
		return dao.buscarJogador();
	}
	
	public JogadorDTO buscarJogadorPorNome(JogadorDTO jogadorDTO){
		try {
			dao.buscarJogadorPorNome(jogadorDTO.getNome());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jogadorDTO;
	}
	
	//@Transactional
	public Jogador cadastrarJogador(JogadorDTO jogadorDTO) throws IOException {
		dao.cadastrarJogador(jogadorDTO);
		
		Jogador jogador = new Jogador();
		
		jogador.setId(jogadorDTO.getId());
		
		return jogador;
	}

	@Transactional
	public Jogador atualizarJogador(JogadorDTO jogadorDTO) throws IOException{
		dao.atualizarJogador(jogadorDTO);
	}
	
	//@Transactional
	public void excluirJogador(Integer id) throws IOException{
		dao.excluirJogador(id);
	}	
}
