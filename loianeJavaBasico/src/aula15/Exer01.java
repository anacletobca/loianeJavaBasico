package aula15;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2){
			System.out.println("O num1 é maior");
		}else{
			System.out.println("O num2 é maior");

		}
	}

}
