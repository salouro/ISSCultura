package model;

import java.io.Serializable;

public class Autor implements Serializable{

	private long id;
	private String nome;
	private String nacionalidade;
	
	public Autor() {
		
	}

	public long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}