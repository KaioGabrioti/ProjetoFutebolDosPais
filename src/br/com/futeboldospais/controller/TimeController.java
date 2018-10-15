package br.com.futeboldospais.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.futeboldospais.dto.TimeDTO;
import br.com.futeboldospais.model.Time;
import br.com.futeboldospais.service.TimeService;

@RequestMapping(value = "/time")
public class TimeController {
	@Autowired
	TimeService timeService;

	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ResponseEntity<TimeDTO> cadastrarTime(@RequestBody TimeDTO timeDTO) throws IOException{
		Time time = timeService.cadastrarTime(timeDTO);

		timeDTO.setId(time.getId());
		timeDTO.setNome(time.getNome());

		return new ResponseEntity<TimeDTO>(timeDTO, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/alterar", method = RequestMethod.POST)
	public ResponseEntity<TimeDTO> alterarUsuario(@RequestBody TimeDTO timeDTO) throws IOException{
		Time time = timeService.atualizarTime(timeDTO);

		time.setId(time.getId());
		time.setNome(time.getNome());
		
		return new ResponseEntity<TimeDTO>(timeDTO, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/delete/{time-id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteCampeonato(@PathVariable("time-id") Integer id) throws IOException{

		timeService.excluirTime(id);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/search/{time-id}", method = RequestMethod.GET)
	public ResponseEntity<?>buscarTimePorId(@PathVariable("time-id") Integer id) throws IOException{
		
		timeService.buscarTimePorId(id);
		
		if (id != null) {
            return new ResponseEntity<>(id, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity<?>buscarTodosOsCampeonatos(@RequestBody List<TimeDTO> timeDTO) throws IOException{
		
		timeDTO = timeService.buscarTime();
		
		if (timeDTO != null) {
            return new ResponseEntity<>(timeDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	@RequestMapping(value = "/search/{time-nome}", method = RequestMethod.GET)
	public ResponseEntity<?>bsucarUsuarioPorNome(@PathVariable("time-nome") TimeDTO nome) throws IOException{
		
		
		nome = timeService.buscarTimePorNome(nome);
		
		if (nome != null) {
            return new ResponseEntity<>(nome, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
}
