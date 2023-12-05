package estruturadecontrollereoperadores;

import java.util.Scanner;

public class EstruturaRepeticaoFor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Peso maximo da aeronave: ");
        int pesoMaximo = leia.nextInt();

        System.out.print("Quantidade de passageiros: ");
        int totalPassageiros = leia.nextInt();

        int pesoTotalPassageiro = 0;
        for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++) {
            System.out.printf("Peso passageiro #%d", passageiroAtual);
            int pesoPassageiro = leia.nextInt();

            pesoTotalPassageiro += pesoPassageiro;
        }

        System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
        System.out.printf("Peso maximo da passageiros: %d kg%n", pesoTotalPassageiro);
        System.out.printf("Sintuacao da eronave: %s%n", pesoTotalPassageiro > pesoMaximo ? "peso excedido" : "liberada");

    }
}
