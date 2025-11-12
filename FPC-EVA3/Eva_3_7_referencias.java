/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_7_referencias;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Eva_3_7_referencias {

    public static void main(String[] args) {
       String cliente[] = new String[5];
       double credito [] = new double[5];
       capturarClientes(cliente, credito);
       imprimir(cliente, credito);
       
    }
    public static void capturarClientes(String[] nombre, double[] credito){
        Scanner captu = new Scanner(System.in);
        for (int i = 0; i < credito.length; i++){
            System.out.print("nombre del cliente: ");
            nombre[i] = captu.nextLine();
            System.out.print("credito del cliente: ");
            credito[i] = captu.nextDouble();
            captu.nextLine();
        }
    }
    public static void imprimir(String[] nombre, double[] credito){
        for (int i = 0; i < credito.length; i++){
            System.out.println("nombre: " + nombre[i] + ", credito: $" + credito[i]);
            
        }
        
    }
    public static void imprimir(String[] nombre){
        
    }
        for (int i = 0; i < nombre.length; i++){
            System.out.println("nombre: " + nombre[i]);
}
    }