/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *MainPersonal
 * @author armando
 */
public class MainPersonal {
    
    
    public static void main(String []args){
    
    Personal  per[] = new Personal[10];
    
    //crear objetos
    for(int i=0; i<10; i++)
        per[i]= new Personal();
    
    //insertar elementos en el array
    per[0].insertaelemento(1, "saul", 23.43F);
    per[1].insertaelemento(2, "armando", 23.43F);
    per[2].insertaelemento(3, "tania", 34.43F);
    per[3].insertaelemento(4, "omar", 56.43F);
    per[4]= new Personal(5, "Uriel", 43.12F);
    
    
    //imprimir elementos
    
//    for( int i=0; i<5; i++)
//        System.out.println("Clave :"+per[i].clave+"\n"+
//                            "Nombre :"+per[i].nombre+"\n")+
//                            "Sueldo :"+per[i].sueldo;
    for( int i=0; i<5; i++)
        System.out.println(per[i].getatributos());
}
}