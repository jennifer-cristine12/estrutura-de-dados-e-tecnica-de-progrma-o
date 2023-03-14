/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

public class triangulo {
    float base,altura;

    public triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    float calculaArea(){
        float area = base*altura;
        return area;
    }
    void imprimeDados(){
          JOptionPane.showMessageDialog(null, "base: "+base+
                  "\nAltura: "+altura+
                  "\nArea: "+calculaArea());
       
    }
    
}
