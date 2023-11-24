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
public class Principal_Main {
    public static void main(String[] args){

        Persona per = new Persona("Kendall Zuñiga Rojas", 18, "Masculino", 70, 1.73);
        
        Paciente pac = new Paciente("El 08 de febrero 2023", "Dr Especialista");
        
        Especialidad esp = new Especialidad("300 000", "Odontología");
        
        System.out.println(per);
        System.out.println(pac);
        pac.calculoIMC(70, 1.73);
        pac.esMayorDeEdad(18);
        System.out.println(esp);
       
        
        
    }
}

