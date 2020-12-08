package br.com.urnaseletronicas.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.urnaseletronicas.modelo.Candidato;
import br.com.urnaseletronicas.modelo.Eleitor;
import br.com.urnaseletronicas.modelo.Voto;

public class ComputaVotoUrna {

	public static void main(String[] args) {
		Eleitor eleitor1 = new Eleitor("Maria", 1, true);
		Eleitor eleitor2 = new Eleitor("Jose", 2, false);
		Candidato candidato1 = new Candidato("Ana", 3, "Presidente", "Partido 1");
		Candidato candidato2 = new Candidato("Bento", 4, "Presidente", "Partido 2");
		
		List<Voto> lista = new ArrayList<Voto>();
			lista.add(new Voto(
					eleitor1,
					candidato1,
					true
					));

			lista.add(new Voto(
					eleitor2,
					candidato2,
					true
					));
		System.out.println(lista);
		
	}

}
