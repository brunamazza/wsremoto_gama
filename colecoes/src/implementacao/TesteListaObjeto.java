package implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;


public class TesteListaObjeto {
	public static void main(String[] args) {
	List<Cargo> lista = new ArrayList<Cargo>();
	do {
		lista.add(new Cargo(
				JOptionPane.showInputDialog("NOME"), 
				JOptionPane.showInputDialog("Nivel"),
				Float.parseFloat(JOptionPane.showInputDialog("Salario"))
				));
	}while(JOptionPane.showConfirmDialog(null,"continuar?","Pergunta",JOptionPane.YES_NO_OPTION)==0);
	
	System.out.println("Desordenada" + lista);
	Collections.sort(lista);
	System.out.println("Ordenada " + lista);
	/*
	System.out.println(lista);
	float total = 0;
	float totalJr = 0;
	for (Cargo obj : lista) {
		total+=obj.getSalario();
		if (obj.getNivel().equals("JR")) {
			totalJr+=obj.getSalario();
		}
	}
	System.out.println("Total:" + total );
	System.out.println("Total Jr:" + totalJr );
	} */
	}
}
