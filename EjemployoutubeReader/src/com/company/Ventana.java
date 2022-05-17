package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public JPanel panel;

    public Ventana(){
        setSize(500,500);
        //cuando cierro la ventana termina el código
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("ya tu sae");
        iniciarcomponentes();
    }

    private void iniciarcomponentes(){
        panel= new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.RED);
        this.getContentPane().add(panel);//agregamos panel a ventana
        colocaretiquetas();
    }

    private void colocaretiquetas(){

        JLabel etiqueta= new JLabel("maradona fernet messi", SwingConstants.CENTER);  //para centrar las letras de la etiqueta
        etiqueta.setBounds(100,10,300,80);
        etiqueta.setForeground(Color.BLACK); //color letras
        //etiqueta.setOpaque(true); //damos permiso para cambiar el color de fondo
        //etiqueta.setBackground(Color.black);
        etiqueta.setFont(new Font("cooper black",0,20));
        panel.add(etiqueta);
        ImageIcon imagen= new ImageIcon(Ventana.class.getResource("profe.PNG"));
        JLabel etiqueta2 = new JLabel(imagen);
        etiqueta2.setBounds(10,50,500,280);
        panel.add(etiqueta2);
    }
}
