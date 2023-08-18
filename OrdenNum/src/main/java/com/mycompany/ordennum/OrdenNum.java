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

    }
}
