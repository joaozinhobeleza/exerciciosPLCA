package formasgeo;

public class FormasGeo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        formageoo circulo = new Circulo(5.0);
        formageoo retangulo = new Retangulo(4.0, 6.0);
        formageoo triangulo = new Triangulo(3.0, 8.0);

        
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        }
        
    }
    

