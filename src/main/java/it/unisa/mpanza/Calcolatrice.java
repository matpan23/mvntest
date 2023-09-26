package it.unisa.mpanza;

public class Calcolatrice {
   private int a, b;

    public Calcolatrice() {
        this.a=0;
        this.b=0;
    }
    public int Somma(int a, int b) {
        return a+b;
    }
    public int Moltiplicazione(int a, int b) {
        return a*b;
    }
    public int Division(int a, int b) {
        return a/b;
    }
    public int Sottrazione(int a, int b) {
        return a-b;
    }

}
