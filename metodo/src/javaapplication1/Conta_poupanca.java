
package javaapplication1;

import javax.swing.JOptionPane;

public class Conta_poupanca {
    //atributos
    String agencia;
    String numero;
    float saldo;
    float taxa;
    public Conta_poupanca(){}
    public Conta_poupanca(String agencia, String numero, float saldo, float taxa) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.taxa = taxa;
    }
    //metodos
    void imprimeDados(){
        JOptionPane.showMessageDialog(null, "dados da Conta Corrente: "+
            "\nÂgencia: "+agencia+
            "\nNúmero: "+numero+
            "\nSaldo: "+saldo+
            "\nTaxa: "+taxa 
                );
    }
    void depositar (float valor){
        saldo +=valor;
    }
    float calculaRendimento(){
        float rendimento;
        rendimento = saldo * taxa/100;
        return rendimento;
    }
  
}
