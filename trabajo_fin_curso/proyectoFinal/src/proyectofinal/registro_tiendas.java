package proyectofinal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Esta clase sirve para registrar tiendas
 * @author denisdominguez
 */
public class registro_tiendas extends JFrame{
    /**
     * En este método se genera un formulario en el cual puedes registrar una tienda nueva en el cual te sale un campo para poner el nombre de la tienda y la zona en la que se encuentra.
     */
    public registro_tiendas(){
        String url = "jdbc:mysql://localhost:3306/Whiskeria";
       
        this.setTitle("Añadir un producto");
    
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));
        
        JLabel label1 = new JLabel("Nombre");
        JLabel label2 = new JLabel("Zona");
        JLabel label3 = new JLabel();
        
        JTextField texto1 = new JTextField();
        JTextField texto2 = new JTextField();
        
        JButton boton = new JButton("Añadir");
        boton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String texto_1 = texto1.getText();
                String texto_2 = texto2.getText();
                
               try { 
                String query = "INSERT INTO Tiendas values (?, ?, ?)";
                Connection conexion = DriverManager.getConnection(url, "root", "");
                PreparedStatement myst = conexion.prepareStatement(query);
                
                myst.setString(1, null);
                myst.setString(2, texto_1);
                myst.setString(3, texto_2);
                int resultado = myst.executeUpdate();
                conexion.close();
               } catch (SQLException d) {
                    System.out.println("Error de BBDD: " + d);
               } catch (Exception ex){
                    System.out.println("Error desconocido: " + ex);
               }
                
            }
        });
        
        
        
        this.add(panel);
        panel.add(label1);
        panel.add(texto1);
        panel.add(label2);
        panel.add(texto2);
        panel.add(label3);
        panel.add(boton);
        
        
        this.pack();
        this.setVisible(true);
    }
}
