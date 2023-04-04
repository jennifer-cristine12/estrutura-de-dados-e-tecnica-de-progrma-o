/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticao;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class estruturaDoWhile {
   public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        float b, soma =0;
        String resp;
        int cont = 0;
        do{
            System.out.println("Informe um numero"); 
            b=a.nextFloat();
            if (b>0){
                soma+=b;
                cont++;
                 }
            System.out.println("Deseja continuar (S ou N)?");
            resp = a.next();}
        while(resp.equalsIgnoreCase("s"));
            System.out.println("A media é: "+(soma/cont));
       
   }
   }

