package ListaTeste;

import java.util.HashSet;
import java.util.Set;

public class ListaTeste2 {

	public static void main(String[] args) {
		// o Hashset coloca o valor em qlq lugar na memoria, 
		//pois ele traduz a inser��o para um codigo hash e ordem � totalmente randomica e definida internamente.
		//� melhor para inser��o
		//Ele tamb�m n�o repete, ja que o calculo de duas palavras iguais tem o mesmo retorno
		Set lista = new HashSet();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("DBA");
		System.out.println(lista);
	}

}
