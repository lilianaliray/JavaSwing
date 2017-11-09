/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana2;
//pasi 1- importamos toda la libreria
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author LAB04
 */
public class  ventana2 extends JFrame
{
    // paso 3- declarar los elementos a utilizar
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    JCheckBox ticket;
    JRadioButton elegir;
    
    
     //paso 4-definir el constructor
    public ventana2()
    {
        //paso 5- crear inicializa los objetos
       panel  = new JPanel();// creo un objeto tipo JPanel
       label = new JLabel();
       text = new JTextField(20);//20 es la cantidad de caracteres
       boton = new JButton();
       ticket = new JCheckBox();
       elegir = new JRadioButton();
               
       
       // paso 6- agregar los elementos al JFrame
       this.add(panel);
       panel.add(label);
       panel.add(text);
       panel.add(boton);
       panel.add(ticket);
       panel.add(elegir);
       
       
       
       //paso 7-propiedades de los objetos
       
       label.setText("Nombre");
       boton.setText("Enviar");
       panel.setBackground(Color.pink);//color de fondo del JPanel
    }
   
    {
        
    }
    
}
