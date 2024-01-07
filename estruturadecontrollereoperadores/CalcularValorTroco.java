package estruturadecontrollereoperadores;

import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = leia.nextDouble();

        System.out.print("Digite quantidade passada pelo cliente: ");
        Double valorPassadoPeloCliente = leia.nextDouble();

        Double resultado = valorPassadoPeloCliente - valorProduto;

        System.out.println("Troco: " + resultado);

        leia.close();


    }
}
