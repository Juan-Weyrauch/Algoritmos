public class Medico {
    private final int cedula;
    private final String nombre;
    private final String especialidad;
    
    public Medico(int cedula, String nombre, String especialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.especialidad = especialidad;
        
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    public String imprimir(){
        return (Integer.toString(this.cedula) + ","+ this.nombre);
    }
    public String imprimirDatos(){
        return (Integer.toString(this.cedula) + ","+ this.nombre+","+this.especialidad);
    }
            
}
