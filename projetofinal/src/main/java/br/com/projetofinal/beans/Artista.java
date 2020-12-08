package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_artista")
public class Artista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",length=50)
	private int ID;
	
	@Column(name="NOMEARTISTICO",length=50)
	private String NOMEARTISTICO;
	
	@Column(name="NACIONALIDADE",length=50)
	private String NACIONALIDADE;
	public Artista(int iD, String nOMEARTISTICO, String nACIONALIDADE) {
		super();
		ID = iD;
		NOMEARTISTICO = nOMEARTISTICO;
		NACIONALIDADE = nACIONALIDADE;
	}
	public Artista() {
		super();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNOMEARTISTICO() {
		return NOMEARTISTICO;
	}
	public void setNOMEARTISTICO(String nOMEARTISTICO) {
		NOMEARTISTICO = nOMEARTISTICO;
	}
	public String getNACIONALIDADE() {
		return NACIONALIDADE;
	}
	public void setNACIONALIDADE(String nACIONALIDADE) {
		NACIONALIDADE = nACIONALIDADE;
	}

}
