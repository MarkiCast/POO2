package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class testeFrame extends JFrame{

	private JLabel frame1;
	private JLabel frame2;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;
	private JTextField texto4;
	private JPasswordField password;
	
	public testeFrame() {
		super("Teste");
		setLayout(new FlowLayout());
		
		frame1 = new JLabel("Exercício");
		frame1.setHorizontalTextPosition(SwingConstants.CENTER);
		frame1.setVerticalTextPosition(SwingConstants.TOP);
		add(frame1);
		
		Icon test = new ImageIcon(getClass().getResource(""));
		frame2 = new JLabel(test, SwingConstants.RIGHT);
		add(frame2);
		
		texto1 = new JTextField(5);
		add(texto1);
		
		texto2 = new JTextField(15);
		add(texto2);
		
		texto3 = new JTextField("Escreve ai, vacilão");
		add(texto3);
		
		texto4 = new JTextField("Tenta escreve d novo então, duvido");
		texto4.setEditable(false);
		add(texto4);
		
		password = new JPasswordField("Escreve teus segredin");
		add(password);
		
		TextHandler handler = new TextHandler();
		texto1.addActionListener(handler);
		texto2.addActionListener(handler);
		texto3.addActionListener(handler);
		texto4.addActionListener(handler);
		password.addActionListener(handler);
		
		ButtonHandler bhandler = new ButtonHandler();
		JButton comtexto = new JButton("Botão 1");
		Icon xiu = new ImageIcon(getClass().getResource(""));
		JButton comimagem = new JButton("Botão 2", xiu);
		comtexto.addActionListener(bhandler);
		comimagem.addActionListener(bhandler);		
		add(comtexto);
		add(comimagem);
		
	}

	private class TextHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent event) {  
			
			String string = "";
			if(event.getSource() == texto1)
				string = String.format("Texto 1: %s", event.getActionCommand());
			else if (event.getSource() == texto2)
				string = String.format("Texto 2: %s", event.getActionCommand());
			else if(event.getSource() == texto3)
				string = String.format("Texto 3: %s", event.getActionCommand());
			else if (event.getSource() == texto4)
				string = String.format("Texto 4: %s", event.getActionCommand());
			else if (event.getSource() == password)
				string = String.format("Texto 5: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}
		
	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			JOptionPane.showMessageDialog(testeFrame.this, String.format("Você pressionou: %s", event.getActionCommand()));
			
		}
	}	
	
}