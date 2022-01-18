// https://es.acervolima.com/java-swing-crea-un-editor-de-texto-simple/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;

import org.w3c.dom.Text;

public class Editor {

    JFrame frame; //ventana
    JMenu menu;//menu
    JMenuBar menuBar;//menu
    JLabel label; //text area
    

    //constructor de la ventana de la app
    Editor() {

        frame = new JFrame("Editor de texto"); //crear ventana
        JButton button = new JButton("Boton 1"); // crea instancia boton
        button.setBounds(50,50,90,50); // x, y, ancho, alto
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierra ventana
        Menu();
        Area();
        frame.setSize(500, 600); //medidas ventana
        frame.setLayout(null);
        frame.setVisible(true);
        
        
    }

    void Menu(){

        // crear barra de menu
        menuBar = new JMenuBar();

        //crear menu - ARCHIVO
        JMenu archivo = new JMenu("Archivo");

        // crear items de menu 
            JMenuItem abrir = new JMenuItem("Abrir");
            JMenuItem guardar = new JMenuItem("Guardar");

        // agregar items de menu al menu 
        archivo.add(abrir);
        archivo.add(guardar);

        // crear nuevo menu - EDITAR
        JMenu editar = new JMenu("Editar");

        // crear items de menu
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem eliminar = new JMenuItem("Eliminar");

        // agregar items al menu
        editar.add(cortar);
        editar.add(copiar);
        editar.add(pegar);
        editar.add(eliminar);

        // agregar menues a la barra
        menuBar.add(archivo);
        menuBar.add(editar);

        // mostrar en ventana el menu
        frame.setJMenuBar(menuBar);


    }

    void Area(){
        JLabel label = new JLabel("nada");

        JButton boton=new JButton("boton");
        JTextArea jTextArea= new JTextArea(10,10); 
        JPanel panel = new JPanel();

        panel.add(jTextArea);
        panel.add(boton);
        panel.add(label);
        

        frame.add(panel);
    

    } 
    public static void main(String args[])
    {
        Editor e = new Editor();
        
    }
}
