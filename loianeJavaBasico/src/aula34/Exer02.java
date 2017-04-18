package aula34;

public class Exer02 {

	public static void main(String[] args) {

		imprimirTela(Calculadora.somar(1, 2));
		
		imprimirTela(Calculadora.potencia(2, 3));
	}

	static void imprimirTela(int num){
		System.out.println(num);
	}
}
