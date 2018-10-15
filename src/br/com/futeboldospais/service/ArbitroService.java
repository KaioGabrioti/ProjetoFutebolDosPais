package br.com.futeboldospais.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.futeboldospais.dao.ArbitroDAO;
import br.com.futeboldospais.dto.ArbitroDTO;
import br.com.futeboldospais.dto.UsuarioDTO;
import br.com.futeboldospais.model.Arbitro;
import br.com.futeboldospais.model.Usuario;

@Service
public class ArbitroService {

	@Autowired
	private ArbitroDAO dao;
	
	public Arbitro buscarArbitroPorId(Integer id) throws IOException{
		return dao.buscarArbitroPorId(id);
	}
	
	public List<ArbitroDTO> buscarArbitro() throws IOException{
		return dao.buscarArbitro();
	}
	
	public ArbitroDTO buscarArbitroPorNome(ArbitroDTO arbitroDTO){
		try {
			dao.buscarArbitroPorNome(arbitroDTO.getNome());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arbitroDTO;
	}
	
	//@Transactional
	public Arbitro cadastrarArbitro(ArbitroDTO arbitroDTO) throws IOException {
		dao.cadastrarArbitro(arbitroDTO);
		
		Arbitro arbitro = new Arbitro();
		
		arbitro.setId(arbitroDTO.getId());
		
		return arbitro;
	}

	@Transactional
	public Arbitro atualizarArbitro(ArbitroDTO arbitroDTO) throws IOException{
		dao.atualizarArbitro(arbitroDTO);
	}
	
	//@Transactional
	public void excluirArbitro(Integer id) throws IOException{
		dao.excluirArbitro(id);
	}	
}
