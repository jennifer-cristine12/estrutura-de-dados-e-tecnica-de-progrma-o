
package tecnica.de.programação;

import javax.swing.JOptionPane;


public class TecnicaDeProgramação {
    
    public static void main(String[] args) {
        
       boletim Boletim = new boletim(Double.parseDouble(JOptionPane.showInputDialog("digite a primeira nota")),Double.parseDouble(JOptionPane.showInputDialog("digite a segunda nota")));
       Boletim.imprimeBoletim();
       
    }
    
}
