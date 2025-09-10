package sispaga;

public abstract class Pagamento {
    
    protected double valorBase;

    public Pagamento(double valorBase) {
        this.valorBase = valorBase;
    }

    public abstract double calcularValor();
    
}
