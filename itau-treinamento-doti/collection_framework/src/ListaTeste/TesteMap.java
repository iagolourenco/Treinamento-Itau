package ListaTeste;

import java.util.HashMap;
import java.util.Map;

import collection_framework.Cargo;

public class TesteMap {

	public static void main(String[] args) {

		Map<String, Cargo> lista = new HashMap<>();

		lista.put("1", new Cargo("DBA","JR",5000));
		lista.put("2", new Cargo("ANALISTA","SR",20000));
		lista.put("1", new Cargo("DBA","PL",10000));

		//exibe so as chaves
		System.out.println(lista.keySet());
		//exibe so os dados
		System.out.println(lista.values());
		
		for (Cargo objeto : lista.values()) {
			System.out.println(objeto.getAll());
		}
		
		Cargo objeto = lista.get("2");
		System.out.println("Encontrado: " + objeto.getNome());
		

	}
}
