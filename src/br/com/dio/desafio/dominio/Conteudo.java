package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;

	private String titile;
	private String descricao;

	public abstract double calcularXp();

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
	        this.descricao = descricao;

	}
}
