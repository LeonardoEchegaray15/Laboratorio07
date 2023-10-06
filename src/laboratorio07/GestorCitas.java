/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio07;

import java.util.List;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Leonardo
 */
public class GestorCitas {

    
     public static List<Cita> CitaEnSistema;
    public static List<Paciente> ListaPacientes;
    public static List<Medico> ListaMedicos;
    
    
    public static List<String> horas = new ArrayList<>();
    public static List<String> fechas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         CitaEnSistema = new ArrayList<>();
         ListaPacientes = new ArrayList<>();
         ListaMedicos = new ArrayList<>();
         
         //HORAS
        horas.add("8:00 am");
        horas.add("9:00 am");
        horas.add("10:00 am");
        horas.add("11:00 am");  
        horas.add("12:00 pm");  
        horas.add("12:30 am");  
        
        //FECHAS
        fechas. add("07/10/2023");
        fechas. add("08/10/2023");
        fechas. add("09/10/2023");
        fechas. add("10/10/2023");
        fechas. add("11/10/2023");
        // TODO code application logic here
        JFrameCitaPrincipal Frameprincipal = new JFrameCitaPrincipal();
        Frameprincipal.setLocationRelativeTo(null); //Me permite centrar la ventana
        Frameprincipal.setVisible(true); //Me permite mostrar el programa
    }
    
}
