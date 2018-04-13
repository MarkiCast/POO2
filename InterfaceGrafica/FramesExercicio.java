package InterfaceGrafica;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FramesExercicio extends JFrame{

	private JLabel frame1;
	private JLabel frame2;
	private JButton somar;
	private JButton subtrair;
	private JButton dividir;
	private JButton multiplicar;
	private JTextField text1;
	private JTextField text2;
	
		
	public FramesExercicio() {
		super("Exercício");
		setLayout(new FlowLayout());

		frame1 = new JLabel("Insira primeiro numero");
		frame1.setHorizontalTextPosition(SwingConstants.LEFT);
		frame1.setVerticalTextPosition(SwingConstants.TOP);
		add(frame1);
		
		frame2 = new JLabel("Insira segundo numero");
		frame2.setHorizontalTextPosition(SwingConstants.RIGHT);
		frame2.setVerticalTextPosition(SwingConstants.TOP);
		add(frame2);
		
		text1 = new JTextField(1);
		text1.setHorizontalAlignment(SwingConstants.LEFT);
		text1.setAlignmentY(CENTER_ALIGNMENT);
		add(text1);
		
		text2 = new JTextField(1);
		text2.setHorizontalAlignment(SwingConstants.RIGHT);
		text2.setAlignmentY(CENTER_ALIGNMENT);
		add(text2);
		
		somar = new JButton("Somar");
		somar.setHorizontalAlignment(SwingConstants.RIGHT);
		somar.setAlignmentY(CENTER_ALIGNMENT);
		add(somar);
		
		subtrair = new JButton("Subtrair");
		subtrair.setHorizontalAlignment(SwingConstants.LEFT);
		subtrair.setAlignmentY(CENTER_ALIGNMENT);
		add(subtrair);
		
		
		dividir = new JButton("Dividir");
		dividir.setHorizontalAlignment(SwingConstants.RIGHT);
		dividir.setAlignmentY(BOTTOM_ALIGNMENT);
		add(dividir);
		
		multiplicar = new JButton("Multiplicar");
		multiplicar.setHorizontalAlignment(SwingConstants.LEFT);
		multiplicar.setAlignmentY(BOTTOM_ALIGNMENT);
		add(multiplicar);
		
		ButtonHandler handler = new ButtonHandler();
		somar.addActionListener(handler);
		subtrair.addActionListener(handler);
		dividir.addActionListener(handler);
		multiplicar.addActionListener(handler);

	}

	private class ButtonHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent event) {
	
			int num1 = Integer.parseInt(text1.getText());
			int num2 = Integer.parseInt(text2.getText());
			
			String string = "";
			if (event.getSource() == somar)
				string = String.format("Soma: %s", num1+num2 );
			else if (event.getSource() == subtrair)
				string = String.format("Subtração: %s", num1-num2);
			else if (event.getSource() == dividir)
				string = String.format("Divisão: %s", num1/num2);
			else if (event.getSource() == multiplicar)
				string = String.format("Multiplicação: %s", num1*num2);
				
			JOptionPane.showMessageDialog(null, string);
			
		}
	}	
	
}