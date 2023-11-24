/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

/**
 *
 * @author KendallZR
 * @see 1.1.0
 * @since 17/11/2023
 */
public class UsuarioGlobal {
    // Variable estática que será compartida entre todas las instancias de la clase
    public static String userGlobal = "";

    // Método estático para obtener el valor de la variable
    /**
     * 
     * @returnuserGlobal 
     */
    public static String getUserGlobal() {
        return userGlobal;
    }

    // Método estático para establecer el valor de la variable
    /**
     * 
     * @param value 
     */
    public static void setUserGlobal(String value) {
        userGlobal = value;
    }
}
