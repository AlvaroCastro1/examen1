//Alvaro Jesus Castro Pizaña
//Diego Gomez-Tagle Gonzales
package examen1;

public class Investigador {
    private String nombre, carrera, especialidad;
    private int edad;
    //private int numE;
    // relacion directa
    Proyecto proyecto;

    // constructor
    public Investigador(String nombre, String carrera, String especialidad, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.especialidad = especialidad;
        this.edad = edad;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Proyecto getProtecto() {
        return proyecto;
    }

    public void setProtecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    // metodo extra
    public void investigar() {
        if (proyecto != null) {
            System.out.println("Se esta investigando" + proyecto.getNombre());
        } else {
            System.out.println("Sin proyecto!!!");
        }
    }

    // metodo toString
    public String toString() {
        String cad = "\nInvestigador";
        cad += "\nNombre: " + getNombre();
        cad += "\nCarrera: " + getCarrera();
        cad += "\nEdad: " + getEdad();
        if (proyecto != null) {
            cad += proyecto.toString();
        } else {
            cad += "Sin proyecto";
        }
        return cad;
    }

}