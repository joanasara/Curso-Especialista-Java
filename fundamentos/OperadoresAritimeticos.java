package fundamentos;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        int minhaIdade = 40;
        int suaIdade = 20;
        int idadeX = 50;

        //Adicao
        int totalIdade = minhaIdade + suaIdade;
        System.out.println("Soma das idades: " + totalIdade);

        //Subtracao
        int diferencaIdade = minhaIdade - suaIdade;
        System.out.println("Diferenca das idades: " + diferencaIdade);

        //Multiplicacao
        int dorbroDaIdade = 2 * suaIdade;
        System.out.println("Dobro da idade: " + dorbroDaIdade);

        //Divisao
        int metadeDaIdade = suaIdade / 2;
        System.out.println("Metade da sua idade: " + metadeDaIdade);

        //Modulo
        int restoDivisao = 7 % 2;
        System.out.println("Resto da divisao (modulo): " + restoDivisao);

        //Calculando a media da idade

        int mediaDaIdade = (minhaIdade + suaIdade + idadeX) / 3;
        System.out.println("Idade media: " + mediaDaIdade);

    }
}
