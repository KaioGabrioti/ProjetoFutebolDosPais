package br.com.futeboldospais.dto;

import java.io.Serializable;

import br.com.futeboldospais.model.Estadio;
import br.com.futeboldospais.model.Jogador;

public class TimeDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nome;

	private Estadio estadio;

	private Jogador jogador;

	private Integer posicaoCampeonato;

	private Integer quantidadeJogador;

	private Boolean rebaixado;	

	public TimeDTO() {

	}

	public TimeDTO(Integer id, String nome, Estadio estadio, Jogador jogador, Integer posicaoCampeonato, Integer quantidadeJogador, Boolean rebaixado) {
		this.id = id;
		this.nome = nome;
		this.estadio = estadio;
		this.jogador = jogador;
		this.posicaoCampeonato = posicaoCampeonato;
		this.quantidadeJogador = quantidadeJogador;
		this.rebaixado = rebaixado;
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

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Integer getPosicaoCampeonato() {
		return posicaoCampeonato;
	}

	public void setPosicaoCampeonato(Integer posicaoCampeonato) {
		this.posicaoCampeonato = posicaoCampeonato;
	}

	public Integer getQuantidadeJogador() {
		return quantidadeJogador;
	}

	public void setQuantidadeJogador(Integer quantidadeJogador) {
		this.quantidadeJogador = quantidadeJogador;
	}

	public Boolean getRebaixado() {
		return rebaixado;
	}

	public void setRebaixado(Boolean rebaixado) {
		this.rebaixado = rebaixado;
	}

}
