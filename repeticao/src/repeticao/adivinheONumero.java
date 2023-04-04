
package repeticao;
import java.util.Scanner;
public class adivinheONumero {
   static double numero(){
        double num =Math.random();
        num *=10;
        if(num<20)
        return Math.round(num);
       return 0;
      
    }
     public static void main(String[] args) {
         Scanner a = new Scanner (System.in);
         int x,i =0;
         do{
             i++;
             System.out.println("digite um numero aleatorio entre 0 e 20");
             x = a.nextInt();
             if(x==numero()){
                 System.out.println("Parabens, voce acertou em "+i+" tenttivas");  
             }
             else if(x<numero()){
                 System.out.println("o numero pensado é maior");
             }
             else{
                 System.out.println("o numero pensado é menor");
             }
         }
         while(x!=numero());
         
     }
}