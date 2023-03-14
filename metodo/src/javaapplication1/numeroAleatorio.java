/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class numeroAleatorio {
   static double numero(){
        double num =Math.random();
        num *=10;
        
        return Math.round(num);
    }
     public static void main(String[] args) {
         System.out.println(numero());
     }
}
