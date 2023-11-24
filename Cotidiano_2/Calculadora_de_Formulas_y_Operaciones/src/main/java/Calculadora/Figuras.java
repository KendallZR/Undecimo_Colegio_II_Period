/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Kendall ZR
 * @deprecated result
 * @see Cuadrado
 * @see Circulo
 * @see Triangulo
 * @see Rectangulo
 * @version 1
 * @since 18-19/07/2023
 */
public class Figuras {
     public double result;
    
     /**
      * 
      * @param num1 es la variable Lado1
      * @return result (el Area del cuadrado)
      */
    public void figCuadradoArea(double num1){
        result = Math.pow(num1, 2);
    }
    
    /**
     * 
     * @param num1 es la variable Lado2
     * @return result (el Perimetro del cuadrado)
     */
    public void figCuadradoPeri(double num1){
        result = num1+num1+num1+num1;
    }
    
    
    
    /**
     * 
     * @param num1 es la variable Alturas1
     * @param num2 es la variable Bases1
     * @return result (el Area del cuadrado)
     */
    public void figRectanguloArea(double num1, double num2){
        result = num1 * num2;
    }
    
    /**
     * 
     * @param num1 es la variable Alturas2
     * @param num2 es la variable Bases2
     * @return result (el Perimetro del cuadrado)
     */
    public void figRectanguloPeri(double num1, double num2){
        result = num1 + num2 * 2;
    }
    
    
    /**
     * 
     * @param num1 es la variable Radios1
     * @return result (el Area del cuadrado)
     */
    public void figCirculoArea(double num1){
        result = Math.PI*(Math.pow(num1, 2));
    }
    
    /**
     * 
     * @param num1 es la variable Radios2
     * @return result (el Perimetro del cuadrado)
     */
    public void figCirculoPeri(double num1){
        result = 2*Math.PI*num1;
    }
    
    
    
    /**
     * 
     * @param num1 es la variable Alturas1
     * @param num2 es la variable Bases1
     * @return result (el Area del cuadrado)
     */
    public void figTrianguloArea(double num1, double num2){
        result = num1*num2/2;
    }
    
    /**
     * 
     * @param num1 es la variable Lados1
     * @param num2 es la variable Lados2
     * @param num3 es la variable Bases2
     * @return result (el Perimetro del cuadrado)
     */
    public void figTrianguloPeri(double num1, double num2, double num3){
        result = num1+num2+num3;
    }
}
