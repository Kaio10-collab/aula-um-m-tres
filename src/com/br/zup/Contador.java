package com.br.zup;

public class Contador {

    int numero1;
    int numero2;


    public int soma() {

       int total = numero1 + numero2;
       return total;
    }

    public int subtrair(){
        if (new Validador().oPrimeiroÉMaior(numero1, numero2)){
            return numero1 - numero2;
        }
        return numero2 - numero1;
    }
}
