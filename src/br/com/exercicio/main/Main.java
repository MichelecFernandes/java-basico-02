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
    }
}