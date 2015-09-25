/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author armando
 */

//metodo de llenado
public class Arreglos {
    
    //constructor
    public Arreglos(){
        
    }
    
    
    public int[] fillarray(int [] a){
        for (int i=0; i<a.length; i++)
            a[i]=(int)(Math.random()*100);
        return a;
    }
 //metodo de impresion
    
    public void Printarray(int [] a){
        for (int i=0;i<a.length;i++)
            System.out.println("elemento : ["+i+"]="+a[i]);
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
//        int array [] = { 1 , 2 , 0 , 4 , 5 , 0 , 4 , 4 , 4 , } ;
        //int tam= 20;
        int [] vec;
        vec = new int[100];
        
        //declarar un objeto
        Arreglos ar = new Arreglos();
        ar.fillarray(vec);
        ar.Printarray(vec);
        
        
        
//        int numBuscado = 4 ; // por ejemplo
// 
//		int numApari = numApariciones ( array , numBuscado ) ;
// 
//		System . out . println ( " Cantidad de Apariciones del numero " + numBuscado + " = " + numApari ) ;
        
        
    }
    
//    public static int numApariciones ( int array [] , int num )
//	{
//		int apariciones = 0 ;
// 
//		for ( int elemento : array  )
//		{
//			if ( elemento == num )
//				apariciones ++ ;
//		}
// 
//		return apariciones ;
//	}
}
