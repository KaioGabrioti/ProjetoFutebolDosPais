package br.com.futeboldospais.dto;

import java.io.Serializable;
import java.sql.Date;

public class DirigenteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nome;
	
	private Date dataNascimento;
	
	public DirigenteDTO(Integer id, String nome, Date dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	

	
}
