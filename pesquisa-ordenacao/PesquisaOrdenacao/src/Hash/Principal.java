/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author matheus
 */
public class Principal {
    public static void main(String[] args) {
        HashSet <Integer> tabela = new HashSet();
        Random gerador = new Random();
        int numero;
        int endereco;
        for(int i = 0; i < 5; i++){
            numero = gerador.nextInt(20);
            endereco = (""+numero).hashCode();
            System.out.println("Numero: "+numero+". \nEndereço: "+endereco);
           if(!tabela.add(numero)){
               System.out.println("Numero já inserido: "+ numero + ". Endereço: " + endereco);
           }
        }
        for (Integer item : tabela){
            System.out.println(item);
        }
    }
}
