/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *segundo programa 
 * 03 de septiembre del 2015
 * instanciar la clase nomina
 * @author armando
 */
public class MainNomina {
    public static void main(String [] args){
        //declaro e instancio un objeto
        
        Nomina objeto = new Nomina();
        Nomina objeto2 = new Nomina(2,"saul",1500.33F);
        Nomina objeto3 = objeto2;//objeto para copiar el estado de otro
        
        
        System.out.println(objeto.toString());
        System.out.println("*************************************");
        
        System.out.println(objeto2.toString());
        System.out.println("*************************************");
        
        //modificamos estado de objeto objeto
      objeto3.modificaestado(1, "armando", 3212.32F);
        System.out.println(objeto3.toString());
        //objeto2.toString(2,"armando",333.33F);
        
        System.out.println("****************variable de clase(global)*********************");
        System.out.println(objeto.getvarclase());
        System.out.println("*************************************");
        System.out.println(objeto2.getvarclase());
        System.out.println("*************************************");
        System.out.println(objeto3.getvarclase());
        
    }
}
