package estruturadecontrollereoperadores;

public class OperadoresComparacao {
    public static void main(String[] args) {
        int pesoProdutos = 900;
        int limitePesoCaminho = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminho;
        System.out.printf("Carga Excedida: %b%n", cargaExcedida);

        boolean cargaLiberada = pesoProdutos <= limitePesoCaminho;
        System.out.printf("Carga Liberada: %b%n", cargaLiberada);
    }
}
