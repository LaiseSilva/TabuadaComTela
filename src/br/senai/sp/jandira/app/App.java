package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Tabuada;

public class App {

	public static void main(String[] args) {
		
		Tabuada tabuada = new Tabuada();
		tabuada.setMultiplicador("3");
		tabuada.setMultiplicando("5");
		tabuada.Multiplicar();

	}

}
