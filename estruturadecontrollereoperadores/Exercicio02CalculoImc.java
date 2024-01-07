package estruturadecontrollereoperadores;

import java.util.Scanner;

public class Exercicio02CalculoImc {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digiste seu peso: ");
        double peso = leia.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = leia.nextDouble();

        Double AlturaQuadrado = altura * altura;

        Double imc = peso / AlturaQuadrado;

        System.out.println("o Valor do imc: " + imc);


        leia.close();

    }
}
