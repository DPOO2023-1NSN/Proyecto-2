package GUI.SubPaneles;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class RealizarCheckOut extends JFrame {

    public RealizarCheckOut() {
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
        JButton checkInButton = new JButton("Realizar Check Out");
        
        checkInButton.setPreferredSize(new Dimension (200,50));
        panelCentro.add(checkInButton);
        
        
        // Creación del label para los anuncios
        JLabel anunciosLabel = new JLabel("    ");
        
        // Añadimos los componentes al JFrame con BorderLayout
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(subPanel, BorderLayout.NORTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        getContentPane().add(anunciosLabel, BorderLayout.SOUTH);
        
        checkInButton.addActionListener(e -> {
        	anunciosLabel.setText("Check Out realizado con éxito");
        });
    }

    public static void main(String[] args) {
    	RealizarCheckOut ventana = new RealizarCheckOut();
        ventana.setVisible(true);
    }
}

