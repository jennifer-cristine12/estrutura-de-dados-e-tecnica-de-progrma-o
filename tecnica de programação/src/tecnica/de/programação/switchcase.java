
package tecnica.de.programação;
import java.util.Scanner;
public class switchcase {
       public static void main(String[] args) {
           Scanner a = new Scanner(System.in);
           System.out.println("Entre com um numero de 1 a 4");
           int num = a.nextInt();
           switch(num){
               case 1:
                   System.out.println("voce escolheu 1");
                break;
                case 2:
                    System.out.println("voce escolheu 2");
                break;
                case 3:
                    System.out.println("voce escolheu 3");
                break;
                case 4:
                    System.out.println("voce escolheu 4");
                break;
                default:
                    System.out.println("numero invalido");
                break;
           }
       }
}
