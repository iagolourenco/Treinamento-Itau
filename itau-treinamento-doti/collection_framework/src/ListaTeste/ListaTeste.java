package ListaTeste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListaTeste {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("DBA");
		lista.add("PLENO");
		lista.add("ANALISTA");
		lista.add("JR");
		lista.add("DBA");
		lista.add("SENIOR");
		
		//lista.remove(3);
		
		//Collections.sort(lista);
		
		//System.out.println(lista);
		//System.out.println(lista.get(1));
		//System.out.println(lista.get(2));

		
		for (int indice=0;indice<lista.size();indice+=2) {
			System.out.println(lista.get(indice));
		}
	
		
	}

}
