package estruturadecontrollereoperadores;

import java.util.Scanner;

public class ExameCortisol {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Cortisol: ");
        double cortisol = leia.nextDouble();

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        System.out.printf("cortisol normal: %b%n", resultadoNormal);

        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;
        System.out.printf("cortisol anormal: %b%n", resultadoAnormal);

    }
}
