package aula15;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if(letra.length() > 1){
			System.out.println("Não é um letra válida!");
		}else {
			if(letra.equalsIgnoreCase("a") ||
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u")){
				System.out.println("A letra: "+letra+" é uma vogal!");				
			}else{
				System.out.println("A letra: "+letra+" é uma consoante!");
			}
		}

	}

}
