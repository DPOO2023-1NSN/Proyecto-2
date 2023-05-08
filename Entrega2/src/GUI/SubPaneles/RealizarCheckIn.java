package GUI.SubPaneles;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class RealizarCheckIn extends JFrame {

    public RealizarCheckIn() {
        // Configuración del JFrame
        setTitle("Realizar Check In");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creación del sub panel superior
        JPanel subPanel = new JPanel(new FlowLayout());
        JLabel idLabel = new JLabel("ID de la reserva:");
        JTextField idField = new JTextField(10);
        subPanel.add(idLabel);
        subPanel.add(idField);
        
        // Creación del botón para realizar el check in
        JPanel panelCentro= new JPanel(new FlowLayout());
        JButton checkInButton = new JButton("Realizar Check In");
        
        checkInButton.setPreferredSize(new Dimension (199,50));
        panelCentro.add(checkInButton);
        
        
        // Creación del label para los anuncios
        JLabel anunciosLabel = new JLabel("    ");
        
        // Añadimos los componentes al JFrame con BorderLayout
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(subPanel, BorderLayout.NORTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        getContentPane().add(anunciosLabel, BorderLayout.SOUTH);
        
        checkInButton.addActionListener(e -> {
        	anunciosLabel.setText("Check In realizado con éxito");
        });
    }

    public static void main(String[] args) {
        RealizarCheckIn ventana = new RealizarCheckIn();
        ventana.setVisible(true);
    }
}

