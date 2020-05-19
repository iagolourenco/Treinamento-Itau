package excecao;

public class Excecao extends Exception{

	public static String tratarExcecao(Exception e) {
		if (e instanceof NullPointerException) {
			throw new RuntimeException("Objeto esta vazio");
		}
		else if (e instanceof NumberFormatException) {
			return "Formato de dado invalido";
		}
		else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Estourou algum vetor";
		}
		else {
			return "Erro desconhecido";
		}
		
	public static String tratarExcecao(String msg) {
		return msg;
	}
		
	}
	
}
