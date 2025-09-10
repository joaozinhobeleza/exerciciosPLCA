package sisfunci;

public class SisFunci {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario gerente = new Gerente("Carlos", 5000.0, 1500.0);
        Funcionario programador = new Programador("Ana", 3000.0, 50.0, 10);

        System.out.printf("Salário do Gerente %s: R$%.2f\n", "Carlos", gerente.calcularSalario());
        System.out.printf("Salário da Programadora %s: R$%.2f\n", "Ana", programador.calcularSalario());
        
    }
    
}
