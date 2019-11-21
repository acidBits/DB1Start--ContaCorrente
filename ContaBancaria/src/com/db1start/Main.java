package com.db1start;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente("Rafael Rocha");
		ContaCorrente conta2 = new ContaCorrente("Pedro Rocha");
		
		conta1.depositar(100.50);
		conta2.depositar(300);
		conta2.sacar(55.45);
		
		if(conta2.transferir(conta1, 25.75))
				System.out.println("Operacao Realizada");
		else
			System.out.println("Saldo Insuficiente");
		
		
		System.out.println(conta1.saldo());
		System.out.println(conta2.saldo());
		
		
		System.out.println(conta2.extrato());
	}

}
  