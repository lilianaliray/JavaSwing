/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
// paso 8- importar la clase con la ventana
import Ventana2.ventana2;// import paquete.clases
import javax.swing.JFrame;

/**
 *
 * @author LAB04
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        // TODO code application logic here
        //paso 9- llamado a la clase JFrame
      
        ventana2 ventana = new ventana2();// crea un objeto tipo ventana2
        ventana.setVisible(true);
        ventana.setBounds(0, 0,600, 800);
        // la siguiente inst. le pone titulo a la ventana
        ventana.setTitle("Mi primer interfaz grafica");
        // la siguiente sentencia es para finalizar el proyecto al cerrar
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
