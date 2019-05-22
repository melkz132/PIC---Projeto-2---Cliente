import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import java.text.*;

public class JanelaRetorno extends JFrame implements ActionListener{


	private JLabel pesquisaLabel;
	private JLabel nomeLabel;
	private JLabel bandaLabel;
	private JLabel duracaoLabel;

	private static String pesquisaString = "Digite um nome de música para fazer a pesquisa no BD: ";
	private static String nomeString = "Musica: ";
   	private static String bandaString = "Banda: ";
    	private static String duracaoString = "Duração: ";

	private JFormattedTextField pesquisaField;
	private JFormattedTextField nomeField;
	private JFormattedTextField bandaField;
	private JFormattedTextField duracaoField;


	public JanelaRetorno(){
		
		this.montaTela();

	}
	
	private void montaTela(){

		JPanel painelPrincipal = new JPanel();

		preparaJanela();
		preparaPainelPrincipal(painelPrincipal);
		
		pesquisaLabel = new JLabel(pesquisaString);
		nomeLabel = new JLabel(nomeString);
		bandaLabel = new JLabel(bandaString);
		duracaoLabel = new JLabel(duracaoString);
		
		pesquisaField = new JFormattedTextField();
		nomeField = new JFormattedTextField();
		bandaField = new JFormattedTextField();
		duracaoField = new JFormattedTextField();
		
		pesquisaField.setColumns(10);
		nomeField.setColumns(10);
		bandaField.setColumns(10);
		duracaoField.setColumns(10);

		nomeField.setEditable(false);
		bandaField.setEditable(false);
		duracaoField.setEditable(false);
		
		
		JPanel painelLabel = new JPanel(new GridLayout(0,1));
		JPanel painelField = new JPanel(new GridLayout(0,1));
		

		painelPrincipal.add(painelLabel, BorderLayout.CENTER);
		painelPrincipal.add(painelField, BorderLayout.LINE_END);
		
		painelLabel.add(pesquisaLabel);	
		painelLabel.add(nomeLabel);	
		painelLabel.add(bandaLabel);
		painelLabel.add(duracaoLabel);
		

		painelField.add(pesquisaField);
		painelField.add(nomeField);
		painelField.add(bandaField);
		painelField.add(duracaoField);

		preparaBotaoSair(painelPrincipal);
		mostraJanela();

	}
	
	private void preparaJanela(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	private void preparaPainelPrincipal(JPanel painelPrincipal){
		
		this.add(painelPrincipal);
	}
	private void preparaBotaoSair(JPanel painelPrincipal){
		
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		});
		painelPrincipal.add(botaoSair);
	}
	private void mostraJanela(){
		
		this.pack();
		this.setSize(640,480);
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
	}
}
