//Alvaro Jesus Castro Pizaña
//Diego Gomez Tagle Gonzales
package examen1;

import examen1.Centro;
import examen1.Investigador;

public class main{
    public static void main(String[] args) {
        Centro c1=new Centro("Juan", "Av Francisco delgado no 6", "Ciencia de datos", "JUAN GARCIA XD ");
        Investigador IN = new Investigador("Pedro", "Ing en computacion", "Ciencia de datos", 31);
        Proyecto pro = new Proyecto("Segmentacion", "Ciencia de datos", "30%");

        IN.setProtecto(pro);
        c1.setInvestigador(IN);
        System.out.println(c1);
       
    }
}