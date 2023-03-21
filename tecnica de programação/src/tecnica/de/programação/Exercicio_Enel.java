
package tecnica.de.programação;

import javax.swing.JOptionPane;

public class Exercicio_Enel {
    public static void main(String[] args) {
    double consumo, fornecimento, icms, cofins, pispasesp,icmscofins, icmpispasesp, fatura  ;
    consumo = Double.parseDouble(JOptionPane.showInputDialog(null,"informe o consumo"));
    fornecimento = consumo*0.28172;
    
    if(consumo<=200){
        icms = fornecimento * 0.136363;
        cofins = 0.0614722 * fornecimento;
    }else{
        icms = fornecimento*0.333333;
        cofins = 0.0730751 *fornecimento;
        
    }
    fatura = fornecimento+icms+cofins+pispasesp+icmcofins+icmpispasesp;
    JOptionPane.showMessageDialog(null,"o fornecimento equivale a: "+((String.format("%.2f", fornecimento)))+"\no icms equivale a: "+((String.format("%.2f", icms))));
}
}