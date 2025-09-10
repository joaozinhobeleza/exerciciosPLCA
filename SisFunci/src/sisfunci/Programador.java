package sisfunci;

public class Programador extends Funcionario {
    
    private double valorHoraExtra;
    private int horasExtras;

    public Programador(String nome, double salarioBase, double valorHoraExtra, int horasExtras) {
        super(nome, salarioBase);
        this.valorHoraExtra = valorHoraExtra;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (valorHoraExtra * horasExtras);
    }
    
}
