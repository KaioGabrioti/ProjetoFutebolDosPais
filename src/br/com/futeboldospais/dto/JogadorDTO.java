package br.com.futeboldospais.dto;

import java.io.Serializable;
import java.sql.Date;

import br.com.futeboldospais.model.Gol;
import br.com.futeboldospais.model.enumeration.Cartoes;

public class JogadorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nome;
	
	private Integer idade;
	
	private Double altura;
	
	private Double largura;
	
	private String posicaoTatica;
	
	private Double custo;
	
	private Boolean capitao;	
	
	private Integer numeroCamisa;
	
	private Boolean titular;
	
	private Date dataNascimento;
	
	private Boolean artilheiro;
	
	private Gol golFeito;
	
	private Cartoes quantidadeCartao;
	
	public JogadorDTO(Integer id, String nome, Integer idade, Double altura, Double largura, String posicaoTatica, Double custo, Boolean capitao, Integer numeroCamisa, Boolean titular, Date dataNascimento, Boolean artilheiro, Gol golFeito, Cartoes quantidadeCartao) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.largura = largura;
		this.posicaoTatica = posicaoTatica;
		this.custo = custo;
		this.capitao = capitao;
		this.numeroCamisa = numeroCamisa;
		this.titular = titular;
		this.dataNascimento = dataNascimento;
		this.artilheiro = artilheiro;
		this.golFeito = golFeito;
		this.quantidadeCartao = quantidadeCartao;
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

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public String getPosicaoTatica() {
		return posicaoTatica;
	}

	public void setPosicaoTatica(String posicaoTatica) {
		this.posicaoTatica = posicaoTatica;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Boolean getCapitao() {
		return capitao;
	}

	public void setCapitao(Boolean capitao) {
		this.capitao = capitao;
	}

	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(Integer numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public Boolean getTitular() {
		return titular;
	}

	public void setTitular(Boolean titular) {
		this.titular = titular;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Boolean getArtilheiro() {
		return artilheiro;
	}

	public void setArtilheiro(Boolean artilheiro) {
		this.artilheiro = artilheiro;
	}

	public Gol getGolFeito() {
		return golFeito;
	}

	public void setGolFeito(Gol golFeito) {
		this.golFeito = golFeito;
	}

	public Cartoes getQuantidadeCartao() {
		return quantidadeCartao;
	}

	public void setQuantidadeCartao(Cartoes quantidadeCartao) {
		this.quantidadeCartao = quantidadeCartao;
	}	
}
