package com.naskar.fluentbeans;

public class Conta {
	
	private double saldo;
	
	public Conta(double saldoInicial) {
		valideValor(saldoInicial);
		
		this.saldo = saldoInicial;
	}
			
	public void deposite(double valor) {
		valideValor(valor);
	
		this.saldo = this.saldo + valor;
	}
	
	public void saque(double valor) {
		valideValor(valor);
		
		double novoSaldo = saldo - valor;
		if(novoSaldo < 0) {
			throw new IllegalArgumentException();
		}
		
		this.saldo = novoSaldo;
	}
	
	private void valideValor(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
