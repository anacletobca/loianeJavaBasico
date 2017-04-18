package aula17;

import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número para gerar a tabuada: ");
		int num = scan.nextInt();
		
		boolean invalido = true;
		int numInicio, numFinal;
		do{
			
		System.out.println("Entre com o inicio da tabuada: ");
		numInicio = scan.nextInt();
		
		System.out.println("Entre com o final da tabuada: ");
		numFinal = scan.nextInt();
		
		if (numFinal > numInicio){
			invalido = false;
		}
		}while (invalido);
		
		System.out.println("Tabuada de " + num + ":");
		System.out.println("Começado por " + numInicio);
		System.out.println("Terminado em: " + numFinal);
		
		for (int i=numInicio; i <= numFinal; i++ ){
			System.out.println(num + " * " + i + " = " + (num*i));

		}


	}

}
