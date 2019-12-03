package com.db1start;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
 
class testeContaCorrente {

	@Test
	void deveCriarConta() { 
		ContaCorrente conta = new ContaCorrente("Rafael Rocha");
		Assert.assertEquals(conta, conta);
	}
	
	@Test
	void deveDepositar() {
		ContaCorrente conta = new ContaCorrente("Rafael Rocha");
		conta.depositar(100.55);
		double atual = conta.saldo();
		Assert.assertEquals(100.55, atual,0);
	}
	
	@Test
	void deveSacar() {
		ContaCorrente conta = new ContaCorrente("Rafael Rocha",11);
		conta.sacar(10.50);
		double atual = conta.saldo();
		Assert.assertEquals(0.5, atual,0);
	}
	
	@Test
	void deveTransferir() {
		ContaCorrente conta1 = new ContaCorrente("Rafael Rocha", 50);
		ContaCorrente conta2 = new ContaCorrente("Pedro Rocha", 45.50);
		conta1.transferir(conta2, 33);
		double atual = conta2.saldo();
		Assert.assertEquals(78.5, atual,0);
	}
}
