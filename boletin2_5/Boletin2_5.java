
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double sueldoBruto, sueldoLiquido , sueldoFijo, km, dias, ventas;
        System.out.println("Cuanto es el sueldo? ");
        sueldoFijo = sc.nextDouble();
        System.out.println("Cuantos quilometros ha hecho? ");
        km = sc.nextDouble();
        System.out.println("Cuantos dias estuvo fuera? ");
        dias = sc.nextDouble();
        System.out.println("Cual fue el importe total de vendas? ");
        ventas = sc.nextDouble();
        sueldoBruto= sueldoFijo + (km*2) + (dias*30) + (ventas*5/100);
        sueldoLiquido= sueldoBruto - (sueldoBruto*18/100) - 36;
System.out.println("El saldo bruto es "+sueldoBruto+" € pero su neto es de " +sueldoLiquido+ "€"); 
        
        
        // TODO code application logic here
    }
    
}
