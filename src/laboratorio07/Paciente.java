/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio07;

/**
 *
 * @author Leonardo
 */
public class Paciente {
    private String nombre;
    private String DNI;
    private String Telefono;
    
    private int SexoBiologico;
    public final static int MASCULINO = 0;
    public final static int FEMENINO = 1;


    public Paciente(String nombre, String DNI, String Telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.Telefono = Telefono;

    }
    public Paciente(){
    }

    public int getSexoBiologico() {
        return SexoBiologico;
    }

    public void setSexoBiologico(int SexoBiologico) {
        this.SexoBiologico = SexoBiologico;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    

    
    
    String getTexto(){
        return this.nombre + "  | DNI: "+this.DNI + "  | Telefono:  " + this.Telefono +"";
    }
    
}
