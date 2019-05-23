import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import java.text.*;

public class JanelaPrincipal extends JFrame implements ActionListener{


	private JLabel pesquisaLabel;

	private static String pesquisaString = "Digite um nome de música para fazer a pesquisa no BD: ";

	private JFormattedTextField pesquisaField;

	public JanelaPrincipal(){
		
		this.montaTela();

	}
	
	private void montaTela(){

		JPanel painelPrincipal = new JPanel();
		
		preparaJanela();
		preparaPainelPrincipal(painelPrincipal);
		
		pesquisaLabel = new JLabel(pesquisaString);
		
		pesquisaField = new JFormattedTextField();
		
		pesquisaField.setColumns(10);

		JPanel painelLay = new JPanel(new GridLayout(0,1));
		JPanel buttonLay = new JPanel(new GridLayout(1,1));

		painelPrincipal.add(painelLay);
		painelPrincipal.add(buttonLay);
		painelLay.add(pesquisaLabel);	
		painelLay.add(pesquisaField);
	
		preparaBotaoCarregar(buttonLay);
		preparaBotaoSair(buttonLay);
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

	private void preparaBotaoCarregar(JPanel painelPrincipal) {
  		JButton botaoCarregar = new JButton("Carregar Janela Retorno");
  		botaoCarregar.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
      			painelPrincipal.add(new JanelaRetorno());
    		}
		});
		painelPrincipal.add(botaoCarregar);
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
