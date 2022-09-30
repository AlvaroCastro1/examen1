package examen1;

import javax.swing.*;
import java.awt.event.*;

public class guardar extends JFrame implements ActionListener {
    JLabel et_nombreINV, et_carreraINV, et_especialidadINV, et_edadINV;
    JTextField txt_nombreINV, txt_carreraINV, txt_especialidadINV, txt_edadINV;

    JLabel et_nombrePROY, et_areaPROY, et_procesoPROY;
    JTextField txt_nombrePROY, txt_areaPROY, txt_procesoPROY;

    JLabel et_nombreCEN, et_direccionCEN, et_especialidadCEN, et_directorCEN;
    JTextField txt_nombre, txt_direccion, txt_especialidad, txt_director;

    JLabel et_titulo1,et_titulo2,et_titulo3;


    JButton btn_limpiar, btn_guardar, btn_menu;

    Centro c1;
    Investigador IN;
    Proyecto pro;
    Object[] ob= new Object[50];
    int indice=0;
    public guardar() {
        setTitle("Guardar");
        setSize(1000, 350);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(3);
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public guardar(int id, Object[] objetos) {
        setTitle("Guardar");
        setSize(1000, 350);
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
        iniciarC_CEN();
        iniciarC_INV();
        iniciarC_PROY();

        et_titulo1 = new JLabel("Datos del Centro");
        et_titulo2 = new JLabel("Datos del Investigador");
        et_titulo3 = new JLabel("Datos del Proyecto");

        et_titulo1.setBounds(90, 0, 100, 20);
        add(et_titulo1);

        et_titulo2.setBounds(440, 0, 150, 20);
        add(et_titulo2);

        et_titulo3.setBounds(780, 0, 150, 20);
        add(et_titulo3);

        btn_limpiar = new JButton("Limpiar");
        btn_limpiar.setBounds(50, 190, 80, 30);
        btn_limpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
               Limpiar();
            }
        });
        add(btn_limpiar);

        btn_guardar = new JButton("Guardar");
        btn_guardar.setBounds(490, 190, 80, 30);
        btn_guardar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
               Guardar();
               JOptionPane.showMessageDialog(null, c1);
               Limpiar();
            }
        });
        add(btn_guardar);

        btn_menu = new JButton("Menu");
        btn_menu.setBounds(840, 190, 80, 30);
        btn_menu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                menuF m = new menuF(indice, ob);
                m.setVisible(true);
                setVisible(false);
            }
        });
        add(btn_menu);

    }

    public void actionPerformed(ActionEvent e) {
        menuF c = new menuF();
        c.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        guardar g = new guardar();
        g.setVisible(true);
    }

    public void iniciarC_INV() {
        et_nombreINV = new JLabel("Nombre:");
        et_nombreINV.setBounds(360, 30, 80, 20);
        add(et_nombreINV);

        et_carreraINV = new JLabel("Carrera:");
        et_carreraINV.setBounds(360, 70, 80, 20);
        add(et_carreraINV);

        et_especialidadINV = new JLabel("Especialidad:");
        et_especialidadINV.setBounds(360, 110, 80, 20);
        add(et_especialidadINV);

        et_edadINV = new JLabel("Edad:");
        et_edadINV.setBounds(360, 150, 80, 20);
        add(et_edadINV);

        txt_nombreINV = new JTextField();
        txt_nombreINV.setBounds(440, 30, 200, 20);
        add(txt_nombreINV);

        txt_carreraINV = new JTextField();
        txt_carreraINV.setBounds(440, 70, 200, 20);
        add(txt_carreraINV);

        txt_especialidadINV = new JTextField();
        txt_especialidadINV.setBounds(440, 110, 200, 20);
        add(txt_especialidadINV);

        txt_edadINV = new JTextField();
        txt_edadINV.setBounds(440, 150, 200, 20);
        add(txt_edadINV);
    }

    public void iniciarC_PROY() {

        et_nombrePROY = new JLabel("Nombre:");
        et_nombrePROY.setBounds(710, 30, 80, 20);
        add(et_nombrePROY);

        et_areaPROY = new JLabel("Area:");
        et_areaPROY.setBounds(710, 70, 80, 20);
        add(et_areaPROY);

        et_procesoPROY = new JLabel("Proceso:");
        et_procesoPROY.setBounds(710, 110, 80, 20);
        add(et_procesoPROY);

        txt_nombrePROY = new JTextField();
        txt_nombrePROY.setBounds(765, 30, 200, 20);
        add(txt_nombrePROY);

        txt_areaPROY = new JTextField();
        txt_areaPROY.setBounds(765, 70, 200, 20);
        add(txt_areaPROY);

        txt_procesoPROY = new JTextField();
        txt_procesoPROY.setBounds(765, 110, 200, 20);
        add(txt_procesoPROY);

    }


    public void iniciarC_CEN(){
        et_nombreCEN = new JLabel("Nombre:");
        et_nombreCEN.setBounds(10, 30, 80, 20);
        add(et_nombreCEN);

        et_direccionCEN = new JLabel("Direccion:");
        et_direccionCEN.setBounds(10, 70, 80, 20);
        add(et_direccionCEN);

        et_especialidadCEN = new JLabel("Especialidad:");
        et_especialidadCEN.setBounds(10, 110, 80, 20);
        add(et_especialidadCEN);

        et_directorCEN = new JLabel("Director:");
        et_directorCEN.setBounds(10, 150, 80, 20);
        add(et_directorCEN);

        txt_nombre = new JTextField();
        txt_nombre.setBounds(90, 30, 200, 20);
        add(txt_nombre);

        txt_direccion = new JTextField();
        txt_direccion.setBounds(90, 70, 200, 20);
        add(txt_direccion);

        txt_especialidad = new JTextField();
        txt_especialidad.setBounds(90, 110, 200, 20);
        add(txt_especialidad);

        txt_director = new JTextField();
        txt_director.setBounds(90, 150, 200, 20);
        add(txt_director);
    }
    public void Limpiar(){
        txt_nombreINV.setText("");
        txt_carreraINV.setText("");
        txt_especialidadINV.setText("");
        txt_edadINV.setText("");
        txt_nombrePROY.setText("");
        txt_areaPROY.setText("");
        txt_procesoPROY.setText("");
        txt_nombre.setText("");
        txt_direccion.setText("");
        txt_especialidad.setText("");
        txt_director.setText("");

    }
    public void Guardar(){
        c1=new Centro(txt_nombre.getText(), txt_direccion.getText(), txt_especialidad.getText(), txt_director.getText());
        IN = new Investigador(txt_nombreINV.getText(), txt_carreraINV.getText(), txt_especialidadINV.getText(), Integer.parseInt(txt_edadINV.getText()));
        pro = new Proyecto(txt_nombrePROY.getText(), txt_areaPROY.getText(), txt_procesoPROY.getText());
        //relacion directa y relacion de agregacion
        IN.setProtecto(pro);
        c1.setInvestigador(IN);
        ob[indice]=c1;
        indice++;
    }
}