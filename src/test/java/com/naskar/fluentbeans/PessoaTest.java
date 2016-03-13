package com.naskar.fluentbeans;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
	
	@Test
	public void testOk() {
		// AAA
		// Arragente
		Pessoa pessoa = new Pessoa("rafael", "12345");
		
		// Act
		String resultado = pessoa.ok();
		
		// Assert
		Assert.assertTrue(resultado.equals("rafael 12345"));
		
	}

}
 