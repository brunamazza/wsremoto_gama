package implementacao;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

	public static void main(String[] args) {
		Map<Integer, Cargo> lista = new HashMap();

		lista.put(1, new Cargo("DEV","JR",4000));
		lista.put(2, new Cargo("DEV","PL",14000));
		lista.put(3, new Cargo("DEV","SR",24000));
		System.out.println(lista);
		System.out.println("Keys " + lista.keySet());
		System.out.println("Values " + lista.values());
		
		for (Cargo objeto : lista.values()) {
			System.out.println(objeto.getNome());
			System.out.println(objeto.getNivel());
		}
	}

}
