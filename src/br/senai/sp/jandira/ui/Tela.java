package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class Tela {
	
	public void CriarTela() {
		
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(425, 400);
		minhaTela.setTitle("Tabuada");
		minhaTela.setLayout(null);
		
		JLabel lblTabuada = new JLabel("Tabuada");
		lblTabuada.setFont(new Font ("Serif", Font.BOLD, 25));
		lblTabuada.setForeground(Color.BLUE);
		lblTabuada.setBounds(20, 0, 500, 100);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(65, 110, 80, 20);
		
		JLabel lblMaximoMultiplicador = new JLabel("Máximo Multiplicador:");
		lblMaximoMultiplicador.setBounds(20, 150, 125, 20);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(150, 110, 50, 25);
		
		JTextField txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(150, 150, 50, 25);
		
		JButton bntCalcular = new JButton("Calcular");
		bntCalcular.setBounds(20, 200, 175, 45);
		
		
		JButton bntLimpar = new JButton("Limpar");
		bntLimpar.setBounds(20, 260, 175, 45);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(235, 110, 80, 20);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(235, 130, 135, 175);
		
		DefaultListModel resultadoModelo = new DefaultListModel();
		resultadoModelo.addElement("");
		
		JList TabuadaList = new JList(resultadoModelo);
		scroll.getViewport().add(TabuadaList);
		
		
		minhaTela.getContentPane().add(lblTabuada);
		minhaTela.getContentPane().add(lblMultiplicando);
		minhaTela.getContentPane().add(txtMultiplicando);
		minhaTela.getContentPane().add(lblMaximoMultiplicador);
		minhaTela.getContentPane().add(txtMaximoMultiplicador);
		minhaTela.getContentPane().add(bntCalcular);
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(bntLimpar);
		minhaTela.getContentPane().add(scroll);
		minhaTela.setVisible(true);
		
		bntCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicador(txtMaximoMultiplicador.getText());
				tabuada.setMultiplicando(txtMultiplicando.getText());
				
				
			}
		});
		
		bntLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}

}
