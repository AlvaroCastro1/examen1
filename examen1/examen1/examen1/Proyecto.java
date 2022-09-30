//Alvaro Jesus Castro Pizaña
//Diego Gomez-Tagle Gonzales
package examen1;

public class Proyecto {
    private String nombre, area, proceso;
    // constructor

    public Proyecto(String nombre, String area, String proceso) {
        this.nombre = nombre;
        this.area = area;
        this.proceso = proceso;
    }

    // setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    // metodos extra
    public void crearReporte() {
        System.out.println("El proceso del proyecto es de: " + getProceso());
    }

    // metodo toString
    public String toString() {
        String cad = "\nProyecto";
        cad += "\nNombre: " + getNombre();
        cad += "\nArea: " + getArea();
        cad += "\nProceso: " + getProceso();
        return cad;
    }
}