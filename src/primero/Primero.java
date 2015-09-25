/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *primer programa 
 * 03 de septiembre del 2015
 * ¡haber si me acuerdo de esto!
 * @author armando
 */
public class Primero {
//    public void carro(String a){ //creando un metodo
//        String color=a; //agregando un valor a la variable
//        
//        System.out.println("color :"+color);//imprimiendo el valor que obtiene
//    }
    
    public void suma(int a,int b){
        int a1=a;
        int b1=b;
        System.out.println("suma de numeros: "+a1+"+"+b1+"="+(a1+b1));
        
    }
    public void resta(int a,int b){
        int a2=a;
        int b2=b;
        System.out.println("resta de numeros: "+a2+"-"+b2+"="+(a2-b2));
        
    }
    public void multiplicacion(int a,int b){
        int a3=a;
        int b3=b;
        System.out.println("multiplicacion de numeros: "+a3+"*"+b3+"="+(a3*b3));
        
    }
    
    //metodo statico
    
    private static void saludo(){//si es un metodo statico se puede llamar sin que se instancie
        System.out.println("hola peludos");
    }
    
    
     public void division(float a,float b){
        float a4=a;
        float b4=b;
        System.out.println("division de numeros: "+a4+"/"+b4+"="+(a4/b4));
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
         
//        int num;
//        int num2;
//        int num3;
//        num = 2;
//        num2=5;
//        num3=10;
        System.out.println("hola mundo peludo");
        
//        System.out.println("resta de numeros: "+num+"+"+num2+"="+(num-num2));
//        System.out.println("multiplicacion de numeros: "+num+"*"+num2+"="+(num*num3));
//        System.out.println("division de numeros: "+num+"/"+num2+"="+(((float)num/(float)num2)));
        Primero objeto1 = new Primero(); //declarando el objeto
//        objeto1.carro("verde");
        objeto1.suma(5, 8);
        objeto1.resta(9, 5);
        objeto1.multiplicacion(3, 3);
        objeto1.division(6, 5);
        saludo();//llamada a metodo sin instanciar
        System.out.println("***********************************************************************");
        Primero objeto2 = new Primero();
        
       objeto2.suma(3, 4);
       objeto2.resta(6, 9);
       objeto2.multiplicacion(2, 7);
       objeto2.division(7, 3);
        System.out.println("***********************************************************************");
        System.out.println("cuadrado de un numero : "+Math.pow(3, 3));
        System.out.println("cuadrado de un numero : "+Math.sqrt(6));
        
        
        
    }
}
