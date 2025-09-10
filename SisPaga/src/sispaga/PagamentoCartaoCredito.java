package sispaga;

public class PagamentoCartaoCredito extends Pagamento {
    
    private double juros;

    public PagamentoCartaoCredito(double valorBase, double juros) {
        super(valorBase);
        this.juros = juros; 
    }

    @Override
    public double calcularValor() {
        return valorBase * (1 + juros);
    }
    
}
