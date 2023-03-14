
package javaapplication1;

import javax.swing.JOptionPane;

public class TesteProduto {
   public static void main(String[] args) {
       //atributos
       Produto p;
       
       String marca;
       float valor, valorImp, porc;
       marca = JOptionPane.showInputDialog("Digite a marca do produto: ");
       valor  = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
       p = new Produto(marca, valor);
       p.imprimeDados();
       //imprime
       porc = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do imposto: "));
       valorImp = p.calculaImposto(porc);
       JOptionPane.showMessageDialog(null, "Imposto a pagar "+valorImp+
               "\nValor com imposto: "+(valor+valorImp));
   }
}
