package br.com.exercicio.produto;

public class Produto {
    private double valor;

    public Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void obterValor(){
        System.out.println("O valor do produto é " + this.valor);

    }
    public void mostraValor(){
        System.out.printf("Valor com casas decimais: %.2f %n", this.valor);
        System.out.printf("Valor inteiro: %.0f %n", this.valor);
    }


}
