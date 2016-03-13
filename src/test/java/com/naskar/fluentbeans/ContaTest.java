package com.naskar.fluentbeans;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {
	
	@Test
	public void testDepositeSucess() {
		// AAA
		// Arrange
		// definindo valor atual da conta
		Conta conta = new Conta(100d);
		
		// Act
		// definindo o valor a ser incrementado
		conta.deposite(50d);
		
		// Assert
		// validacao do saldo do inicial mais o valor a ser incrementado
		double saldoAtual = conta.getSaldo();
		Assert.assertTrue(150 == saldoAtual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDepositeFailed() {
		// AAA
		// Arrange
		// definindo valor atual da conta
		Conta conta = new Conta(200);
		
		// Act
		// definindo um valor negativo invalido
		conta.deposite(-1);
		
		// Assert
		// lanca exception
	}
	
	@Test
	public void testSaqueSucess() {
		// AAA
		// Arrange
		// definindo valor atual da conta com 100
		Conta conta = new Conta(100d);
		
		// Act
		// se for efetuado um saque de 60
		conta.saque(60d);
		
		// Assert
		// validacao do saque ?
		double saldoAtual = conta.getSaldo();
		Assert.assertTrue(40d == saldoAtual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSaqueFailed() {
		// AAA
		// Arrange
		// definindo valor atual da conta com 100
		Conta conta = new Conta(100d);
		
		// Act
		// se for efetuado um saque de 60
		conta.saque(150d);
		
		// Assert
	}
}

