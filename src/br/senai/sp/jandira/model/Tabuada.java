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

	public String[] CalcularTabuada() {
		
		String tabuada[] = new String[multiplicador + 1];

		for (int index = 0; this.multiplicador >= index; index++) {
			 int resultado = this.multiplicando * index;
			 
			 tabuada[index] = multiplicando + " X " + index + " = " + resultado;

		}
		return tabuada;
		
		

	}
	
}
