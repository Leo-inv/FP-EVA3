/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_metodos;

/**
 *
 * @author leo
 */
public class EVA3_1_metodos {

    public static void main(String[] args) {
        int val1 = 5, val2 = 10;
        //1. si necesito guardar el valor de retorno.
        int resu = sumarEnteros (val1, val2); //invocar el metodo
        System.out.println("suma de 5 + 10 = " + resu);
        //2.no necesito guardar el valor, solo uno
        System.out.println("suma de 5 + 10 = " + sumarEnteros(val1, val2) );
        
        
    }
    //metodos para sumar dos enteros
    //llamar a sus metodos usando verbos y escritura camelCase
    //1. modificadores de acceso: public, protected, private, default
    //2. static --> para usar los metodos dentro del main
    //3.valor de retorno: cualquier tipo de dato
    // void --> si no quieren regresar un valor
    //4. nombre del metodo: mismas reglas e identificadores
    //5. lista de parametros: pueden ser cero o N cantidad
    //1    2     3     4        5
    public static int sumarEnteros(int num1, int num2){
        int suma = num1+ num2;
        return suma;
    }
}
