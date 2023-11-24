/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import java.util.ArrayList; // Importamos la clase ArrayList

/**
 *
 * @author KendallZR
 * @see 1.1.0
 * @since 17/11/2023
 */
public class Metodos_Geometricos {
    //Declaracion de Variables
    double D, d, p, a, h, B, b;
    
    // ArrayList para almacenar resultados y datos usados en los cálculos
    ArrayList<String> resultadosGeometricos = new ArrayList<>();
    
    /**
     * 
     * @param D
     * @param d
     * @return Area 
     */
    public double AreaRombo(double D, double d){
        //Operacion para saber el Area del Rombo, multiplicacion
        double  Area = D * d;
        
        // Guardamos los datos en el ArrayList
        resultadosGeometricos.add("Área del rombo: D=" + D + ", d=" + d + ", resultado=" + Area);
        
        return Area;
    }
    
    /**
     * 
     * @param p
     * @param a
     * @return Area 
     */
    public double AreaPoligono(double p, double a){
        //Operacion para saber el Area del Poligono, multiplicacion y division
        double Area = (p * a)/2;
        
        // Guardamos los datos en el ArrayList
        resultadosGeometricos.add("Área del polígono, p=" + p + ", a=" + a + ", resultado=" + Area);
        
        return Area;
    }
    
    /**
     * 
     * @param h
     * @param B
     * @param b
     * @return Area
     */
    public double AreaRomboide(double h, double B, double b){
        //Operacion para saber el Area del Romboide, dos multiplicaciones y division
        double Area = (h*(B*b))/2;
        
        // Guardamos los datos en el ArrayList
        resultadosGeometricos.add("Área del romboide, h=" + h + ", B=" + B + ", b=" + b + ", resultado=" + Area);
        
        return Area;
    }
    
    public ArrayList<String> getResultados() {
        return resultadosGeometricos;
    }
}
