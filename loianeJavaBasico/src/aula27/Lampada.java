package aula27;

public class Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipo;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar(){
		ligada = true;
	}
	
	void desligar(){
		ligada = false;
	}
	
	void mostrarEstado(){
		if(ligada){
			System.out.println("A lampada esta ligada.");
		}else{
			System.out.println("A lampada está desligada");
		}
	}

}
