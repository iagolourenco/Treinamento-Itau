package projeto_pilha;

public class Pilha {

	private int topo;
	private int vetor[];
	private int valor;
	
	public Pilha(int x) {
		vetor = new int[x];
		topo = -1;
	}
	
	public boolean vazio() {
		return topo==-1;
	}
	
	
	public boolean cheio() {
		return topo==9;
	}
	
	public void inserir(int valor) {
		if (!cheio()) {
			topo++;
			vetor[topo] = valor;
		}
		else {
			System.out.println("Pilha cheia");
		}
	}
	
	public int retirar() {
		if(vazio()) {
			topo--;
			return valor;
		}
		return -1;
		
	}
}

