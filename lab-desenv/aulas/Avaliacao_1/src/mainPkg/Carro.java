/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPkg;

/**
 *
 * @author laboratorio
 */
public class Carro extends Veiculo{

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public double getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(double capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
    
    private int numeroPortas;
    private double capacidadePortaMalas;
    

    @Override
    public double calculaImposto() {
       return valorBase + 3000;
    }
    
     public Object[] obterDados(){
       return new Object[] {modelo, marca, anoFabricacao, tipoCombustivel, placa,
           numeroPortas, capacidadePortaMalas}; 
    }
    
}
