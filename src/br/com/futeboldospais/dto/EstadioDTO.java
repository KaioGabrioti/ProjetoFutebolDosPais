package br.com.futeboldospais.dto;

import java.io.Serializable;

public class EstadioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nome;
	
	private String cidade;
	
	private Integer capacidade;
	
	public EstadioDTO(Integer id, String nome, String cidade, Integer capacidade) {
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.capacidade = capacidade;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}	
}
