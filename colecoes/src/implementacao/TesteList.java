package implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("ANALISTA");
		lista.add("ESTAG");
		lista.add("DBA JR");
		lista.add("DBA SR");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		lista.remove(1);
		System.out.println("Segundo elemento remo" + lista);
		for (int cont=0;cont<lista.size();cont++){
			System.out.println("Cargo" + (cont+1) + "é" + lista.get(cont));
		}
		
		
	}

}
