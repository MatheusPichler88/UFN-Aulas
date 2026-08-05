package aula15.pkg;

public class TrainguloPrincipal {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(2,2,4);
        try{
        triangulo.validarTriangulo();
    }
        catch(Exception e){
        System.out.println(e.getMessage());}
    }
}
