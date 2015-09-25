/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *Cilindro
 * tercer nivel de herencia
 * @author armando
 */
public class Cilindro extends Circunferencia{
    //agregamos el atributo
    protected float altura;
    
    public Cilindro(){;}
    
    //metodo get
    protected float getAltura(){
        return altura;
    }
    //metodo set
    protected void setAltura(float vAltura){
        altura=vAltura;
    }
    
     protected String estadoObjeto(){
        return "las coordenadas del punto son: "+
                "X= "+this.x+","+"Y="+this.y+
                "el valor del radio: "+this.radio+
                "el valor de la altura: "+this.altura;
    }
    
    
}
