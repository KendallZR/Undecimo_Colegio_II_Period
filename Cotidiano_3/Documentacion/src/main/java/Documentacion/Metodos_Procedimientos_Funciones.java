/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentacion;

/**
 *
 * @author KendallZR
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Metodos_Procedimientos_Funciones {
    Scanner sc = new Scanner(System.in);
    
    /**
     * 
     * @param ops 
     * @return decimalABinario(datoNumeric) Devuelve el numero en decimal
     * @return cifras(datoNumeric) Devuelve las cifras del numero
     * @return convercion(datoNumeric) Devuelve los colones en diferentes monedas
     * @return numerosPrimos(datoNumeric) devuelve si es o no, numero primo
     */
    public void menu(int ops){
        String datoNumeric;
    switch (ops){
            case 1:
                System.out.println("Digite su numero binario: ");
                datoNumeric = sc.next();
                decimalABinario(datoNumeric);
                break;
                
            case 2:
                System.out.println("Digite su numero: ");
                datoNumeric = sc.next();
                cifras(datoNumeric);
                break;
                
            case 3:
                System.out.println("Digite sus colones, para convertirlo: ");
                datoNumeric = sc.next();
                conversion(datoNumeric);
                break;
            case 4:
                System.out.println("Digite un numero: ");
                datoNumeric = sc.next();
                numerosPrimos(datoNumeric);
            default:
                System.out.println("\n\n*********************************************************************");
                System.out.println("********************GRACIAS, TENGA UN BUEN DIA!!!********************");
                    
        }
    }
    
    /**
     * 
     * @param datoNumeric 
     * 
     */
public void decimalABinario(String datoNumeric) {
    long binario = 0;
    int digito;
    final int DIVISOR = 2;
    
    if(datoNumeric.isEmpty()){
        System.out.println("El espacio esta vacio");
    }else if(!numericInt(datoNumeric)){
        System.out.println("El dato no es numerico");
    }else{
        int dato = Integer.parseInt(datoNumeric);
        for (int i = dato, j = 0; i > 0; i /= DIVISOR, j++) {
            digito = i % DIVISOR;
            binario += digito * Math.pow(10, j);
        }
        System.out.println("\nEl dato Decimal "+datoNumeric+" a dato Binario es: "+binario);
    }
      
    return;
}
  
  
  /**
   * 
   * @param datoNumeric 
   * 
   */
public void cifras (String datoNumeric){
    if(datoNumeric.isEmpty()){
        System.out.println("El espacio esta vacio");
    }else if(!numericInt(datoNumeric)){
        System.out.println("El dato no es numerico");
    }else{
        System.out.println("\nEl numero de cifras de "+datoNumeric+" es de "+datoNumeric.length());
    }
}
    
/**
 * 
 * @param datoNumeric 
 * 
 */
public void conversion (String datoNumeric){
      if(datoNumeric.isEmpty()){
        System.out.println("El espacio esta vacio");
    }else if(!numericInt(datoNumeric)){
        System.out.println("El dato no es numerico");
    }else{
        DecimalFormat formato1 = new DecimalFormat("#.00");
        
        double dato = Integer.valueOf(datoNumeric);
        double dolares = dato/534.22;
        
        double euros = dato/589.62;
        
        double libras = dato/685.30;
        
        double yenes = dato/3.78;
        
        System.out.println("\n******Conversion******"
                + "\nCOLONES ₡"+(formato1.format(dato))+" a:"
                + "\n\nDolares: $"+(formato1.format(dolares))
                + "\nEuros: €"+(formato1.format(euros))
                + "\nLibras: £"+(formato1.format(libras))
                + "\nYenes: ¥"+(formato1.format(yenes)));
    }
}


/**
 * 
 * @param datoNum
 * @return true
 */
public static boolean esPrimo(int datoNum){
    if(datoNum <= 1){
        return false;
    }
    for (int i = 2; i * i <= datoNum; i++){
        if (datoNum % 1 == 0){
            return false;
        }
    }
    return true;
}
/**
 * 
 * @param datoNumeric 
 */
public void numerosPrimos (String datoNumeric){
     if(datoNumeric.isEmpty()){
        System.out.println("El espacio esta vacio");
    }else if(!numericInt(datoNumeric)){
        System.out.println("El dato no es numerico");
    }else{
       int dato = Integer.parseInt(datoNumeric);
       if (esPrimo(dato)){
           System.out.println(datoNumeric+" es un numero primo.");
       }else{
           System.out.println(datoNumeric+" no es un numero primo.");
       }
    }
}

/**
 * 
 * @param datoNumeric
 * @return false
 */
  public static boolean numericInt(String datoNumeric){
        try {
            Integer.parseInt(datoNumeric);
            return true;
        } catch(NumberFormatException exception){
          return false;
        }
  }
            
}
