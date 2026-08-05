/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPkg;

/**
 *
 * @author laboratorio
 */
public class Moto extends Veiculo{

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }
    
    private int cilindradas;
    private String tipoTransmissao;

    @Override
    public double calculaImposto() {
        return valorBase + cilindradas;
    }
    
     public Object[] obterDados(){
       return new Object[] {modelo, marca, anoFabricacao, tipoCombustivel, placa,
           cilindradas, tipoTransmissao}; 
    }
    
}
