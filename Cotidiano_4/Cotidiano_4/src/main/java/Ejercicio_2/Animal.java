/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author KendallZR
 * @since 16/08/2023
 * @version 0.1
 */
public class Animal {
    private String nombre;
    private double tamano;
    private int edad;
    private double peso;
    private boolean vacunas;
    
    //Constructor de la clase
    public Animal (String nombre, double tamano, int edad, double peso, boolean vacunas){
        this.nombre=nombre;
        this.tamano=tamano;
        this.edad=edad;
        this.peso=peso;
        this.vacunas=vacunas;
    }
    
    //Metodos
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public double getTamano(){
        return tamano;
    }
    public void setTamano(double tamano){
        this.tamano=tamano;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    
    public boolean getVacunas(){
        return vacunas;
    }
    public void setVacunas(boolean vacunas){
        this.vacunas=vacunas;
    }
}
