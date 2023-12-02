package estruturadecontrollereoperadores;

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("preco dos produtos: ");
        double precoProduto = leia.nextDouble();

        System.out.print("Cobrar frete?");
        boolean cobrarFrete = leia.nextBoolean();

        double valorFrete = 0;
        if (cobrarFrete) {
            System.out.print("Valor do frete: ");
            valorFrete = leia.nextDouble();
        }

        double valorTotal = precoProduto + valorFrete;
        System.out.printf("valor total: R$%.2f%n", valorTotal);

    }
}
