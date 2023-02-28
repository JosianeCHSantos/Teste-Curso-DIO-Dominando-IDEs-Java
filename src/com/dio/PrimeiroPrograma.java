package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		//Para criar o objeto Gato aqui
		
		Gato gato = new Gato();
		// para fazer importação de class de outra class, é só passar o mouse sobre a palavra que abrirá uma caixa de diálogo
		// selecionar a opção import, ou, precionar CTRL SHIFT O e a importação é feita automaticamente.
		
		Livros livros = new Livros();
		
		System.out.println(gato);
		/*int a = 20;
		int b = 7;	
		System.out.println("Hello Banco Pan!!! " + (a+b));*/
		// TODO Auto-generated method stub
		System.out.println(livros);

	}

}

class Livros {
	
	private String nome;
	private String npag;
	
		
	
}
