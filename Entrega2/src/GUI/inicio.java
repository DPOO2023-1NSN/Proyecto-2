package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import procesamiento.Hotel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class inicio extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldContraseña;
	
	//Paneles secundarios que se desplegarán
	private ventanaCrearUsuario  vCrearUsuario= new ventanaCrearUsuario();
	private ventanaUsuario vUsuario;
	private ventanaAdministrador vAdmin;
	private ventanaEmpleado vEmpleado;
	
	//Creación del procesamiento
	private Hotel hotel;


	public static void main(String[] args) {
		
		inicio frame = new inicio();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public inicio(){
		try {
			hotel= new Hotel();
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Bienvenidos");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		
		textFieldContraseña = new JTextField();
		textFieldContraseña.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setActionCommand("Ingresar");
		
		JButton btnCrearUsuario = new JButton("Crear usuario");
		btnCrearUsuario.addActionListener(this);
		btnCrearUsuario.setActionCommand("Crear Usuario");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(190)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldContraseña, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldUsuario, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(251, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(292, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(274))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(299, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnIngresar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCrearUsuario, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(294))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(104)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldContraseña, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1))
					.addGap(18)
					.addComponent(btnIngresar)
					.addGap(11)
					.addComponent(btnCrearUsuario)
					.addContainerGap(167, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String grito = e.getActionCommand();
		
		if(grito.equals("Crear Usuario")) {
			vCrearUsuario.main(null);
		}
		else {
			int tipoUsuario= hotel.ejecutarLogIn(textFieldUsuario.getText(), textFieldContraseña.getText());
			if (tipoUsuario==1){
				vAdmin.main(null);
			}
			else if (tipoUsuario==2){
				vEmpleado.main(null);
			}
			else {
				vUsuario.main(null);
			}
			
			
		}
		
	
		
	}
}
