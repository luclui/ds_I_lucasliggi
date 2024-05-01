package aula04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import java.awt.Font;

public class TelaFibonacci extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFibonacci frame = new TelaFibonacci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaFibonacci() {
		setTitle("Fibonacci");
		setFont(new Font("Arial Black", Font.PLAIN, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumInicio = new JLabel("Insira o número inicial");
		lblNumInicio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumInicio.setBounds(10, 20, 155, 36);
		contentPane.add(lblNumInicio);
		
		JPanel PainelResul = new JPanel();
		PainelResul.setBorder(new LineBorder(new Color(0, 0, 0)));
		PainelResul.setBackground(new Color(211, 211, 211));
		PainelResul.setBounds(38, 78, 347, 175);
		contentPane.add(PainelResul);
		PainelResul.setLayout(null);
		
		JLabel lblResul = new JLabel("");
		lblResul.setFont(new Font("Arial", Font.PLAIN, 14));
		lblResul.setVerticalAlignment(SwingConstants.TOP);
		lblResul.setBounds(24, 21, 296, 130);
		PainelResul.add(lblResul);
		
		JSpinner spNumInicial = new JSpinner();
		spNumInicial.setFont(new Font("Arial", Font.PLAIN, 14));
		spNumInicial.setBounds(171, 25, 38, 27);
		contentPane.add(spNumInicial);
		
		JButton btnCalcular = new JButton("Calcule");
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    
				int NumInicial = Integer.parseInt(spNumInicial.getValue().toString());
			    int num2 = 0;
		        
		        System.out.println(num2);
		        System.out.println(NumInicial);
		        
		        for(int i = 0; i < 6; i++){
		        	NumInicial = NumInicial + num2;
		            num2 = NumInicial - num2;
		            System.out.println(NumInicial);
		        }
			}
		});
		btnCalcular.setBounds(290, 20, 93, 29);
		contentPane.add(btnCalcular);
		
		
		
		
	}
}
