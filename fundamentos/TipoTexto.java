package fundamentos;

import java.util.Scanner;

public class TipoTexto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome = leia.nextLine();

        System.out.println("Ola " + nome + "!");

        leia.close();





    }
}
