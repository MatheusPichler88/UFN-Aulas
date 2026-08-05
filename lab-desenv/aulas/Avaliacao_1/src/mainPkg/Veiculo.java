/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPkg;

/**
 *
 * @author laboratorio
 */
public abstract class Veiculo {
    
    protected String modelo;
    protected String marca;
    protected String anoFabricacao;
    protected String tipoCombustivel;
    protected String placa;

    public double getValorBase() {
        return valorBase;
    }
    
   

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    protected double valorBase;
    
    public abstract double calculaImposto();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
   
}
