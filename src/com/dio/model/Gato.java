package com.dio.model;

import java.util.Objects;

public class Gato {
	
	private String nome;
	private String cor;
	private Integer idade;
	
	public Gato() {}

	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
	//Forma manual
	/*public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}*/
	
	/*Com construtor -> CRTL 3 -> digitar Construt -> na guia Commands selecionar Genarate Constructor using Fields - Choose...
	 * é possível criar um construtor vazio ou com os campos já selecionados
	 * Para criar get e set, clicar em CRTL 3, digitar ggas e selecionar Generate Getters and Setters...
	 * Para criar equals e hashCode -> CRTL 3, digitar equals - selecionar -> Generate hashCode() and equals()...
	 * Para criar toString - CRTL 3, digitar toString - selecionar -> Generate toStgring()...
	 * 
	 * Para mudar um bloco de lugar, segura a tecla ALT e com a seta mover para cima ou para baixo
	 * 
	 * Para refatorar caso tenha bagunçado a tabulação dos códigos, clicar em CTRL SHIFT F*/
		
	

}
