import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class TelaImc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfAltura;
	private JTextField tfPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaImc frame = new TelaImc();
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
	public TelaImc() {
		setTitle("Calculadora de IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(10, 10, 65, 27);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 120, 65, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 62, 65, 24);
		contentPane.add(lblNewLabel_1);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Arial", Font.PLAIN, 20));
		tfNome.setBounds(72, 10, 107, 25);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfAltura = new JTextField();
		tfAltura.setFont(new Font("Arial", Font.PLAIN, 20));
		tfAltura.setBounds(72, 61, 107, 25);
		contentPane.add(tfAltura);
		tfAltura.setColumns(10);
		
		tfPeso = new JTextField();
		tfPeso.setFont(new Font("Arial", Font.PLAIN, 20));
		tfPeso.setBounds(72, 116, 107, 25);
		contentPane.add(tfPeso);
		tfPeso.setColumns(10);
		
		JLabel lblImc = new JLabel("");
		lblImc.setFont(new Font("Arial", Font.PLAIN, 20));
		lblImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblImc.setBounds(236, 73, 124, 39);
		contentPane.add(lblImc);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  altura = Integer.parseInt(tfAltura.getText());
				double peso = Integer.parseInt(tfPeso.getText());
				DecimalFormat formatador = new DecimalFormat("#0.00");
				
				float resul = peso/(altura*altura);
				
				formatador.format(resul);
				lblImc.setText(Double.toString(resul));
				
				
				
			
			}
		});
		btnCalc.setFont(new Font("Arial", Font.PLAIN, 18));
		btnCalc.setBounds(150, 200, 107, 27);
		contentPane.add(btnCalc);
		
		JLabel lblNewLabel_2 = new JLabel("Seu IMC é:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(226, 31, 134, 39);
		contentPane.add(lblNewLabel_2);

	}
}
