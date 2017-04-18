package aula33;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("1234"); 
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);

		System.out.println("Saldo da conta " + conta.getNumero() + " = "
				+ conta.getSaldo());

		boolean saqueEfetuado = conta.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out
					.println("Não foi possivel realizar saque. Saldo Insuficiente");
		}

		saqueEfetuado = conta.realizarSaque(500);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out
					.println("Não foi possivel realizar saque. Saldo Insuficiente");
		}

		System.out.println("Despósito de 500 reais");
		System.out.println();
		conta.depositar(500);
		conta.consultarSaldo();
		
		System.out.println();
		
		if (conta.verificarUsoChequeEspecial()){
			System.out.println("Está usando cheque especial!");
		}else{
			System.out.println("NÃO está usando cheque especial!");
		}

	
	}

}
