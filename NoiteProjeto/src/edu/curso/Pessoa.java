package edu.curso;

public class Pessoa implements Assinante {

	
	public String nome;
	public Pessoa(String nome) {
		 this.nome = nome;
	}
	
	
	@Override
	public void receberNoticia(String assunto) {
		System.out.printf("Eu %s Li o Texto %s \n" , nome , assunto);
	}	
	
}
