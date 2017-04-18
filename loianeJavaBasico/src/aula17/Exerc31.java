package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salario = 1000;
		double percentual = 1.5;
		salario += ((salario/100) * percentual);//96
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for (int ano=1997; ano<=2015; ano++){
			percentual *= 2;
			salario += ((salario/100) * percentual);
			
			System.out.println(ano+ "= " +format.format(salario)+ " - " +percentual+ "%");

		}
	}

}
