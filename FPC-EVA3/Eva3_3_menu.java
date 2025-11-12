/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_menu;

import java.util.Scanner;



/**
 *
 * @author leona
 */
public class Eva3_3_menu {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
            imprimirMneu();
            opcion = captu.nextInt();
            if(opcion == 1){
                
            }else if(opcion == 2){
            }
        }while(opcion != 3);
        
        
        
    }
    public static void imprimirMenu(){
        System.out.println("bienvenido al sistema");
        System.out.println("1. calcular una potencia");
        System.out.println("2. sumar dos numeros");
        System.out.println("3. salir del sistema");
        System.out.println("selecciona una opcion");
    }
    public static void calcularPotencias(){
        Scanner captu = new Scanner(System.in);
        int base, exp;
        System.out.println("******calculo de una potencia******");
        System.out.println("captura la base");
        base = captu.nextInt();
    }
}
