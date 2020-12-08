package br.com.urnaseletronicas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Urna {

	private String zona;
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	private int secao;
	private String cidade;
	private int totalVotos;
	private List<Voto> votos;
	public Urna(String zona, int secao, String cidade, int totalVotos, List<Voto> votos) {
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		this.totalVotos = totalVotos;
		this.votos = votos;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Urna [cidade=" + cidade + "]";
	}
	public int getTotalVotos() {
		return totalVotos;
	}
	public int totalVotos() {
		return votos.size();
	}
	public void setTotalVotos(int totalVotos) {
		this.totalVotos = totalVotos;
	}

}
