package com.naskar.fluentbeans;

public class Pessoa {
	
	private String nome;
	private String telefone;
	
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String ok() {
		return nome + " " + telefone;		
	}

}
