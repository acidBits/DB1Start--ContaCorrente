package com.db1start;

public class ContaCorrente {
	public String cliente;
	private double saldo;
	private static Integer conta = 0;
	
	public ContaCorrente(String cliente) {
		this.cliente = cliente;
		this.conta += 1;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo < (this.saldo - valor))
			System.out.println("Saldo Insuficiente");
		else
			this.saldo -= valor;
	}

	public double saldo() {
		return this.saldo;
	}
	
	public boolean transferir(ContaCorrente conta1, double valor) {
		if(this.saldo < valor)
			return false;
	

		this.saldo -= valor;
		conta1.saldo += valor;
		return true;  
	}
	
	public String extrato() {
		return "Cliente: " + this.cliente +
			   "\nConta: " + this.conta +
			   "\nSaldo :" + this.saldo;
	}
}
