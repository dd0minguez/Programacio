/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 * Esta clase sirve para poder registrar un pedido o una compra.
 * @author denisdominguez
 */
public class registro_pedidos extends JFrame{
    /**
     * En este método se registra el pedido con el ID del producto que se quiera comprar, el DNI del cliente (solo el DNI del cliente para la ley de protección de datos), el ID de la tienda en la que se quier comprar y la cantidad que se desee comprar.
     */
    public registro_pedidos(){
        String url = "jdbc:mysql://localhost:3306/Whiskeria";
       
        this.setTitle("Añadir un pedido");
    
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2));
        
        JLabel label1 = new JLabel("Tipo de producto segun el id");
        JLabel label2 = new JLabel("DNI Cliente");
        JLabel label3 = new JLabel("Nombre de la Tienda segun el id");
        JLabel label4 = new JLabel("Cantidad");
        JLabel label5 = new JLabel();
        
        JComboBox selector1 = new JComboBox();
        // hacemos el select
        
        try {
            Connection conexio1 = DriverManager.getConnection(url, "root", "");
            String content1 = "SELECT ID FROM Producto";
            PreparedStatement camp1 = conexio1.prepareStatement(content1);
            ResultSet rs = camp1.executeQuery();
            while(rs.next()){
                selector1.addItem(rs.getString("ID"));
            } 
        }catch (Exception ey){
                    System.out.println("Error desconocido: " + ey);
                
        }
        
        
        JComboBox selector2 = new JComboBox();
        
        try {
            Connection conexio1 = DriverManager.getConnection(url, "root", "");
            String content1 = "SELECT DNI FROM Cliente";
            PreparedStatement camp2 = conexio1.prepareStatement(content1);
            ResultSet rs = camp2.executeQuery();
            while(rs.next()){
                selector2.addItem(rs.getString("DNI"));
            } 
        }catch (Exception et){
                    System.out.println("Error desconocido: " + et);
                
        }
        
        
        
        JComboBox selector3 = new JComboBox();
        
        try {
            Connection conexio3 = DriverManager.getConnection(url, "root", "");
            String content1 = "SELECT ID FROM Tiendas";
            PreparedStatement camp3 = conexio3.prepareStatement(content1);
            ResultSet rs = camp3.executeQuery();
            while(rs.next()){
                selector3.addItem(rs.getString("ID"));
            } 
        }catch (Exception et){
                    System.out.println("Error desconocido: " + et);
                
        }
        
        //JTextField texto4 = new JTextField();
        JSpinner texto4 = new JSpinner();
        
        JButton boton = new JButton("Añadir");
        boton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
               try { 
                String query = "INSERT INTO Compra values (?, ?, ?, ?, ?)";
                Connection conexion = DriverManager.getConnection(url, "root", "");
                PreparedStatement myst = conexion.prepareStatement(query);
                
                myst.setString(1, null);
                myst.setString(2, (String)selector1.getSelectedItem());
                myst.setString(3, (String)selector2.getSelectedItem());
                myst.setInt(4, (int)texto4.getValue());
                myst.setString(5, (String)selector3.getSelectedItem());
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
        panel.add(selector1);
        panel.add(label2);
        panel.add(selector2);
        panel.add(label3);
        panel.add(selector3);
        panel.add(label4);
        panel.add(texto4);
        panel.add(label5);
        panel.add(boton);
        
        
        this.pack();
        this.setVisible(true);
    }
}
