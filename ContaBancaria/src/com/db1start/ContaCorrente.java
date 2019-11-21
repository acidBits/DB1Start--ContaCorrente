package com.db1start;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ContaCorrente {
	public String cliente;
	private double saldo;
	private Integer numeroConta; 
	private static Integer qtdConta = 0;
	private Integer qtdOperacao = 0;
	
	ArrayList<String> listaOperacao = new ArrayList<String>();
	
	private Date data = Calendar.getInstance().getTime();  
    DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

	public ContaCorrente(String cliente) { 
		this.cliente = cliente;
		qtdConta += 1;
		this.numeroConta = qtdConta; 
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		listaOperacao.add(dateFormat.format(data) + " Deposito R$: " + Double.toString(valor));
		qtdOperacao += 1;
	}
	
	public void sacar(double valor) {
		if(this.saldo < (this.saldo - valor)) {
			System.out.println("Saldo Insuficiente");
		} 
		else {
			this.saldo -= valor;
			listaOperacao.add(dateFormat.format(data) + " Saque R$: " + Double.toString(valor));
			qtdOperacao += 1;
		}
	}

	public double saldo() {
		return this.saldo;
	}
	
	public boolean transferir(ContaCorrente conta1, double valor) { 
		if(this.saldo < valor)
			return false;
	

		this.saldo -= valor; 
		this.listaOperacao.add(dateFormat.format(data) + " Transferencia R$: " + Double.toString(valor));
		qtdOperacao += 1;
		
		conta1.saldo += valor;
		conta1.listaOperacao.add(dateFormat.format(data) + " Transferencia R$: " + Double.toString(valor));
		qtdOperacao += 1;
		return true;  
	}
	
	public void extrato() {
		 System.out.println("\nCliente: " + this.cliente +
				 			"\nConta: " + numeroConta +
				 			"\nSaldo: " + this.saldo); 
		 
		 listaOperacao.forEach(System.out::println);
	}
}
