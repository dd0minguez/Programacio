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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase sirve para crear el apartado de la tabla Tiendas
 * @author denisdominguez
 */
public class tiendas extends JFrame{
    /**
     * En este método se visualiza la tabla de las tiendas que existen, con el ID de la tienda, el nombre que tiene cada tienda en concreto y a la zona que pertenece.
     * Acto seguido hay un botón para poder registrar una tienda nueva.
     */
    public tiendas(){
        this.setTitle("Tiendas");
        
        //this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        //this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        DefaultTableModel modelo = new DefaultTableModel();
        JTable table = new JTable(modelo);
        JScrollPane scrollPanel = new JScrollPane(table);
        scrollPanel.setPreferredSize(new Dimension(400, 200));
        modelo.setColumnIdentifiers(new String[] {"Id", "Nombre", "Zona"});
        
        JButton boton = new JButton("Añade una Tienda");
        
        //public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/Whiskeria";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            conexion.isValid(10);
            
            PreparedStatement myst = conexion.prepareStatement("Select * from Tiendas");
            ResultSet rs = myst.executeQuery();
            
            while(rs.next()){
                //llegir totes ses seves columnes de tenda
                String id = rs.getString("ID");
                String nombre = rs.getString("Nombre");
                String zona = rs.getString("Zona");
                
                //Ficar la informacio llegida din la taula
                modelo.addRow(new String[] {id, nombre, zona});
            }
        } catch (SQLException e) {
            System.out.println("Error de BBDD: " + e);
        } catch (Exception ex){
            System.out.println("Error desconocido: " + ex);
        }

        boton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new registro_tiendas();
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
