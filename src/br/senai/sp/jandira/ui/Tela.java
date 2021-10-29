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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class Tela {

	public void CriarTela() {

		Color bntCalcularCor = new Color(156, 197, 35);
		Color bntLimparCor = new Color(255, 0, 0);

		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(425, 400);
		minhaTela.setTitle("Tabuada");
		minhaTela.setLayout(null);

		// Header do frame
		JPanel header = new JPanel();
		header.setBounds(0, 0, 425, 75);
		header.setBackground(Color.WHITE);
		header.setLayout(null);

		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setFont(new Font("Serif", Font.BOLD, 25));
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setBounds(150, 10, 200, 50);
		header.add(lblTitulo);

		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(65, 110, 80, 20);

		JLabel lblMaximoMultiplicador = new JLabel("Máximo Multiplicador:");
		lblMaximoMultiplicador.setBounds(20, 150, 125, 20);
		// lblMaximoMultiplicador.setHorizontalAlignment(SwingConstants.RIGHT);(para
		// fazer alinhamento de texto na JLabel)

		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(150, 110, 50, 25);

		JTextField txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(150, 150, 50, 25);

		JButton bntCalcular = new JButton("Calcular");
		bntCalcular.setBounds(20, 200, 175, 45);
		bntCalcular.setFont(new Font("Arial", Font.BOLD, 15));
		bntCalcular.setBackground(bntCalcularCor);
		bntCalcular.setForeground(Color.WHITE);

		JButton bntLimpar = new JButton("Limpar");
		bntLimpar.setBounds(20, 260, 175, 45);
		bntLimpar.setFont(new Font("Arial", Font.BOLD, 15));
		bntLimpar.setBackground(bntLimparCor);
		bntLimpar.setForeground(Color.WHITE);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(235, 110, 80, 20);
		lblResultado.setForeground(Color.BLUE);

		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(235, 130, 135, 175);

		DefaultListModel tabuadaModel = new DefaultListModel();

		tabuadaModel.addElement(" ");

		JList TabuadaList = new JList(tabuadaModel);
		scroll.getViewport().add(TabuadaList);

		minhaTela.getContentPane().add(header);
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

				String[] resultado = tabuada.CalcularTabuada();

				for (int i = 0; i < resultado.length; i++) {
					tabuadaModel.addElement(resultado[i]);
				}

			}
		});

		bntLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				txtMultiplicando.setText("");
				txtMaximoMultiplicador.setText("");
				txtMultiplicando.requestFocus();

				tabuadaModel.removeAllElements();
				// tabuadaModel.clear();

			}
		});
	}

}
