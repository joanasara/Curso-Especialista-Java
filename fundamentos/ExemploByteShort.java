package fundamentos;

public class ExemploByteShort {
    public static void main(String[] args) {

        byte idade = 127;
        // byte idade = 128; nao compila
        System.out.println(idade);

        short quantidadeEstoque = 32767; //valor maximo
        // short quantidadeEstoque = 32768; nao compila
        System.out.println(quantidadeEstoque);


    }
}
