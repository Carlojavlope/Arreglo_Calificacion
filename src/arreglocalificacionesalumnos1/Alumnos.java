package arreglocalificacionesalumnos1;

public class Alumnos {

//    //Constructor
    public Alumnos() {
        calificaciones = new byte[6];
        materia = new String[6];
    }
    private String nombre;
    private byte[] calificaciones;
    private float promedio;
    private String[] materia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public byte[] getCalificaciones() {
        return calificaciones;
    }

    /**
     * @param calificaciones the calificaciones to set
     */
    public void setCalificaciones(byte[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    /**
     * @return the promedio
     */
     public String [] getMateria() {
        return materia;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setMateria(String nombre) {
        this.materia = materia;
    }

    public float getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

}
