/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import com.toedter.calendar.JDateChooser;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Esta clase sirve para poder registrar usuarios a la base de datos
 * @author denisdominguez
 */
public class registro_clientes extends JFrame{
    /**
     * Este método sirve para que podamos registrar a los usuarios, a diferencia de las otras pestañas en las cuales salia la tabla con la información que habia en ella, en esta no sale para que en el caso de que fuese utilizado para una empresa, se mantenga la ley de protección de datos y no salga publicamente la información del usuario.
     * En ella puedes encontrar un campo para poner el DNI, que es con el que se podrán hacer gestiones exteriormente, otro para poder poner el nombre completo y el ultimo para poner la fecha de nacimiento.
     */
    public registro_clientes(){
        String url = "jdbc:mysql://localhost:3306/Whiskeria";
       
        this.setTitle("Registrar un usuario");
    
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2));
        
        JLabel label1 = new JLabel("DNI");
        JLabel label2 = new JLabel("Nombre completo");
        JLabel label3 = new JLabel("Fecha de nacimiento");
        JLabel label4 = new JLabel();
        
        JTextField texto1 = new JTextField();
        JTextField texto2 = new JTextField();
        JTextField texto3 = new JTextField();
        
        JDateChooser calendario = new JDateChooser();
        calendario.setDateFormatString("yyyy-MM-dd");
        
        
        JButton boton = new JButton("Registrar");
        boton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String texto_1 = texto1.getText();
                String texto_2 = texto2.getText();
                java.util.Date fechaNa = calendario.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = sdf.format(fechaNa);
                
               try { 
                String query = "INSERT INTO Cliente values (?, ?, ?)";
                Connection conexion = DriverManager.getConnection(url, "root", "");
                PreparedStatement myst = conexion.prepareStatement(query);
                
                myst.setString(1, texto_1);
                myst.setString(2, texto_2);
                myst.setString(3, fecha);
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
        panel.add(calendario);
        panel.add(label4);
        panel.add(boton);
        
        
        this.pack();
        this.setVisible(true);
    }
}
