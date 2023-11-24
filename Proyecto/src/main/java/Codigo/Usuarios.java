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
public class Usuarios {
//Declaracion de metodos privados
    private String nombreUsuario;
    private String contrasena;

    /**
     * 
     * @param nombreUsuario
     * @param contrasena 
     */
    public Usuarios(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    /**
     * 
     * @return nombreUsuario
     */
    public String getNombreUsuario() {
        //Se puede observar el nombre del usuario guardado
        return nombreUsuario;
    }

    /**
     * 
     * @return contrasena 
     */
    public String getContrasena() {
        //Se puede observar la contraseña del usuario guardadas
        return contrasena;
    }

}



