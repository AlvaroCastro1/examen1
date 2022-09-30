//Diego Gomez Tagle González y Alvaro Jesus Castro Pizaña
package examen1;

public class Centro {
    private String nombre, direccion, especialidad, director;
    Investigador investigador;
    // constructor


    public Centro(String nombre, String direccion, String especialidad, String director) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.director = director;

    }

    // setters y getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDirector() {
        return director;
    }

    public void setNombre(String Nombre) {
        nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        direccion = Direccion;
    }

    public void setEspecialidad(String Especialidad) {
        especialidad = Especialidad;
    }

    public void setDirector(String Director) {
        director = Director;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    // metodos extra
    public void abrirCentro() {
        System.out.println("El centro esta abierto");
    }

    public void despedirInvestigador() {
        investigador = null;
    }

    // metodo toString
    public String toString() {
        String cad = "\nCentro";
        cad += "\nNombre: " + getNombre();
        cad += "\nDireccion: " + getDireccion();
        cad += "\nEspecialidad: " + getEspecialidad();
        cad += "\nDirector: " + getDirector();
        if(investigador!=null){
            cad+="\n";
            cad+= investigador.toString();
        }
        else{
            cad+= "\nsin investigador";
        }
        return cad;
    }

}