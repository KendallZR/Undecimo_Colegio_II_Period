/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author CTPG
 */
public class Barcos {
    private String color;
    private String tipoCarga;
    private double tam;
    private String ident;
    private int año_fab;
    private double precio;
    private double desc;
    
    //Constructor de la clase
    public Barcos (String color, String tipoCarga, double tam, String ident, int año_fab, 
            double precio, double desc){
        this.color=color;
        this.tipoCarga=tipoCarga;
        this.tam=tam;
        this.ident=ident;
        this.año_fab=año_fab;
        this.precio=precio;
        this.desc=desc;
    }
    
    //Metodos
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    
    public String getTipoCarga(){
        return tipoCarga;
    }
    public void setMarca(String tipoCarga){
        this.tipoCarga=tipoCarga;
    }
    
    public double getTam(){
        return tam;
    }
    public void setTam(double tam){
        this.tam=tam;
    }
    
    public String getIdent(){
        return ident;
    }
    public void setIdent(String ident){
        this.ident=ident;
    }
    
    public int getAño_fab(){
        return año_fab;
    }
    public void setAño_fab(int año_fab){
        this.año_fab=año_fab;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio, int año_fab){
        
        Switch(año_fab){
            case 2010:
                precio=20000;
                break;
            case 2015: 
                precio=30000;
                break;
            case 2020:
                precio=45000;
                break;
            default:
        }
        
        this.precio=precio;
    }
    
    public double getDesc(){
        return desc;
    }
    public void setDesc(double desc){
        
        desc = desc * 0.12;
        
        this.desc=desc;
    }
    
    

}
