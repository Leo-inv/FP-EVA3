/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_areas;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Eva3_9_areas {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("areas");
            System.out.println("1.calcular area del circulo");
            System.out.println("2.calcular area de un rectangulo");
            System.out.println("3.calcular area de un trapecio");
            System.out.println("4.salir");
            System.out.println("selecciona una opcion: ");
            opcion = input.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.print("ingresa el radio de un circulo: ");
                    double radio = input.nextDouble();
                    System.out.println("area del circulo: " + calcularArea(radio));
                    break;
                    
                case 2:
                    System.out.print("ingresa la base del rectangulo: ");
                    double base = input.nextDouble();
                    System.out.print("ingresa la altura del rectangulo: ");
                    double altura = input.nextDouble();
                    System.out.println("area del rectangulo: " + calcularArea(base, altura));
                    break;
                    
                case 3:
                    System.out.print("ingresa la base mayor del trapecio: ");
                    double baseMayor = input.nextDouble();
                    System.out.print("ingresa la base menor del trapecio: ");
                    double baseMenor = input.nextDouble();
                    System.out.print("ingresa la altura del trapecio: ");
                    double alturaTrapecio = input.nextDouble();
                    System.out.println("area del trapecio: " + calcularArea(baseMayor, baseMenor, alturaTrapecio));
                    break;
                    
                default:
                    System.out.println("opcion no valida");
            }
                    
                    
            System.out.println();
        }while (opcion !=4);
            
        }   
        
    }
    public static double calcularArea(double radio){
        
    }
              

