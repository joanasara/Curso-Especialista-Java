package boaspraticascleancode;

public class Cliente {

    String razaoSocial;
    static final double TAXA_LIMITE_CREDITO = 0.10;
    static final double LIMITE_CREDITO_MINIMO = 10_000;
    double faturamentoAnul;


    double calcularLimiteCreditor() {
        double limiteCredito = faturamentoAnul * TAXA_LIMITE_CREDITO;

        if (limiteCredito < LIMITE_CREDITO_MINIMO) {
            limiteCredito = LIMITE_CREDITO_MINIMO;

        }

        return  limiteCredito;
    }
}
