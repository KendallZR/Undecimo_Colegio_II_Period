/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Kendall ZR
 * @deprecated result
 * @see Menu_Principal
 * @version 1
 * @since 18-19/07/2023
 */

public class Operaciones {
    
    public double result;
    
    /**
     * 
     * @param num1 numero ingresado 1
     * @param num2 numero ingresado 2
     * @return result el resultado de la suma
     */
    public void operasuma(double num1, double num2){
        result = num1 + num2;
    }
    
    /**
     * 
     * @param num1 numero ingresado 1
     * @param num2 numero ingresado 2 
     * @return result el resultado de la resta
     */
    public void operarest(double num1, double num2){
        result = num1 - num2;
    }
    
    /**
     * 
     * @param num1 numero ingresado 1
     * @param num2 numero ingresado 2
     * @return result el resultado de la multiplicacion
     */
    public void operamult(double num1, double num2){
        result = num1 * num2;
    }
    
    /**
     * 
     * @param num1 numero ingresado 1
     * @param num2 numero ingresado 2
     * @return result el resultado de la division
     */
    public void operadiv(double num1, double num2){
        result = num1 / num2;
    }
}
