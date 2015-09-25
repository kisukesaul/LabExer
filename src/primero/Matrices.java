/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *matrices
 * @author armando
 */
public class Matrices {
    public Matrices(){
        
    }
    
    
    public int[][] fillMatriz(int [][] a){
        for (int i=0; i<a.length; i++)
            for (int j=0; j<a.length;j++)
            a[i][j]=(int)(Math.random()*100);
        return a;
    }
 //metodo de impresion
    
    private int [][] sumaMat(int [][] a, int [][] b){
        return a;
    }
    
     private int [][] restaMat(int [][] a, int [][] b){
        return a;
    }
    
      private int [][] multiMat(int [][] a, int [][] b){
        return a;
    }
    
       public void  printDiagonal(int [][] a){
        
    }
    
        public void  printMayorMenor(int [][] a){
        
    }
    
    
    
    public void PrintMatriz(int [][] a){
        for (int i=0;i<a.length;i++)
            for(int j=0;j<a.length;j++)
            System.out.println("elemento : ["+i+","+j+"]="+a[i][j]);
    }
    
    
    
    
    
    public static void main(String[] args) {

        int [][] vec;
        vec = new int[100][100];
        
        //declarar un objeto
        Matrices ar = new Matrices();
        ar.fillMatriz(vec);
        ar.PrintMatriz(vec);
}
}
