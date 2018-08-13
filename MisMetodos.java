package com;

public class MisMetodos {
    public int Suma(int n1, int n2){
        return n1+n2;
    }
    
    public int Resta(int n1, int n2){
        return n1 - n2;
    }
    
    public int Multiplicacion(int n1, int n2){
        return n1 * n2;
    }
    
    public double Division(int n1, int n2){
        if(n2!=0){
            return n1 / n2;
        }else{
            System.out.println("No dividir entre 0");
            return 0;
        }
    }
}




