package com.br.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	IO entradaESaida = new IO();
	Contador calculadora = new Contador();
	calculadora.numero1 = entradaESaida.pedirUmDado("Digite o primeiro número: ").nextInt();
	calculadora.numero2 = entradaESaida.pedirUmDado("Digite o segundo número: ").nextInt();

	entradaESaida.saideDeDados("O valor total da soma é "+calculadora.soma());
	entradaESaida.saideDeDados("O valor total da subtracao é "+calculadora.subtrair());

    }
}