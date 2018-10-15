package br.com.futeboldospais.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estadio")
public class Estadio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "capacidade")
	private Integer capacidade;
	
	public Estadio() {
		
	}
	
	public Estadio(Integer id, String nome, String cidade, Integer capacidade) {
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
