package br.com.futeboldospais.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class UsuarioDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotNull
	private String nome;

	@NotNull
	private String login;

	@NotNull(message = "{usuario.validation.nome.notNull}")
	private String senha;

	private Boolean active;
	
	public UsuarioDTO() {}
	
	public UsuarioDTO(Integer id, String nome, String login, String senha, Boolean active){
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.active = active;
	}

	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
