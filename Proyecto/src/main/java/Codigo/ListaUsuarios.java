/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import java.util.ArrayList;

/**
 *
 * @author KendallZR
 * @see 1.1.0
 * @since 17/11/2023
 */

public class ListaUsuarios {
    //Declaracion del array para los usuarios
    private ArrayList<Usuarios> usuarios;
    
    //Lista del array, para los usuarios
    public ListaUsuarios() {
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new Usuarios("Admin", "12"));
        this.usuarios.add(new Usuarios("Kendall", "123"));
        this.usuarios.add(new Usuarios("Geisel", "1234"));
    }

    /**
     * 
     * @return usuarios
     */
    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    /**
     * 
     * @param usuarios 
     */
    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

}