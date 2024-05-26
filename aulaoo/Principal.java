package aulaoo;

public class Principal {
    public static void main(String[] args) {
       Pessoa eu = new Pessoa();
       eu.anoNascimento = "1998";
       eu.cpf = "3454566756";
       eu.nome = "joao";

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2010;
        meuCarro.cor = "preto";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "SU-V";
        meuCarro.propietario = eu;

        System.out.println("Meu Carro");
        System.out.println("------------");
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
        System.out.printf( "Modelo: %s%n",  meuCarro.modelo);
        System.out.printf( "cor: %s%n",  meuCarro.cor);

    }
}