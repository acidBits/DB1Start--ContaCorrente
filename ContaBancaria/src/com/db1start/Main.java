package com.db1start;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente("Rafael Rocha");
		ContaCorrente conta2 = new ContaCorrente("Pedro Rocha");
		
		conta1.depositar(100.7);
		conta2.depositar(300);
		conta2.sacar(55.45);
		

	    conta1.transferir(conta2, 25.5);    
		
		System.out.println(conta1.saldo());
		System.out.println(conta2.saldo());
		
		
		conta1.extrato();  
		conta2.extrato();   
	}
 
}
    