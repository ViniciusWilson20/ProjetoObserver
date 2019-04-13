package edu.curso;

public class RedeSocial {

	public static void main(String[] args) {
				
		Pensador iannace = new Pensador("Ricardo Iannace");
		Pensador brksedu = new Pensador("Eduardo Benvenuti");
		Pensador fabio = new Pensador("Fabio Assunção");
		
		Pessoa jailson = new Pessoa("Jailson Mendes");
		Pessoa paulo  = new Pessoa("Paulo Guina");
		Pessoa clovis = new Pessoa("Clóvis Basílio");
		Pessoa joao = new Pessoa("Joao Pires");
			
		
		iannace.adicionar(paulo);
		iannace.adicionar(jailson);
		brksedu.adicionar(clovis);
		fabio.adicionar(joao);
		brksedu.adicionar(joao);
		
		iannace.publicar("Vou processar os alunos do 2° ADS");
		brksedu.publicar("As Artimanhas da Bilada");
		fabio.publicar("Como fazer resistencia contra a policia fascista");
		
		
		
		
		
		
	}
}
