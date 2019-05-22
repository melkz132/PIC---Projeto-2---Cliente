import javax.swing.*;
import java.awt.event.*;

public class JanelaPrincipal extends JFrame implements ActionListener{

	private JTextArea texto = new JTextArea();

	private JLabel nomeLabel;
	private JLabel bandaLabel;
	private JLabel duracaoLabel;

	private static String nomeString = "Musica: ";
   	private static String bandaString = "Banda: ";
    	private static String duracaoString = "Duração: ";

	private JFormattedTextField nomeField;
	private JFormattedTextField bandaField;
	private JFormattedTextField duracaoField;


	public JanelaPrincipal(){
			
		super("Meu Arquivo");
		this.montaTela();

	}
	
	private void montaTela(){
		JPanel painelPrincipal = new JPanel();
		preparaJanela();
		preparaPainelPrincipal(painelPrincipal);
		
		nomeLabel = new JLabel(nomeString);
		bandaLabel = new JLabel(bandaString);
		duracaoLabel = new JLabel(duracaoString);

		painelPrincipal.add(nomeLabel);	
		painelPrincipal.add(bandaLabel);
		painelPrincipal.add(duracaoLabel);

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
