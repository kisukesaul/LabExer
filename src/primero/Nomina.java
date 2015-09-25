/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *segundo programa 
 * 03 de septiembre del 2015
 * ¡haber si me acuerdo de esto jaja mas menos!
 * @author armando
 */
public class Nomina {
    //definir los atributos
    private int clave;
    private String nombre;
    private float sueldo;
    
    //variable de clase
    private final int costo=10;
    
   public Nomina(){;} 
    
   public Nomina(int code, String name,float salary){
       clave = code;
       nombre = name;
       sueldo = salary;      
//       System.out.println("Clave :"+clave);
//       System.out.println("Nombre :"+nombre);
//       System.out.println("Sueldo :"+sueldo);
   
   } 

   //metodo get
   public String toString(){
       return "clave:"+clave+"\n"+
               "nombre :"+nombre+"\n"+
               "sueldo :"+sueldo;
   }
   
   //metodo set
   public void modificaestado(int code, String name,float salary){
        clave = code;
       nombre = name;
       sueldo = salary;      
//       System.out.println("Clave :"+clave);
//       System.out.println("Nombre :"+nombre);
//       System.out.println("Sueldo :"+sueldo);
   }
   
   public int getvarclase(){
    return costo;
   }
 
   
   
   
//    public static void main(String[] args) {
//       Nomina objeto= new Nomina();
//       
//       
//        
//    
//        
//        
//    }
//    
    
    
    
}
