package fundamentos;

public class OperadorIncremento {
    public static void main(String[] args) {
        //EXEMPLO DE INCREMENTO
        int totalDownloads = 10;

        // Exemplo de pos fixada
        totalDownloads++;
        int novoTotalDownloads = totalDownloads;

        System.out.println("Total de downloads: " + totalDownloads);
        System.out.println("Novo total downloads: " + novoTotalDownloads);


        //Exemplo de pre fixada

        int totalDownloads01 = 10;
        int novoTotalDownloads01 = ++totalDownloads01;

        System.out.println("Total de downloads01: " + totalDownloads01);
        System.out.println("Novo total downloads01: " + novoTotalDownloads01);

         //EXEMPLO DE DRECREMENTO
        int limiteTentativasLogin = 10;
        limiteTentativasLogin--;
        System.out.println("Limite tentativas login: " + limiteTentativasLogin);

        //EXEMPLO DE POS FIXADO

        int novolimiteTentativasLogin = 10;
        int novolimiteTentativasLogin01 = --novolimiteTentativasLogin;
        System.out.println("Novo Limite tentativas login: " + novolimiteTentativasLogin01);

    }
}
