/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *Herencia
 * nombre: punto.java
 * @author armando
 */
public class Punto {
    //atributos
    protected int x,y;
    
    //constructor
    public Punto(){;}
    
    //mtodo get de la variable x
    protected int getX(){
        return x;
    }
    protected int getY(){
        return y;
    }
    
    //metodo set
    protected void setX(int valorX){
        x=valorX;
    }
    protected void setY(int valorY){
        y=valorY;
    }    
    
    //metodo toString
    
    protected String estadoObjeto(){
        return "las coordenadas del punto son: "+
                "X= "+this.x+","+"Y="+this.y;
    }

}
