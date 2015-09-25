/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *personal.java
 * @author armando
 */
public class Personal {
    private int clave;
    private String nombre;
    private float sueldo;
    //constructor
    
    public Personal(){;}
    
    //constructor sobrecargado
    public Personal(int code, String name, float sal){
        clave = code;
        nombre=name;
        sueldo=sal;
    }
   
    public void insertaelemento(int code, String name, float sal){
        clave = code;
        nombre=name;
        sueldo=sal;
    }
    
    public String getatributos(){
        
        return "Clave : "+clave+","+
               " Nombre : "+nombre+","+
                " Sueldo : "+sueldo+"\n";
        
        
        
    }
    
    
    
}
