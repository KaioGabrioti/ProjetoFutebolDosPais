package br.com.futeboldospais.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.futeboldospais.dao.CampeonatoDAO;
import br.com.futeboldospais.dto.CampeonatoDTO;
import br.com.futeboldospais.dto.UsuarioDTO;
import br.com.futeboldospais.model.Campeonato;
import br.com.futeboldospais.model.Usuario;

@Repository
public class CampeonatoService {
	
	@Autowired
	private CampeonatoDAO dao;
	
	public Campeonato buscarCampeonatoPorId(Integer id) throws IOException{
		return dao.buscarCampeonatoPorId(id);
	}
	
	public List<CampeonatoDTO> buscarCampeonato() throws IOException{
		return dao.buscarCampeonato();
	}
	
	public CampeonatoDTO buscarCampeonatoPorNome(CampeonatoDTO campeonatoDTO){
		try {
			dao.buscarCampeonatoPorNome(campeonatoDTO.getNome());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return campeonatoDTO;
	}
	
	//@Transactional
	public Campeonato cadastrarCampeonato(CampeonatoDTO campeonatoDTO) throws IOException {
		Integer id = dao.cadastrarCampeonato(campeonatoDTO);
		
		Campeonato campeonato = new Campeonato();
		
		campeonato.setId(campeonatoDTO.getId());
		
		return campeonato;
	}

	@Transactional
	public Campeonato atualizarCampeonato(CampeonatoDTO campeonatoDTO) throws IOException{
		dao.atualizarCampeonato(campeonatoDTO);
	}
	
	//@Transactional
	public void excluriCampeonato(Integer id) throws IOException{
		dao.excluirCampeonato(id);
	}
}
