package aula27;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaSacar){
		//tem saldo na conta
		if(saldo >= quantiaSacar){
			saldo -= quantiaSacar;
			return true;
		
		}else{
			if(especial){
				//Verifica se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaSacar){
					saldo -= quantiaSacar;
					return true;
				}else{
					return false;
				}
			
			}else{
				return false; //não é especial e não tem saldo suficiente
			}
			
		}
		
	}
	
	void depositar(double valorDepositado){
		saldo += valorDepositado;
		
	}

	void consultarSaldo(){
		System.out.println("Saldo atual da conta = " + saldo);

	}

	boolean verificarUsoChequeEspecial(){
		return saldo < 0;

		
	}
}

