/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_kendall_zuniga_rojas;

/**
 *
 * @author kenda
 */
public class Paciente {
     //Declaración de variables
    private String fechaConsulta;
    private String medicoTratante;
   
    //Constructor de clase persona 
    public Paciente (String fechaConsulta, String medicoTratante){
        this.fechaConsulta=fechaConsulta;
        this.medicoTratante=medicoTratante;
   }
   
    //get y set
    public String getFechaConsulta(){
        return fechaConsulta;
    }
   
    public void setFechaConsulta(String fechaConsulta){
        this.fechaConsulta=fechaConsulta;
    }
    
    
    public String getMedicoTratante(){
        return medicoTratante;
    }
    
    public void setEdad(String medicoTratante){
        this.medicoTratante=medicoTratante;
    }
    
    public void calculoIMC(double peso, double altura){
        double imc = peso/altura;
        
        if(imc<18.5){
            System.out.println("Su Peso es Bajo");
        }else if(imc>18.5 && imc<24.9){
            System.out.println("Su Peso es Normal");
        }else if(imc>25 && imc<29.9){
            System.out.println("Su peso es SobrePeso");
        }else if(imc>30){
            System.out.println("Su peso es Obeso");
        }
       
    }
    
    public void esMayorDeEdad(int edad){
        boolean validacion;
        
        if(edad>=18){
            validacion=true;
            String validar = String.valueOf(validacion);
            validar = "Si";
            System.out.println("Es mayor de edad " + validar);
        }else if(edad<18){
            validacion=false;
            String validar = String.valueOf(validacion);
            validar = "No";
            System.out.println("Es mayor de edad " + validar);
        }
    }
    
    public String toString() {
        return "Fecha de la consulta: " + fechaConsulta + ", Medico Tratante del paciente: " + medicoTratante; 
    }
}

