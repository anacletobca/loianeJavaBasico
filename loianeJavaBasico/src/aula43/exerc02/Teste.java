package aula43.exerc02;

public class Teste {

	public static void main(String[] args) {

		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("111.111.111-11");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("44.444.444/4444-44");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("222.222.222-22");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("55.555.555/5555-55");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("333.333.333-33");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("66.666.666/6666-66");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(Contribuinte c : contribuintes){
			System.out.println(c.toString());
		}
	}
}
