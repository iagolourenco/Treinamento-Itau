package ListaTeste;

import java.util.HashSet;
import java.util.Set;

public class ListaTeste2 {

	public static void main(String[] args) {
		// o Hashset coloca o valor em qlq lugar na memoria, 
		//pois ele traduz a inserção para um codigo hash e ordem é totalmente randomica e definida internamente.
		//É melhor para inserção
		//Ele também não repete, ja que o calculo de duas palavras iguais tem o mesmo retorno
		Set lista = new HashSet();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("DBA");
		System.out.println(lista);
	}

}
