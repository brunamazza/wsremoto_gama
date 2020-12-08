package br.com.urnaseletronicas.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.urnaseletronicas.modelo.Candidato;
import br.com.urnaseletronicas.modelo.Eleitor;
import br.com.urnaseletronicas.modelo.Pessoa;
import br.com.urnaseletronicas.modelo.Urna;
import br.com.urnaseletronicas.modelo.Voto;
import br.com.urnaseletronicas.util.Magic;


public class ImplementarVoto {

	public static void main(String[] args) {
		List<Voto> lista = new ArrayList<Voto>();		
		Urna urna1 = new Urna(null, 0, null, 0, lista);
		urna1.setCidade(Magic.s("cidade"));
		urna1.setSecao(Magic.i("seção"));
		urna1.setZona(Magic.s("Zona"));
		urna1.setVotos(lista);
	
	
	do {
		lista.add(new Voto(
				new Candidato(
						Magic.s("Candidato"),
						Magic.i("Numero Candidato"),
						Magic.s("Cargo"),
						Magic.s("Partido")
						),
				new Eleitor(
						Magic.s("Eleitor"),
						Magic.i("Numero Titulo"),
						Magic.b("Ativo")),
				Magic.b("Primeiro turno")
				));
	}while(Magic.b("COntinuar?")==true);
	System.out.println(urna1.getCidade());
	System.out.println(urna1.getSecao());
	System.out.println("Votos: ");
	for (Voto obj : urna1.getVotos()) {
		System.out.println(obj.getCandidato().getNome());
		System.out.println(obj.getEleitor().getNome());
		System.out.println(obj.isPrimeiroTurno());
	
	}
	}
}
