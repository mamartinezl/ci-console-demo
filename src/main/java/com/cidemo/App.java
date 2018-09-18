package com.cidemo;

import com.cidemo.service.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        //comentario
        //comentario2
        System.out.print("Ingresa n1: ");
        int n1 = input.nextInt();

        System.out.print("Ingresa n2: ");
        int n2 = input.nextInt();

        System.out.print("Ingresa n3: ");
        int n3 = input.nextInt();

        int res = calculator.calcularMayor(n1,n2,n3);

        System.out.println("El mayor es: "+res);
    }
}
