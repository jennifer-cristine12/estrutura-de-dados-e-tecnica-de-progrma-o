
package javaapplication1;

import javax.swing.JOptionPane;

public class TesteTriangulo {
    public static void main(String[] args) {
        triangulo t;
        float base, altura;
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triangulo: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do produto: "));
        t= new triangulo(base,altura);
        t.imprimeDados();

}
     }
