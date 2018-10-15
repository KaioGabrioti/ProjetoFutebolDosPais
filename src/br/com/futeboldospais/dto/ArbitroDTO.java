package br.com.futeboldospais.dto;

import java.io.Serializable;

public class ArbitroDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;
	
	private Integer idade;
	
	private String nacionalidade;
	
	public ArbitroDTO(Integer id, String nome, Integer idade, String nacionalidade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}	
}
