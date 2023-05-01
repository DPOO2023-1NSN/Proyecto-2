package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JButton;

public class ventanaEmpleado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaEmpleado frame = new ventanaEmpleado();
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
	public ventanaEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Bienvenido empleado");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		
		JButton btnNewButton = new JButton("Reservar");
		btnNewButton.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnCancelarReserva = new JButton("Cancelar reserva");
		btnCancelarReserva.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnConsultarPagos = new JButton("Consultar pagos");
		btnConsultarPagos.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnRegistrarCobros = new JButton("Registrar cobros");
		btnRegistrarCobros.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnConsultarPagos_1_1 = new JButton("Registrar check in ");
		btnConsultarPagos_1_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnConsultarPagos_1_1_1 = new JButton("Registrar check out");
		btnConsultarPagos_1_1_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnConsultarPagos_1_1_1_1 = new JButton("Consultar habitaciones");
		btnConsultarPagos_1_1_1_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(404)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnRegistrarCobros, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnConsultarPagos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
						.addComponent(btnConsultarPagos_1_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnConsultarPagos_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCancelarReserva, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnConsultarPagos_1_1_1_1, Alignment.LEADING))
					.addContainerGap(386, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(418, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(405))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(39)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnCancelarReserva, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnConsultarPagos, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnRegistrarCobros, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnConsultarPagos_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnConsultarPagos_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnConsultarPagos_1_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(306, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
