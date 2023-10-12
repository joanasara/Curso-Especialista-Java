package fundamentos;

public class CalculadoraTicketMedio {
    public static void main(String[] args) {

        /*
        Um comerciante está curioso para saber o ticket médio das últimas 3 vendas que fez em sua loja e contratou você
        para desenvolver um programa que resolva isso.  Como você ainda não aprendeu a receber entrada de dados pelo
        usuário, você pediu ao comerciante os valores das 3 últimas vendas para incluir dentro do código-fonte
         do programa (mas prometeu arrumar isso assim que aprendesse). O comerciante te passou os
         seguintes valores: 20, 30 e 100.Desenvolva um programa que calcula a média desses números e exibe na saída.
         */

        int valor01 = 20;
        int valor02 = 30;
        int valor03 = 100;

        int mediaValor = (valor01 + valor02 + valor03) / 3;

        System.out.println("A media dos valores: " + mediaValor);

    }
}
