package aula43.exerc03;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero() {
		super();
		this.setCor("Castanhos");
		this.alimento = "mel";
		this.setAmbiente("terra");

	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nalimento=" + alimento;
		return s;
	}
	
	
}
