package edu.curso;

import java.util.ArrayList;

public class Pensador implements Autor {

	ArrayList<Assinante> lista = new ArrayList<>();

	private String nome;

	public Pensador(String nome) {
		this.nome = nome;
	}

	@Override
	public void adicionar(Assinante a) {
		lista.add(a);
	}

	@Override
	public void remover(Assinante a) {
		lista.remove(a);
	}

	@Override
	public void publicar(String assunto) {

		for (Assinante a : lista) {

			String texto = String.format("%s Elaborado por %s", assunto, nome);
			a.receberNoticia(texto);
		}

	}

}
