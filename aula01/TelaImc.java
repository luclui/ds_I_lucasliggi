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
		
		JLabel lbl1 = new JLabel("Nome");
		lbl1.setFont(new Font("Arial", Font.PLAIN, 20));
		lbl1.setBounds(10, 10, 65, 27);
		contentPane.add(lbl1);
		
		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 120, 65, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 62, 65, 24);
		contentPane.add(lblNewLabel_1);
		
		tfNome = new JTextField();
		tfNome.setHorizontalAlignment(SwingConstants.CENTER);
		tfNome.setFont(new Font("Arial", Font.PLAIN, 20));
		tfNome.setBounds(72, 10, 107, 25);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfAltura = new JTextField();
		tfAltura.setHorizontalAlignment(SwingConstants.CENTER);
		tfAltura.setText("0.0");
		tfAltura.setFont(new Font("Arial", Font.PLAIN, 20));
		tfAltura.setBounds(72, 61, 107, 25);
		contentPane.add(tfAltura);
		tfAltura.setColumns(10);
		
		tfPeso = new JTextField();
		tfPeso.setHorizontalAlignment(SwingConstants.CENTER);
		tfPeso.setText("0.0");
		tfPeso.setFont(new Font("Arial", Font.PLAIN, 20));
		tfPeso.setBounds(72, 116, 107, 25);
		contentPane.add(tfPeso);
		tfPeso.setColumns(10);
		
		JLabel lblPessoa = new JLabel("");
		lblPessoa.setHorizontalAlignment(SwingConstants.CENTER);
		lblPessoa.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPessoa.setBounds(236, 4, 130, 40);
		contentPane.add(lblPessoa);
		
		JLabel lblImc = new JLabel("");
		lblImc.setFont(new Font("Arial", Font.PLAIN, 20));
		lblImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblImc.setBounds(236, 62, 130, 40);
		contentPane.add(lblImc);
		
		JLabel lblClasse = new JLabel("");
		lblClasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblClasse.setFont(new Font("Arial", Font.PLAIN, 20));
		lblClasse.setBounds(236, 136, 130, 40);
		contentPane.add(lblClasse);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = tfNome.getText();
				float altura = Float.parseFloat(tfAltura.getText());
				float peso = Float.parseFloat(tfPeso.getText());
				DecimalFormat formatador = new DecimalFormat("#0.00");
				
				float resul = peso /(altura * altura);
				lblPessoa.setText(nome);
				formatador.format(resul);
				lblImc.setText(String.valueOf(resul));
				
				//class
				String magreza = ("Magreza");
				String ideal = ("Ideal");
				String sobrepeso = ("Sobrepeso");
				String obeso = ("Obeso");
				String obesidade = ("Obesidade grave");
				
				if (resul<= 18.5) {
					lblClasse.setText(magreza);
				}else if (resul<25) {
					lblClasse.setText(ideal);
				}else if (resul<30) {
					lblClasse.setText(sobrepeso);
				}else if (resul<40) {
					lblClasse.setText(obeso);
				}else {
					lblClasse.setText(obesidade);
				}
			}
		});
		btnCalc.setFont(new Font("Arial", Font.PLAIN, 18));
		btnCalc.setBounds(150, 200, 107, 27);
		contentPane.add(btnCalc);
		
		JLabel lblNewLabel_2 = new JLabel("Seu IMC é:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(236, 35, 130, 40);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
