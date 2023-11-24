/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Documentacion;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class Documentacion {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Metodos_Procedimientos_Funciones opera = new  Metodos_Procedimientos_Funciones();
       
       int op;
       
        System.out.println("************************Bienvenido al Programa***********************");
        System.out.println("*********************************************************************");
        System.out.println("*_Menu______________________________________________________________*");
        System.out.println("*********************************************************************");
        System.out.println("*1. Convertir Numero Decimal a Binario."
                + "\n*2. Saber el numero de cifras de un numero dado."
                + "\n*3. Convertir un monto en Colones a Dólares, Euros, Libras y Yenes."
                + "\n*4. Determinar si un Numero es primo o no lo es."
                + "\n*********************************************************************");
        op = sc.nextInt();
        
        opera.menu(op);
     
     
        
      
       
    }
}
