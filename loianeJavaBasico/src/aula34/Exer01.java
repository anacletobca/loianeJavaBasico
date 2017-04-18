package aula34;

public class Exer01 {
	
	public static void imprimirValor(){
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
	}

}
