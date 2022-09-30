//Alvaro Jesus Castro Pizaña
//Diego Gomez-Tagle Gonzales

package examen1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menuF extends JFrame implements ActionListener {
    private JButton btn_guardar, btn_consultar;

    Object[] ob= new Object[50];
    int indice;

    public menuF() {
        setTitle("Menu");
        setSize(400, 500);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(3);
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);

    }
    public menuF(int id, Object[] objetos) {
        setTitle("Menu");
        setSize(400, 500);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(3);
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        indice= id;
        ob=objetos;
    }

    public void initComponents() {
        btn_guardar = new JButton("GUARDAR");
        btn_guardar.setBounds(100, 100, 200, 50);
        btn_guardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btn_guardar);

        btn_guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardar g = new guardar(indice, ob);
                g.setVisible(true);
                setVisible(false);
            }
        });

        btn_consultar = new JButton("CONSULTAR");
        btn_consultar.setBounds(100, 200, 200, 50);
        btn_consultar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btn_consultar);
        btn_consultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consultar c = new consultar(indice, ob);
                c.setVisible(true);
                setVisible(false);
            }
        });


    }

    public void actionPerformed(ActionEvent e) {
        
    }

    public static void main(String[] args) {
        menuF b = new menuF();

    }
}
