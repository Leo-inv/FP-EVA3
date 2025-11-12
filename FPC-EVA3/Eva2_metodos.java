/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_metodos;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Eva2_metodos {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        String mensaje;
        int valor;
        System.out.println("captura mensaje:");
        mensaje = imput.nextLine();
        System.out.println("captura de repeticiones");
        valor = imput.nextInt();
        imprimirMensaje(mensaje,valor);
        
        public static void imprimirMensaje(String mensaje, int repeticiones)
                for(int i = 0; i < repeticiones; i++){
                    System.out.println(mensaje);
                }
        
        
    }
}
