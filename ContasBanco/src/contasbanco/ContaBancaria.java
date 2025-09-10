package contasbanco;

public abstract class ContaBancaria {
    
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    
}
