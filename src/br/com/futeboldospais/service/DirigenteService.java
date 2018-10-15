package br.com.futeboldospais.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.futeboldospais.dao.DirigenteDAO;
import br.com.futeboldospais.dto.DirigenteDTO;
import br.com.futeboldospais.model.Dirigente;

@Service
public class DirigenteService {
	
	@Autowired
	private DirigenteDAO dao;
	
	public Dirigente buscarDirigentePorId(Integer id) throws IOException{
		return dao.buscarDirigentePorId(id);
	}
	
	public List<DirigenteDTO> buscarDirigente() throws IOException{
		return dao.buscarDirigente();
	}
	
	public DirigenteDTO buscarDirigentePorNome(DirigenteDTO dirigenteDTO){
		try {
			dao.buscarDirigentePorNome(dirigenteDTO.getNome());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dirigenteDTO;
	}
	
	//@Transactional
	public Dirigente cadastrarDirigente(DirigenteDTO dirigenteDTO) throws IOException {
		dao.cadastrarDirigente(dirigenteDTO);
		
		Dirigente dirigente = new Dirigente();
		
		dirigente.setId(dirigenteDTO.getId());
		
		return dirigente;
	}

	@Transactional
	public Dirigente atualizarDirigente(DirigenteDTO dirigenteDTO) throws IOException{
		dao.atualizarDirigente(dirigenteDTO);
	}
	
	//@Transactional
	public void excluirDirigente(Integer id) throws IOException{
		dao.excluirDirigente(id);
	}
}
