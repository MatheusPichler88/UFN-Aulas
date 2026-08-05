package Aula_9.Ex1;

public abstract class Computador {
    protected String marca;
    private String modelo;

    public Computador(){
    }
    public Computador(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String exibeModelo(){
        return modelo;
    }

}
