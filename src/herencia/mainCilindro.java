/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *instanciar objeto
 * maincilindro
 * @author armando
 */
public class mainCilindro {
    
    public static void main(String []args){
        
        Cilindro cil = new Cilindro();
        
        //dar valores a X y Y
        //metodos de punto
        cil.setY(10);
        cil.setY(20);
        //metodo de circunferencia
        cil.setRadio(34.12F);
        //metodo de cilindro
        cil.setAltura(56.89F);
        //imprimir
        System.out.println(cil.estadoObjeto());
        
        
    }
    
    
    
}
