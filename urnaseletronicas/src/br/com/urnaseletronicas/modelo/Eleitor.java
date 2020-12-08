package br.com.urnaseletronicas.modelo;

public class Eleitor extends Pessoa {

	public Eleitor(String nome, int titulo, boolean ativo) {
		super(nome);
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	private int titulo;
	private boolean ativo;

	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
