/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_4_paso_valor;

/**
 *
 * @author leona
 */
public class Eva_3_4_paso_valor {

    public static void main(String[] args) {
        int valor = 5;
        System.out.println("valor (antes) = " + valor);
        incrementar(valor);
        System.out.println("valor (despues) = " + valor);
    }
    //le sumo uno
    public static void incrementar(int val){
        val = val + 1;
        //val++;
    }
}
