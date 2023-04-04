
package repeticao;

import java.util.Scanner;
public class Repeticao {

    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int b,c=0;
        System.out.println("digite um numero inteiro");
        b=a.nextInt();
        while(c<=10){
            System.out.println(b+" x "+c+" = "+(b*c));
            c++;
        }
    }
    
}
