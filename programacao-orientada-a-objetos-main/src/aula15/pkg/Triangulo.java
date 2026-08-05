package aula15.pkg;

public class Triangulo {
    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void validarTriangulo() throws Exception{
        if(lado1+lado2<=lado3){
            throw new MinhaExcecao("Valores informados não formaram um trinagulo valido!");
        }
        else {
            System.out.println("Triangulo formado");
        }
    }
}
