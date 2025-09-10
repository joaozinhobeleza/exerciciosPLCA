package sispaga;

public class PagamentoBoleto extends Pagamento {
    
    private double desconto;

    public PagamentoBoleto(double valorBase, double desconto) {
        super(valorBase);
        this.desconto = desconto; 
    }

    @Override
    public double calcularValor() {
        return valorBase * (1 - desconto);
    }
    
}
