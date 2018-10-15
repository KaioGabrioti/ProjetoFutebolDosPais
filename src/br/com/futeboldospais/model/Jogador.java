package br.com.futeboldospais.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.futeboldospais.model.enumeration.Cartoes;

@Entity
@Table(name = "jogador")
public class Jogador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idade")
	private Integer idade;
	
	@Column(name = "altura")
	private Double altura;
	
	@Column(name = "largura")
	private Double largura;
	
	@Column(name = "posicao_tatica")
	private String posicaoTatica;
	
	@Column(name = "custo")
	private Double custo;
	
	@Column(name = "capitao")
	private Boolean capitao;	
	
	@Column(name = "numero_camisa")
	private Integer numeroCamisa;
	
	@Column(name = "titular")
	private Boolean titular;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;
	
	@Column(name = "artilheiro")
	private Boolean artilheiro;
	
	@Column(name = "gol_feitos")
	private Gol golFeito;
	
	@Column(name = "quantidade_cartoes")
	private Cartoes quantidadeCartao;
	
	public Jogador() {
		
	}
	
	public Jogador(Integer id, String nome, Integer numeroCamisa, Boolean titular, Date dataNascimento, Boolean artilheiro, Gol golFeito, Cartoes quantidadeCartao) {
		this.id = id;
		this.nome = nome;
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
