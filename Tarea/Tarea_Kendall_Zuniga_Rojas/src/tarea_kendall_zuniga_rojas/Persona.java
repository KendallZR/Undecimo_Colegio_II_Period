/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_kendall_zuniga_rojas;

/**
 *
 * @author KendallZR
 * @since  23/10/2023
 * @version 0.1.1
 */
public class Persona {
    //Declaración de variables
    private  String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;
   
    //Constructor de clase persona 
    public Persona (String nombre, int edad, String genero, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.peso=peso;
        this.altura=altura;
   }
   
    //get y set
    public String getNombre(){
        return nombre;
    }
   
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    
    public Double getPeso(){
        return peso;
    }
    
    public void setPeso(Double peso){
        this.peso=peso;
    }
    
    
    public Double getAltura(){
        return altura;
    }
    
    public void setAltura(Double altura){
        this.altura=altura;
    }
    
    public String toString() {
        return "PACIENTE \nNombre: " + nombre + ", Edad: " + edad + ", Genero: " + genero + 
                ", Peso: " + peso + ", Altura: " + altura; 
    }
}

