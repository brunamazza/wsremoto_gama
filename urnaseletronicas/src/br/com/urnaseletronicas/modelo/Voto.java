package br.com.urnaseletronicas.modelo;

public class Voto {
	private Pessoa eleitor;
	private Pessoa candidato;
	private boolean primeiroTurno;
	public Voto(Pessoa eleitor, Pessoa candidato, boolean primeiroTurno) {
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.primeiroTurno = primeiroTurno;
	}
	public Pessoa getEleitor() {
		return eleitor;
	}
	public void setEleitor(Pessoa eleitor) {
		this.eleitor = eleitor;
	}
	public Pessoa getCandidato() {
		return candidato;
	}
	public void setCandidato(Pessoa candidato) {
		this.candidato = candidato;
	}
	public boolean isPrimeiroTurno() {
		return primeiroTurno;
	}
	public void setPrimeiroTurno(boolean primeiroTurno) {
		this.primeiroTurno = primeiroTurno;
	}

	
	
}
