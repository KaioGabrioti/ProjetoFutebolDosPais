package br.com.futeboldospais.dto;

import java.io.Serializable;

import br.com.futeboldospais.model.Time;

public class CampeonatoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;
	
	private Time time;
	
	public CampeonatoDTO() {}
	
	public CampeonatoDTO(Integer id, String nome, Time time) {
		this.id = id;
		this.nome = nome;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
}
