package org.example;

public class Calcolatrice {

    private int a,b;

    public Calcolatrice(){
        this.a=0;
        this.b=0;
    }

    public int somma(int a, int b){
        return a+b;
    }

    public int moltiplicazione(int a, int b){
        return a*b;
    }

    public int sottrazione(int a, int b){
        return a-b;
    }

    public float divisione(int a, int b) throws Exception{
        if(b==0) throw new RuntimeException("Errore: divisione per zero");
        return a/b;
    }
}
