package fundamentos;

public class AulaVariavel {
    public static void main(String[] args) {
        int minhaIdade = 40;
        int suaIdade = 25;

        // se a variavel for do mesmo tipo, pode fazer dessa forma
        // lembrando que declarando dessa forma nao e uma boa pratica, o recomendado e declara uma variavel por linha e cada uma com seu tipo
        // nao recomendado pela Code Conventions da Oracle

        //Lmebrando tambem que nomes de variaveis deve ser Camel case

        int minhaIdade01 = 67, suaIdade01 = 34;

        int totalIdade01 = minhaIdade01 + suaIdade01;
        int totalIdade = minhaIdade + suaIdade;

        System.out.println(totalIdade01);
        System.out.println(totalIdade);
    }
}
