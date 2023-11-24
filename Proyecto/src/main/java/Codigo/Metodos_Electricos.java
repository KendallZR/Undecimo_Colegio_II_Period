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

public class Metodos_Electricos {
    //Declaracion de variables
    double difPoten; //diferencia de potencia
    double corri; //corriente
    double resist; //resistencia

    // ArrayList para almacenar resultados y datos usados en los cálculos
    ArrayList<String> resultadosElectricos = new ArrayList<>();
    
    /**
     * 
     * @param difPoten
     * @param corri
     * @return potencia 
     */
    public double PotenciaElectrica(double difPoten, double corri){
        //Operacion para saber la Potencia, multiplicacion
        double potencia = difPoten * corri;
        
        // Almacenar los datos en el ArrayList con el formato adecuado
        resultadosElectricos.add("Potencia eléctrica: difPoten=" + difPoten + ", corrri=" + corri + ", resultado=" + potencia);
        
        return potencia;
    }
    
    /**
     * 
     * @param corri
     * @param resist
     * @return voltaje 
     */
    public double Voltaje(double corri, double resist){
        //Operacion para saber el Voltaje, multiplicación
        double voltaje =  corri * resist;
        
        // Guardamos los datos en el ArrayList
        resultadosElectricos.add("Voltaje: corri=" + corri + ", resist=" + resist + ", resultado=" + voltaje);
        
        return voltaje;
    }
    
    /**
     * 
     * @param difPoten
     * @param corri
     * @return resistencia 
     */
    public double Resistencia(double difPoten, double corri){
        //Operacion para saber la Resistencia, division
        double resistencia = difPoten / corri;
        
        // Guardamos los datos en el ArrayList
        resultadosElectricos.add("Resistencia: difPoten=" + difPoten + ", corri=" + corri + ", resultado=" + resistencia);
        
        return resistencia;
    }
    
    /**
     * 
     * @param difPoten
     * @param resist
     * @return corriente 
     */
    public double Corriente(double difPoten, double resist){
        //Operacion para saber la Corriente, division
        double corriente = difPoten / resist;
        
        // Guardamos los datos en el ArrayList
        resultadosElectricos.add("Corriente: difPoten=" + difPoten + ", resist=" + resist + ", resultado=" + corriente);
        
        return corriente;
    }
    
    /**
     * 
     * @return resultadosElectricos
     * *NOTA: ArrayList
     */
     public ArrayList<String> getResultados() {
        return resultadosElectricos;
    }
}
