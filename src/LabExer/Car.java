/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExer;

/**
 *
 * @author armando
 */
public class Car {
    
    public static int distancia(int a){
    int howlong=a;
           
    int distancia=howlong*60;
    
        
        
    return distancia;
    }
    
    
    public static void main(String[] args) {
    Car obj = new Car();
    
//    obj.distancia(5);
    System.out.println("Distancia recorrida: "+obj.distancia(5));
}
}
