/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doc_Interfaz;
/**
 *
 * @author Kendall
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desarrollo_Interfaz {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    }
    
public String decimalABinario(String datoNumeric) {
    int Dato = Integer.parseInt(datoNumeric);
    String Binarios = Integer.toBinaryString(Dato);
    
    return Binarios;
}
  
  
  
public String cifras (String datoNumeric){
        
        int num=datoNumeric.length();
    
        return Integer.toString(num);
}
    

public String conversion (String datoNumeric, String Op){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        
        double dato = Integer.valueOf(datoNumeric);
        
        switch (Op){
            case "Dolares":
            double dolares = dato/534.22;
            return Double.toString(dolares);

            case "Euros":
            double euros = dato/589.62;
            return Double.toString(euros);
            
            case "Libras":
            double libras = dato/685.30;
            return Double.toString(libras);
            
            case "Yenes":
            double yenes = dato/3.78;
            return Double.toString(yenes);
        }
    return null;
}



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

public String numerosPrimos (String datoNumeric){
       int dato = Integer.parseInt(datoNumeric);
       if (esPrimo(dato)){
           return "Si es un numero primo.";
       }else{
           return "No es un numero primo.";
       }
}

  public static boolean numericInt(String datoNumeric){
        try {
            Integer.parseInt(datoNumeric);
            return true;
        } catch(NumberFormatException exception){
          return false;
        }
  }
          
/*if(datoNumeric.isEmpty()){
        System.out.println("El espacio esta vacio");
    }else if(!numericInt(datoNumeric)){
        System.out.println("El dato no es numerico");
    } */ 
}