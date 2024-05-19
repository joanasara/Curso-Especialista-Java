package aulaoo;

public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2010;
        meuCarro.cor = "preto";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "SU-V";

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Cinza";
        seuCarro.fabricante = "Toyota";
        seuCarro.modelo = "Corolla";

        System.out.println("Meu Carro");
        System.out.println("------------");
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
        System.out.printf( "Modelo: %s%n",  meuCarro.modelo);
        System.out.printf( "cor: %s%n",  meuCarro.cor);

        System.out.println();

        System.out.println("Seu Carro");
        System.out.println("------------");
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
        System.out.printf( "Modelo: %s%n",  seuCarro.modelo);
        System.out.printf( "cor: %s%n",  seuCarro.cor);





    }
}