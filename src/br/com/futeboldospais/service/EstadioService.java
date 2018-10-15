package br.com.futeboldospais.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.futeboldospais.dao.EstadioDAO;
import br.com.futeboldospais.dto.EstadioDTO;
import br.com.futeboldospais.model.Estadio;

@Service
public class EstadioService {
	
	@Autowired
	private EstadioDAO dao;
	
	public Estadio buscarEstadioPorId(Integer id) throws IOException{
		return dao.buscarEstadioPorId(id);
	}
	
	public List<EstadioDTO> buscarEstadio() throws IOException{
		return dao.buscarEstadio();
	}
	
	public EstadioDTO buscarEstadioPorNome(EstadioDTO estadioDTO){
		try {
			dao.buscarEstadioPorNome(estadioDTO.getNome());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estadioDTO;
	}
	
	//@Transactional
	public Estadio cadastrarEstadio(EstadioDTO estadioDTO) throws IOException {
		dao.cadastrarEstadio(estadioDTO);
		
		Estadio estadio = new Estadio();
		
		estadio.setId(estadioDTO.getId());
		
		return estadio;
	}

	@Transactional
	public Estadio atualizarEstadio(EstadioDTO estadioDTO) throws IOException{
		dao.atualizarEstadio(estadioDTO);
	}
	
	//@Transactional
	public void excluirEstadio(Integer id) throws IOException{
		dao.excluirEstadio(id);
	}	

	
}
