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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Esta clase sirve para crear el apartado de la tabla de los pedido o las compras.
 * @author denisdominguez
 */
public class pedidos extends JFrame{
    /**
     * En este método, se visualiza la tabla en la que muestra toda la información de los productos, es decir, el ID del pedido, el ID del producto que tiene, el DNI del cliente que esta haciendo la compra, la cantidad de productos que ha pedido y el ID de la tienda en la que lo va a comprar o lo esta comprando.
     * A continuación tiene un botón para poder crear un pedido o una compra.
     */
    public pedidos(){
        this.setTitle("Compra");
        
        //this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        //this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        DefaultTableModel modelo = new DefaultTableModel();
        JTable table = new JTable(modelo);
        JScrollPane scrollPanel = new JScrollPane(table);
        scrollPanel.setPreferredSize(new Dimension(400, 200));
        modelo.setColumnIdentifiers(new String[] {"Id", "Id Productos", "DNI Clientes", "Cantidades", "Id Tiendas"});
        
        JButton boton = new JButton("Añade una Compra");
        
        //public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/Whiskeria";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            conexion.isValid(10);
            
            PreparedStatement myst = conexion.prepareStatement("Select * from Compra");
            ResultSet rs = myst.executeQuery();
            
            while(rs.next()){
                //llegir totes ses seves columnes de tenda
                String id = rs.getString("ID");
                String id_producto = rs.getString("ID_Producto");
                String dni_cliente = rs.getString("DNI_Cliente");
                String cantidad = rs.getString("Cantidad");
                String id_tienda = rs.getString("ID_Tienda");
                
                //Ficar la informacio llegida din la taula
                modelo.addRow(new String[] {id, id_producto, dni_cliente, cantidad, id_tienda});
            }
        } catch (SQLException e) {
            System.out.println("Error de BBDD: " + e);
        } catch (Exception ex){
            System.out.println("Error desconocido: " + ex);
        }

        boton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new registro_pedidos();
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
