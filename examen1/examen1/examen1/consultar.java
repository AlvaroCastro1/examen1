package examen1;

import javax.swing.*;
import java.awt.event.*;

//paqueterias para pdf
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class consultar extends JFrame implements ActionListener {

    JLabel et_numero, et_datos;
    JTextArea txt_datos;

    JSpinner sp_numero;

    JButton btn_limpiar, btn_menu, btn_obtener, btn_pdf;

    Object[] ob = new Object[50];
    int indice;

    public consultar() {
        setTitle("Guardar");
        setSize(500, 650);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(3);
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public consultar(int id, Object[] objetos) {
        setTitle("Guardar");
        setSize(500, 650);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(3);
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        indice = id;
        ob = objetos;
    }

    public void initComponents() {

        et_numero = new JLabel("Numero del Registro:");
        et_numero.setBounds(10, 10, 120, 20);
        add(et_numero);

        SpinnerModel value = new SpinnerNumberModel(0, 0, 10, 1);
        sp_numero = new JSpinner(value);
        sp_numero.setBounds(140, 10, 70, 20);
        add(sp_numero);

        txt_datos = new JTextArea();
        txt_datos.setBounds(25, 40, 500, 400);
        add(txt_datos);

        btn_limpiar = new JButton("Limpiar");
        btn_limpiar.setBounds(50, 500, 80, 30);
        btn_limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                Limpiar();
            }
        });
        add(btn_limpiar);

        btn_obtener = new JButton("Obtener datos");
        btn_obtener.setBounds(50, 550, 100, 30);
        btn_obtener.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                ObtenerDatos();
            }
        });
        add(btn_obtener);

        btn_menu = new JButton("Menu");
        btn_menu.setBounds(350, 500, 80, 30);
        btn_menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                menuF m = new menuF(indice, ob);
                m.setVisible(true);
                setVisible(false);
            }
        });
        add(btn_menu);

        btn_pdf = new JButton("PDF");
        btn_pdf.setBounds(190, 500, 80, 30);
        add(btn_pdf);

        btn_pdf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = JOptionPane.showInputDialog("Ingrese el nombre");
                    generar(name);
                } catch (FileNotFoundException ex) {
                    System.out.println(ex);
                } catch (DocumentException ex) {
                    System.out.println(ex);
                }
            }
        });

    }

    public void generar(String nombre) throws FileNotFoundException, DocumentException {
        if (!txt_datos.getText().isEmpty()) {

            FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();

            Paragraph parrafo = new Paragraph("Datos");

            parrafo.setAlignment(1);
            documento.add(parrafo);
            documento.add(new Paragraph(txt_datos.getText()));

            documento.close();
            JOptionPane.showMessageDialog(null, "Archivo PDF creado correctamente", "Información", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Atención", 2);
        }
    }

    public void actionPerformed(ActionEvent e) {
        menuF c = new menuF();
        c.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        consultar c = new consultar();
        c.setVisible(true);
    }

    public void Limpiar() {
        txt_datos.setText("");
        sp_numero.setValue(0);
    }

    public void ObtenerDatos() {
        txt_datos.setText("");
        if (ob[Integer.parseInt(sp_numero.getValue().toString())] != null) {
            txt_datos.setText(ob[Integer.parseInt(sp_numero.getValue().toString())].toString());
        } else {
            JOptionPane.showMessageDialog(null, "Elemento vacio", "Información", 2);
        }
    }

}
