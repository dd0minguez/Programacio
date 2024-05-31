/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Esta clase sirve para crear un menu principal
 * 
 * @author denisdominguez
 */
public class ProyectoFinal {

    /**
     * Este método es el main, en el cual tienen una serie de botones que te redirige a cada una de las tablas que tiene la base de datos, en el cual son Cliente, Compra, Producto y Tiendas
     * 
     * @param args the command line arguments
     */
    //Creamos una clase para tener el menu principal
    public static void main(String[] args) {
        //Creamos un frame para el menu
        JFrame menu = new JFrame("Proyecto final");
        //Creamos un panel para posteriormente
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
        JButton productes = new JButton("Productos");
        productes.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Productes();
            }
        });
        
        JButton tiendas = new JButton("Tiendas");
        tiendas.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new tiendas();
            }
        });
        
        JButton pedidos = new JButton("Pedidos");
        pedidos.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new pedidos();
            }
        });
        
        JButton usuario = new JButton("Registrar usuarios");
        usuario.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new registro_clientes();
            }
        });
        
        menu.add(panel);
        panel.add(usuario);
        panel.add(productes);
        panel.add(tiendas);
        panel.add(pedidos);
        
        menu.setVisible(true);
        menu.pack();
    }
    
}
