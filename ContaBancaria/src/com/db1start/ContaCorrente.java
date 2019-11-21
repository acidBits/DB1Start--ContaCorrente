package com.db1start;

import java.util.HashMap;
import java.util.Map;

public class ContaCorrente {
	public String cliente;
	private double saldo;
	private static Integer numeroConta = 0;
	
	private Map<String, String> listaOperacoes = new HashMap<String, String>(); 

	 
	public ContaCorrente(String cliente) { 
		this.cliente = cliente;
		numeroConta += 1;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		listaOperacoes.put("deposito", Double.toString(valor));
	}
	
	public void sacar(double valor) {
		if(this.saldo < (this.saldo - valor)) {
			System.out.println("Saldo Insuficiente");
		}
		else {
			this.saldo -= valor;
			listaOperacoes.put("saque", Double.toString(valor));
		}
	}

	public double saldo() {
		return this.saldo;
	}
	
	public boolean transferir(ContaCorrente conta1, double valor) {
		if(this.saldo < valor)
			return false;
	

		this.saldo -= valor;
		conta1.saldo += valor;
		listaOperacoes.put("transferencia", Double.toString(valor)); 
		return true;  
	}
	
	public Map<String, String> extrato() {
		 System.out.println("\nCliente: " + this.cliente +
				 			"\nConta: " + numeroConta +
				 			"\nSaldo :" + this.saldo + "\n");
		 
		 return this.listaOperacoes;
	}
}
