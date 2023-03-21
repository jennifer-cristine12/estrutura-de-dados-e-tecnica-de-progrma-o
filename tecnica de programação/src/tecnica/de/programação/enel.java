
package tecnica.de.programação;

import javax.swing.JOptionPane;

public class enel {
  double consumo, fornecimento, icms, cofins, pispasesp,icmscofins, icmpispasesp;
  double fatura  ;
  double aliquota;
    public enel() {
    }

    public enel(double fornecimento, double icms, double cofins, double pispasesp, double icmscofins, double icmpispasesp, double fatura, double aliquota) {
        this.fornecimento = fornecimento;
        this.icms = icms;
        this.cofins = cofins;
        this.pispasesp = pispasesp;
        this.icmscofins = icmscofins;
        this.icmpispasesp = icmpispasesp;
        this.fatura = fatura;
        this.aliquota = aliquota;
    }
    public enel(double consumo) {
        this.consumo = consumo;
    }
    double aliquota(){
        if(consumo<=200)
        aliquota = 12;
        else
        aliquota = 25;
        
        return aliquota;
    }

    
    void calculaTudo(){
        fornecimento = consumo*0.28172;
        
        if(consumo<=200){
         icms = fornecimento * 0.136363;
         cofins = 0.0614722 * fornecimento;
         pispasesp = fornecimento *0.013346;
         icmscofins = cofins * 0.136363;
         icmpispasesp = pispasesp*0.333333;
        }else{
         icms = fornecimento*0.333333;
         cofins = 0.0730751 *fornecimento;
         pispasesp = fornecimento *0.0158651;
         icmscofins = cofins * 0.333333;
    }

    
  /*  public void ImprimeTudo(){
        calculaTudo();
        JOptionPane.showMessageDialog(null,"o fornecimento equivale a: "+((String.format("%.2f", fornecimento)))+"\no icms equivale a: "+((String.format("%.2f", icms))));
    }
        */
    }
}
 
    


