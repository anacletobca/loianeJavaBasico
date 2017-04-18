package aula46;

public class Cubo extends Figura3D{

	private int lado;
	
	public void setLado(int lado){
		this.lado=lado;
	}
	public int getLado(){
		return lado;
	}
	public double calcularArea() {
		return 6 * (lado*lado);
	}
	public double calcularVolume() {

		return Math.pow(lado, 3);
	}
}
