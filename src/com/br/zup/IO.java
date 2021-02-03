package com.br.zup;

import java.util.Scanner;

public class IO {

    public Scanner entradaDeDados() {
        return new Scanner(System.in);
    }

    public void  saideDeDados(String texto) {
        System.out.println(texto);
    }

    public Scanner pedirUmDado (String texto){
        saideDeDados(texto);
        return entradaDeDados();
    }
}
