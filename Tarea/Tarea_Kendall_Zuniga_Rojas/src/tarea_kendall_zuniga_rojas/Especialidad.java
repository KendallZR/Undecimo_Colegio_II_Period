/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_kendall_zuniga_rojas;

/**
 *
 * @author kenda
 */
public class Especialidad {
       //Declaración de variables
    private String precioConsulta;
    private String especialidad;
   
    //Constructor de clase persona 
    public Especialidad (String precioConsulta, String especialidad){
        this.precioConsulta=precioConsulta;
        this.especialidad=especialidad;
   }
   
    //get y set
    public String getPrecioConsulta(){
        return precioConsulta;
    }
   
    public void setPrecioConsulta(String precioConsulta){
        this.precioConsulta=precioConsulta;
    }
    
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
    public String toString() {
        return "Precio de la Consulta: " + precioConsulta + ", Especialidad: " + especialidad; 
    }
}
