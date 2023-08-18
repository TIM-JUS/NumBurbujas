/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordennum;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class OrdenNum {

    public static void main(String[] args) {
        System.out.println("==BIENVENIDO A MI PROGRAMA \nNUMEROS BURBUJAS===");
        Scanner scanner =new Scanner(System.in);
        int[] arreglo = new int[5];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("INGRESE EL NUMERO " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
    scanner.close();
        System.out.print("\nLOS NUMEROS SON: ");
        for (int num : arreglo) System.out.print(num + " ");
        System.out.println();
        
        for (int i = 0; i < arreglo.length - 1; i++)
            for (int j = 0; j < arreglo.length - i - 1; j++)
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
        System.out.print("\nLOS NUEVOS NUMEOS SON: ");
        for (int num : arreglo) System.out.print(num + " ");
        System.out.println();
    }
}
