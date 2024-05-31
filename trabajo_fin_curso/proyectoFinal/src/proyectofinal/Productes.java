/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase sirve para crear el apartado de la tabla de productos
 * @author denisdominguez
 */
public class Productes extends JFrame{
    /**
     * Este método es el main de productos, en él podemos visualizar la tabla de los productos que existen, en el cual se ven el ID, el tipo de alcohol que es ese producto, el año del alcohol y el precio del producto.
     * Acto seguido de la tabla, encontramos un botón que nos redirige a una ventana nueva en la cual podemos crear productos nuevos.
     */
     public Productes(){
        this.setTitle("Productos");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        //this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        DefaultTableModel modelo = new DefaultTableModel();
        JTable table = new JTable(modelo);
        JScrollPane scrollPanel = new JScrollPane(table);
        scrollPanel.setPreferredSize(new Dimension(400, 200));
        modelo.setColumnIdentifiers(new String[] {"Id", "Tipo", "Año", "Precio"});
        
        JButton boton = new JButton("Añade el Producto");
        
        //public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/Whiskeria";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            conexion.isValid(10);
            
            PreparedStatement myst = conexion.prepareStatement("Select * from Producto");
            ResultSet rs = myst.executeQuery();
            
            while(rs.next()){
                //llegir totes ses seves columnes de tenda
                String id = rs.getString("ID");
                String tipo = rs.getString("Tipo_alcohol");
                String año = rs.getString("Año_alcohol");
                String precio = rs.getString("Precio");
                
                //Ficar la informacio llegida din la taula
                modelo.addRow(new String[] {id, tipo, año, precio});
            }
        } catch (SQLException e) {
            System.out.println("Error de BBDD: " + e);
        } catch (Exception ex){
            System.out.println("Error desconocido: " + ex);
        }

        boton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new registro_producto();
            }
        });
        boton.setPreferredSize(new Dimension(20, 20));
        
        
        
        this.add(panel);
        panel.add(scrollPanel);
        panel.add(boton);
        
        
        this.setVisible(true);
        this.pack();
    }
}
