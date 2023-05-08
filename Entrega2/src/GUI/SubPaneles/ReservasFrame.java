package GUI.SubPaneles;
import java.awt.GridLayout;

import javax.swing.*;

public class ReservasFrame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReservasFrame() {
        setTitle("ReservasFrame");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creamos los componentes
        JLabel labelCheckIn = new JLabel("Check in");
        JLabel labelDia = new JLabel("Dia");
        JLabel labelMes = new JLabel("Mes");
        JLabel labelAnio = new JLabel("Año");
        JTextField textFieldDia = new JTextField();
        JTextField textFieldMes = new JTextField();
        JTextField textFieldAnio = new JTextField();
        JPanel panelCheckIn = new JPanel(new GridLayout(1, 7));
        panelCheckIn.add(labelCheckIn);
        panelCheckIn.add(labelDia);
        panelCheckIn.add(textFieldDia);
        panelCheckIn.add(labelMes);
        panelCheckIn.add(textFieldMes);
        panelCheckIn.add(labelAnio);
        panelCheckIn.add(textFieldAnio);
        
        JLabel labelCheckIn2 = new JLabel("Check Out");
        JLabel labelDia2 = new JLabel("Dia");
        JLabel labelMes2= new JLabel("Mes");
        JLabel labelAnio2 = new JLabel("Año");
        JTextField textFieldDia2 = new JTextField();
        JTextField textFieldMes2 = new JTextField();
        JTextField textFieldAnio2 = new JTextField();
        JPanel panelCheckIn2 = new JPanel(new GridLayout(1, 7));
        panelCheckIn2.add(labelCheckIn2);
        panelCheckIn2.add(labelDia2);
        panelCheckIn2.add(textFieldDia2);
        panelCheckIn2.add(labelMes2);
        panelCheckIn2.add(textFieldMes2);
        panelCheckIn2.add(labelAnio2);
        panelCheckIn2.add(textFieldAnio2);
      
        JPanel panelNorte= new JPanel ();
        panelNorte.setLayout(new GridLayout(2,1));
        panelNorte.add(panelCheckIn);
        panelNorte.add(panelCheckIn2);
        
        
        
        
     
     
        JButton botonAddUsuario = new JButton("Añadir usuario");
        JPanel panelAddUsuario = new JPanel();
        panelAddUsuario.setLayout(new GridLayout(8,2));
        panelAddUsuario.add(new JLabel("Nombre Usuario"));
        panelAddUsuario.add(new JTextField());
        panelAddUsuario.add(new JLabel("Contraseña"));
        panelAddUsuario.add(new JTextField());
        panelAddUsuario.add(new JLabel("Nombre"));
        panelAddUsuario.add(new JTextField());
        panelAddUsuario.add(new JLabel("Documento"));
        panelAddUsuario.add(new JTextField());
        panelAddUsuario.add(new JLabel("Edad"));
        panelAddUsuario.add(new JTextField());
        panelAddUsuario.add(new JLabel("Correo"));
        panelAddUsuario.add(new JTextField());
        panelAddUsuario.add(new JLabel("Correo"));
        panelAddUsuario.add(new JTextField("Teléfono"));
        panelAddUsuario.add(botonAddUsuario);
        panelAddUsuario.add(new JLabel("Añadido: 0 veces"));
        botonAddUsuario.addActionListener(e -> {
            int count = Integer.parseInt(labelAgregadosUsuario.getText().split(":")[1].trim()) + 1;
            labelAgregadosUsuario.setText("Añadido: " + count + " veces");
        });
        panelAddUsuario.add(labelAgregadosUsuario);
        
        JLabel labelHabitacion = new JLabel("ID");
        JTextField textFieldHabitacion = new JTextField();
        JButton botonAddHabitacion = new JButton("Añadir habitación");
        JPanel panelAddHabitacion = new JPanel(new GridLayout(3, 1));
        panelAddHabitacion.add(labelHabitacion);
        panelAddHabitacion.add(textFieldHabitacion);
        panelAddHabitacion.add(botonAddHabitacion);
        botonAddHabitacion.addActionListener(e -> {
            int count = Integer.parseInt(labelAgregadosHabitacion.getText().split(":")[1].trim()) + 1;
            labelAgregadosHabitacion.setText("Añadido: " + count + " veces");
        });
        JPanel panelHabitaciones = new JPanel(new BorderLayout());
        panelHabitaciones.add(panelAddHabitacion, BorderLayout.NORTH);
        panelHabitaciones.add(new JLabel(), BorderLayout.CENTER);
        panelHabitaciones.add(new JLabel(), BorderLayout.SOUTH);
        
        JButton botonReservar = new JButton("Reservar");
        JLabel labelReservaExitosa = new JLabel();
        JPanel panelReservar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelReservar.add(botonReservar);
        panelReservar.add(labelReservaExitosa);
        botonReservar.addActionListener(e -> {
            labelReservaExitosa.setText("Reserva realizada con éxito");
        });
        
        JLabel labelAgregadosUsuario = new JLabel("Añadido: 0 veces");
        JLabel labelAgregadosHabitacion = new JLabel("Añadido:");
}}
