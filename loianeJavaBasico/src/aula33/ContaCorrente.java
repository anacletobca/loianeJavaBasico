package aula33;

public class ContaCorrente {

	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private double saldo;

	public ContaCorrente() {
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// fim de gets e sets

	public boolean realizarSaque(double quantiaSacar) {
		// tem saldo na conta
		if (saldo >= quantiaSacar) {
			saldo -= quantiaSacar;
			return true;

		} else {
			if (especial) {
				// Verifica se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaSacar) {
					saldo -= quantiaSacar;
					return true;
				} else {
					return false;
				}

			} else {
				return false; // não é especial e não tem saldo suficiente
			}

		}

	}

	public void depositar(double valorDepositado) {
		saldo += valorDepositado;

	}

	public void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);

	}

	public boolean verificarUsoChequeEspecial() {
		return saldo < 0;

	}

}
