package aula33;

import java.util.Scanner;

public class Exer04 {

	static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while (!ganhou){
			if(jogoDaVelha.vezJogador1()){
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			}else{ //jogador 2
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			if(jogoDaVelha.validarJogada(linha, coluna, sinal)){
				System.out.println();
				System.out.println("Entrada inválida, tente novamente!");
			}
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador('X')){
				ganhou = true;
				System.out.println("Parabéns Jogador 1 Ganhou!!");
			}else if(jogoDaVelha.verificarGanhador('O')){
				ganhou = true;
				System.out.println("Parabéns Jogador 2 Ganhou!!");
			}else if(jogoDaVelha.getJogada() > 9){
				ganhou = true;
				System.out.println("Ninguém ganho essa partida");
			}
		}
	}
	
	static int valor(String tipoValor, Scanner scan){
		int valor = 0;
		boolean valorValido = false;
		
		while (!valorValido){
			System.out.println("Entre com a " +tipoValor+ " (1, 2 e 3): ");
			valor = scan.nextInt();
			if(valor >=1 && valor<=3){
				valorValido = true;
				
			}else{
				System.out.println("Entrada inválida, tente novamente!");
			}
		} 
		valor--;
		return valor;
	}

}