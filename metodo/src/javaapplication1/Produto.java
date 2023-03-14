
package javaapplication1;

import javax.swing.JOptionPane;


public class Produto {
    //atributos
    String marca;
    float valor;
    //contrutores
    public Produto(){
    }
    public Produto(String marca, float valor) {
        this.marca = marca;
        this.valor = valor;
    }
    void imprimeDados(){
           JOptionPane.showMessageDialog(null, "dados do produto: "+
                   "\nMarca: "+marca+
                   "\nValor: "+valor
                   );
    }
    float calculaImposto(float p){
        return valor*p/100;
    }
    }
    

