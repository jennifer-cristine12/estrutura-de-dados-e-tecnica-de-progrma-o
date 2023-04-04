/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticao;

import java.util.Scanner;
import java.util.Random;

public class AvivinhaNumCopia {
   public static void main(String[] args) {
       Random gerador = new Random();
       int numero = gerador.nextInt(20);
         Scanner a = new Scanner (System.in);
         int x,i =0;
         do{
             i++;
             System.out.println("digite um numero aleatorio entre 0 e 20");
             x = a.nextInt();
             if(x==numero){
                 System.out.println("Parabens, voce acertou em "+i+" tenttivas");  
             }
             else if(x<numero){
                 System.out.println("o numero pensado é maior");
             }
             else{
                 System.out.println("o numero pensado é menor");
             }
         }
         while(x!=numero);
         
     }  
}
