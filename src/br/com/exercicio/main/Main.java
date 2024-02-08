package br.com.exercicio.main;

import br.com.exercicio.produto.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o valor do produto: ");
        Scanner leitura = new Scanner(System.in);
        double valorLido = leitura.nextDouble();

        Produto produto = new Produto(valorLido);
        produto.obterValor();
        produto.mostraValor();


        int valorC = 10;
        double val = Double.parseDouble(String.valueOf(valorC));
        System.out.printf("Valor real: %.0f %n", val);
        System.out.println("Valor inteiro: " + valorC);


        double valorD = 10;
        int valorD_Covertido  = (int) valorD;
        System.out.printf("Valor real: %.0f %n", valorD);
        System.out.println("Valor inteiro: " + valorD_Covertido);

    }
}