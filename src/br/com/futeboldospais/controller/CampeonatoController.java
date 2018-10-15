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

import br.com.futeboldospais.dto.CampeonatoDTO;
import br.com.futeboldospais.model.Campeonato;
import br.com.futeboldospais.service.CampeonatoService;

@RequestMapping(value = "/campeonato")
public class CampeonatoController {

	@Autowired
	CampeonatoService campeonatoService;

	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ResponseEntity<CampeonatoDTO> cadastrarUsuario(@RequestBody CampeonatoDTO campeonatoDTO) throws IOException{
		Campeonato campeonato = campeonatoService.cadastrarCampeonato(campeonatoDTO);

		campeonatoDTO.setId(campeonato.getId());
		campeonatoDTO.setNome(campeonato.getNome());
		campeonatoDTO.setTime(campeonato.getTime());
		
		return new ResponseEntity<CampeonatoDTO>(campeonatoDTO, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/alterar", method = RequestMethod.POST)
	public ResponseEntity<CampeonatoDTO> alterarUsuario(@RequestBody CampeonatoDTO campeonatoDTO) throws IOException{
		Campeonato campeonato = campeonatoService.atualizarCampeonato(campeonatoDTO);

		campeonatoDTO.setId(campeonato.getId());
		campeonatoDTO.setNome(campeonato.getNome());
		campeonatoDTO.setTime(campeonato.getTime());

		return new ResponseEntity<CampeonatoDTO>(campeonatoDTO, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/delete/{campeonato-id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteCampeonato(@PathVariable("campeonato-id") Integer id) throws IOException{

		campeonatoService.excluriCampeonato(id);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/search/{campeonato-id}", method = RequestMethod.GET)
	public ResponseEntity<?>buscarCampeonatoPorId(@PathVariable("campeonato-id") Integer id) throws IOException{
		
		campeonatoService.buscarCampeonatoPorId(id);
		
		if (id != null) {
            return new ResponseEntity<>(id, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity<?>buscarTodosOsCampeonatos(@RequestBody List<CampeonatoDTO> campeonatoDTO) throws IOException{
		
		campeonatoDTO = campeonatoService.buscarCampeonato();
		
		if (campeonatoDTO != null) {
            return new ResponseEntity<>(campeonatoDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
}
