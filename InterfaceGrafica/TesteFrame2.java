package InterfaceGrafica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TesteFrame2 extends JFrame{

	private JLabel panel;
	private JTextField text;
	private JButton but;
	private JTextField ntext;
	private JCheckBox bold;
	private JCheckBox italic;
	private JTextField jtext;
	private JRadioButton jbold;	
	private JRadioButton jitalic;
	private JRadioButton jnormal;
	private JList list;
	private static final String[] nomeCores = {"Branco","Preto","Azul","Amarelo","Vermelho","Verde","Rosa"};
	private static final Color[] cores = {Color.WHITE, Color.BLACK, Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.PINK};
	
	public TesteFrame2(){
		super("");  
		setLayout(new FlowLayout());
		
		panel = new JLabel("Escreva seu nome");
		add(panel);
		
		text = new JTextField(15);
		add(text);
		
		but = new JButton("Clique Aqui");
		add(but);
		
		ntext = new JTextField("Xisdê Xisdê");
		ntext.setEditable(false);
		add(ntext);
		
		bold = new JCheckBox("Negrito");
		add(bold);
		
		italic = new JCheckBox("Italico");
		add(italic);
		
		OuvidorTexto thandler = new OuvidorTexto();
		text.addActionListener(thandler);
		
		OuvidorBotao bhandler = new OuvidorBotao();
		but.addActionListener(bhandler);
		
		OuvidorCheckBox chandler = new OuvidorCheckBox();
		bold.addItemListener(chandler);
		italic.addItemListener(chandler);
		
		jtext = new JTextField("BlahBlahBlah");
		add(jtext);
		
		jbold = new JRadioButton("Negrito");
		jitalic = new JRadioButton("Italico");
		jnormal = new JRadioButton("Normal");
		add(jbold);
		add(jitalic);
		add(jnormal);
		
		ButtonGroup grupoRadio = new ButtonGroup();
		grupoRadio.add(jbold);
		grupoRadio.add(jitalic);
		grupoRadio.add(jnormal);
		
		OuvidorRadio rhandler = new OuvidorRadio();
		jbold.addItemListener(rhandler);
		jitalic.addItemListener(rhandler);
		jnormal.addItemListener(rhandler);
		
		list = new JList(nomeCores);
		list.setVisibleRowCount(7);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(new ListSelectionListener()
				{
					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						getContentPane().setBackground(cores[list.getSelectedIndex()]);
						
					}
				}
		);
	}
	
	private class OuvidorTexto implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
		 
		JOptionPane.showMessageDialog(TesteFrame2.this, String.format("Nome: %s", text.getText()));
		
		}
	}
	
	private class OuvidorBotao implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		JOptionPane.showMessageDialog(TesteFrame2.this, String.format("O seu nome é: %s", text.getText()));
		
		}
	}

	private class OuvidorCheckBox implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		Font font = null;
		
		if (bold.isSelected() && italic.isSelected())
			font = new Font("Arial", Font.BOLD + Font.ITALIC,14);
		else if(bold.isSelected())
			font = new Font("Arial", Font.BOLD, 14);
		else if (italic.isSelected())
			font = new Font("Courier New", Font.ITALIC, 14);
		else
			font = new Font("Serif", font.PLAIN, 14);
		
		ntext.setFont(font);
		
		}
	}
	
	private class OuvidorRadio implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		Font font = null;
		if (jbold.isSelected())
			font = new Font("Times", Font.BOLD, 16);
		else if (jitalic.isSelected())
			font = new Font("Times", Font.ITALIC, 16);
		else if (jnormal.isSelected())
			font = new Font("Times", Font.PLAIN, 16);
			
		jtext.setFont(font);	
		}
	}

}