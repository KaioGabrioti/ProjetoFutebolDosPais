package br.com.futeboldospais.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.futeboldospais.dao.TimeDAO;
import br.com.futeboldospais.dto.TimeDTO;
import br.com.futeboldospais.dto.UsuarioDTO;
import br.com.futeboldospais.model.Time;
import br.com.futeboldospais.model.Usuario;

public class TimeService {
	
	@Autowired
	private TimeDAO dao;
	
	public Time buscarTimePorId(Integer id) throws IOException{
		return dao.buscarTimePorId(id);
	}
	
	public List<TimeDTO> buscarTime() throws IOException{
		return dao.buscarTime();
	}
	
	public TimeDTO buscarTimePorNome(TimeDTO timeDTO){
		try {
			dao.buscarTimePorNome(timeDTO.getNome());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return timeDTO;
	}
	
	//@Transactional
	public Time cadastrarTime(TimeDTO timeDTO) throws IOException {
		Integer id = dao.cadastrarTime(timeDTO);
		
		Time time = new Time();
		
		time.setId(timeDTO.getId());
		
		return time;
	}

	@Transactional
	public Time atualizarTime(TimeDTO timeDTO) throws IOException{
		dao.atualizarTime(timeDTO);
	}
	
	//@Transactional
	public void excluirTime(Integer id) throws IOException{
		dao.excluirTime(id);
	}
}
