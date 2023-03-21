
package tecnica.de.programação;

import java.util.Scanner;

public class aula4Ex1 {
      public static void main(String[] args) {
           Scanner a = new Scanner(System.in);
           System.out.println("Entre com o numero do mês");
           int mes = a.nextInt();
           switch(mes){
               case 1:
                   System.out.println("voce selecionou Janeiro");
               break;
               case 2:
                   System.out.println("voce selecionou Fevereiro");
               break;
               case 3:
                   System.out.println("voce selecionou Março");
               break;
               case 4:
                   System.out.println("voce selecionou Abril");
               break;
               case 5:
                   System.out.println("voce selecionou Maio");
               break;
               case 6:
                   System.out.println("voce selecionou Junho");
               break;
               case 7:
                   System.out.println("voce selecionou Julho");
               break;
               case 8:
                   System.out.println("voce selecionou Agosto");
               break;
               case 9:
                   System.out.println("voce selecionou Setembro");
               break;
               case 10:
                   System.out.println("voce selecionou Outubro");
               break;
               case 11:
                   System.out.println("voce selecionou Novembro");
               break;
               case 12:
                   System.out.println("voce selecionou Dezembro");
               break;
               default:
                   System.out.println("Invalido");
               break;
           }
      }
}
