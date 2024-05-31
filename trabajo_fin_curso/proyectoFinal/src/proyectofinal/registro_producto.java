/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * Esta clase sirve para poder crear un nuevo producto
 * @author denisdominguez
 */
public class registro_producto extends JFrame{
    /**
     * Este método sirve para generar un formulario en el cual podemos crear un producto nuevo, consta de un campo para añadir el tipo de alcohol y el año el cual es este alcohol.
     */
    public registro_producto(){
        String url = "jdbc:mysql://localhost:3306/Whiskeria";
       
        this.setTitle("Añadir un producto");
    
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));
        
        JLabel label1 = new JLabel("Tipo de alcohol");
        JLabel label2 = new JLabel("Año del alcohol");
        JLabel label3 = new JLabel("Precio");
        JLabel label4 = new JLabel();
        
        JTextField texto1 = new JTextField();
        JTextField texto2 = new JTextField();
        JTextField texto3 = new JTextField();
        
        JButton boton = new JButton("Añadir");
        boton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String texto_1 = texto1.getText();
                String texto_2 = texto2.getText();
                Integer texto2 = Integer.valueOf(texto_2);
                String texto_3 = texto3.getText();
                Integer texto3 = Integer.valueOf(texto_3);
               try { 
                String query = "INSERT INTO Producto values (?, ?, ?, ?)";
                Connection conexion = DriverManager.getConnection(url, "root", "");
                PreparedStatement myst = conexion.prepareStatement(query);
                
                myst.setString(1, null);
                myst.setString(2, texto_1);
                myst.setInt(3, texto2);
                myst.setInt(4, texto3);
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
        panel.add(texto3);
        panel.add(label4);
        panel.add(boton);
        
        
        this.pack();
        this.setVisible(true);
    }
}
