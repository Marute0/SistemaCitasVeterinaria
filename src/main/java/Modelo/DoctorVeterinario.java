package Modelo;

public class DoctorVeterinario extends Persona{
    //Atributos
    private String contraseña;
    private String especializacion;

     //Constructor

    public DoctorVeterinario() {
    }
    
    public DoctorVeterinario(int ID, String nombre, String apellido) {
        super(ID, nombre, apellido);
    }

    public DoctorVeterinario(int ID, String nombre, String apellido, String nDocumento, String email, String numeroTelefono, String contraseña, String especializacion) {
        super(ID, nombre, apellido, nDocumento, email, numeroTelefono);
        this.contraseña = contraseña;
        this.especializacion = especializacion;
    }

    //Getters and setters
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }


    
    @Override
    public String mostrarInformación() {
        return getNombre() + " " + 
               getApellido() + "," + 
               contraseña + "," + 
               getEmail() + "," + 
               getNumeroTelefono() + "," + 
               especializacion + ",";
    }

    //Método abstracto para la obtención del nombre
    @Override
    public String nombreCompleto() {
    
        return "Dr. " + getNombre() + " " + getApellido();
    
    }
}
