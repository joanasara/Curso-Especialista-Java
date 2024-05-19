package fundamentos;

public class TipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa: " + variavelFalsa);

        System.out.println("-------------------------");

        Integer idade = 20;
        Boolean podeTirarCarteira = true;

        if (podeTirarCarteira){
            System.out.println("Sim ela pode tirar a carteira");
        } else {
            System.out.println("Nao ele nao pode tira a carteira");
        }
        //System.out.println("Pode tirar carteira? " + podeTirarCarteira);


    }
}
