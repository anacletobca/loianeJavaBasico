package aula17;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cod, qtd;
		double total =0;
		String output = "";
		boolean naoTerminar = true;
		do{
			System.out.println("Digite o codigo e a qnt. Digite 0 para sair:");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			if(cod == 0 && qtd==0){
				naoTerminar = false;
				output += "Total a pagar: " + total;
			}else{
				if (cod == 100){
					output += "Cachorro quente -> 1,20 * "+ qtd;
					output += " = " + (1.2*qtd) + "\n";
					total += 1.2*qtd;
				}else if (cod == 101){
					output += "Bauru Simples -> 1,30 * "+ qtd;
					output += " = " + (1.3*qtd) + "\n";
					total += 1.3*qtd;
				}else if (cod == 102){
					output += "Bauru com ovo -> 1,50 * "+ qtd;
					output += " = " + (1.5*qtd) + "\n";
					total += 1.5*qtd;
				}else if (cod == 103){
					output += "Hamburguer -> 1,20 * "+ qtd;
					output += " = " + (1.2*qtd) + "\n";
					total += 1.2*qtd;
				}else if (cod == 104){
					output += "Cheeseburguer -> 1,30 * "+ qtd;
					output += " = " + (1.3*qtd) + "\n";
					total += 1.3*qtd;
				}else if (cod == 105){
					output += "Refrigerante -> 1 * "+ qtd;
					output += " = " + (1*qtd) + "\n";
					total += 1*qtd;
				}
			}
					
		}while(naoTerminar);
		
		System.out.println(output);
		
	}

}
