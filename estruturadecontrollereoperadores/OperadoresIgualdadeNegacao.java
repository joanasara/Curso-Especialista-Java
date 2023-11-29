package estruturadecontrollereoperadores;

public class OperadoresIgualdadeNegacao {
    public static void main(String[] args) {
        boolean numerosIguais = 10 == 10;
        System.out.printf("Numero iguais: %b%n", numerosIguais);


        boolean numerosIguais02 = (4 + 6) == (5 * 2);
        System.out.printf("Numero iguais: %b%n", numerosIguais02);

        int numero1 = 10;
        int numero2 = 11;

        boolean numerosIguaisSoma = numero1 == numero2;
        System.out.printf("Numero iguais: %b%n", numerosIguaisSoma);

        /*O Operador unario e um tipo de operador que precisa
        de um a penas um operando para realizar a operacao
         */

        boolean numerosDiferentes = !numerosIguaisSoma;
        System.out.printf("Numeros diferentes: %b%n", numerosDiferentes);


        boolean numerosDiferentes02 = !(numero1 == numero2);
        System.out.printf("Numeros diferentes: %b%n", numerosDiferentes02);

        String nome1 = "Miguel";
        String nome2 = "Miguel";

        boolean nomesIguais = nome1 == nome2;
        System.out.printf("Nome Iguais: %b%n", nomesIguais);


    }
}
