package aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        int[] vetorA = new int[5];
        double[] vetorB = new double[vetorA.length];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor de posição: "+ i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        System.out.print("Vetor A = ");
        
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println("");
        
        DecimalFormat dc = new DecimalFormat("##,###.##");
        System.out.print("Vetor B = ");
        
        for (int i=0; i<vetorB.length; i++){
            System.out.print(dc.format(vetorB[i]) + " ");
        }
    }
    
}
