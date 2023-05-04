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
import javax.swing.LayoutStyle.ComponentPlacement;

public class ventanaAdministrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaAdministrador frame = new ventanaAdministrador();
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
	public ventanaAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Bienvenido administrador ");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1_1 = new JLabel("Menú habitaciones");
		lblNewLabel_1_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnConsultarHabitaciones = new JButton("Consultar habitaciones");
		btnConsultarHabitaciones.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnCrearHabitaciones = new JButton("Crear habitaciones");
		btnCrearHabitaciones.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnCargarArchivoDe = new JButton("Cargar archivo de habitaciones");
		btnCargarArchivoDe.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnCargarPreciosDe = new JButton("Cargar precios de Habitaciones ");
		btnCargarPreciosDe.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("       Opciones menú");
		lblNewLabel_1_1_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnCargarMen = new JButton("Cargar menú");
		btnCargarMen.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnEditarMen = new JButton("Editar menú");
		btnEditarMen.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		
		JButton btnAsignarPreciosAl = new JButton("Asignar precios al menú");
		btnAsignarPreciosAl.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(428)
									.addComponent(lblNewLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(195)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnConsultarHabitaciones, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnCrearHabitaciones, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnCargarArchivoDe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnCargarPreciosDe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(219)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnAsignarPreciosAl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnEditarMen, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnCargarMen, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
					.addGap(84))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel)
					.addGap(47)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCargarMen, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnConsultarHabitaciones, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEditarMen, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCrearHabitaciones, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAsignarPreciosAl, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCargarArchivoDe, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnCargarPreciosDe, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(376, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
