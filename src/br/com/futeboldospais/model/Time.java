package br.com.futeboldospais.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "time")
public class Time {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "estadio")
	private Estadio estadio;
	
	@Column(name = "dirigente")
	private Dirigente dirigente;
	
	@Column(name = "fundado")
	private Date fundado;
	
	@Column(name = "jogador")
	private Jogador jogador;
	
	@Column(name = "posicao_campeonato")
	private Integer posicaoCampeonato;
	
	@Column(name = "quantidade_jogador")
	private Integer quantidadeJogador;
	
	@Column(name = "rebaixado", nullable = false)
	private Boolean rebaixado;	
	
	public Time() {
		
	}
	
	public Time(Integer id, String nome, Estadio estadio, Dirigente dirigente, Date fundado, Jogador jogador, Integer posicaoCampeonato, Integer quantidadeJogador, Boolean rebaixado) {
		this.id = id;
		this.nome = nome;
		this.estadio = estadio;
		this.dirigente = dirigente;
		this.fundado = fundado;
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
	
	public Dirigente getDirigente() {
		return dirigente;
	}

	public void setDirigente(Dirigente dirigente) {
		this.dirigente = dirigente;
	}

	public Date getFundado() {
		return fundado;
	}

	public void setFundado(Date fundado) {
		this.fundado = fundado;
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
