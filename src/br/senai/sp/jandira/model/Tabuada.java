package br.senai.sp.jandira.model;

public class Tabuada {

	private int multiplicador;
	private int multiplicando;

	public void setMultiplicador(String multiplicador) {
		this.multiplicador = Integer.parseInt(multiplicador);
	}

	public void setMultiplicando(String multiplicando) {
		this.multiplicando = Integer.parseInt(multiplicando);
	}

	public void CalcularTabuada() {
		for (int contador = 0; multiplicador > contador; contador++) {
			int resultado = multiplicando * contador;

			System.out.printf("%s X %d = %d\n", contador, multiplicando, resultado);
			
			

		}
	}

}
