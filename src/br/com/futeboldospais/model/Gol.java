package br.com.futeboldospais.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gol")
public class Gol {
	
	@Column(name = "gol_feito")
	private Integer golFeito;
	
	@Column(name = "gol_sofrido")
	private Integer golSofrido;
	
	@Column(name = "gol_total_time")
	private Integer golTotalTime;
	
	@Column(name = "gol_total_artilheiro")
	private Integer golTotalArtilheiro;
	
	@Column(name = "gol_total_estadio")
	private Integer golTotalEstadio;
	
	@Column(name = "gol_jogador")
	private Integer golPorJogador;
	
	public Gol(Integer golFeito, Integer golSofrido, Integer golTotalTime, Integer golTotalArtilheiro,  Integer golTotalEstadio, Integer golPorJogador) {
		this.golFeito = golFeito;
		this.golSofrido = golSofrido;
		this.golTotalTime = golTotalTime;
		this.golTotalArtilheiro = golTotalArtilheiro;
		this.golTotalEstadio = golTotalEstadio;
	}

	public Integer getGolFeito() {
		return golFeito;
	}

	public void setGolFeito(Integer golFeito) {
		this.golFeito = golFeito;
	}

	public Integer getGolSofrido() {
		return golSofrido;
	}

	public void setGolSofrido(Integer golSofrido) {
		this.golSofrido = golSofrido;
	}

	public Integer getGolTotalTime() {
		return golTotalTime;
	}

	public void setGolTotalTime(Integer golTotalTime) {
		this.golTotalTime = golTotalTime;
	}

	public Integer getGolTotalArtilheiro() {
		return golTotalArtilheiro;
	}

	public void setGolTotalArtilheiro(Integer golTotalArtilheiro) {
		this.golTotalArtilheiro = golTotalArtilheiro;
	}

	public Integer getGolTotalEstadio() {
		return golTotalEstadio;
	}

	public void setGolTotalEstadio(Integer golTotalEstadio) {
		this.golTotalEstadio = golTotalEstadio;
	}

	public Integer getGolPorJogador() {
		return golPorJogador;
	}

	public void setGolPorJogador(Integer golPorJogador) {
		this.golPorJogador = golPorJogador;
	}	
}
