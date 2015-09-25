/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *circunferencia subclase de superclase punto
 * herencia de punto
 * @author armando
 */
public class Circunferencia extends Punto{
    
   //atributo
    protected float radio;
    
    //constructor
    public Circunferencia(){;}
    
    //metdo get de radio
    
    protected float getRadio(){
        return radio;
    }
    //metodo set
    protected void setRadio(float vRadio){
        radio=vRadio;
    }
    
    protected String estadoObjeto(){
        return "las coordenadas del punto son: "+
                "X= "+this.x+","+"Y="+this.y+
                "el valor del radio: "+this.radio;
    }
   
}
