
package tecnica.de.programação;
import javax.swing.JOptionPane;

public class boletim {
    //variaveis
    double media;
    double n1,n2;
    
    //contrutor
    public boletim( double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    //media
    void calculaMedia(){
        media = (n1+n2)/2;
    }
    
    //condições no boletim
    String boletim(){
        String conceito;
        if(media>=8)
            conceito="A";
        else if(media>=6)
           conceito="B";
        else if(media>=4)
            conceito= "C";
        else
            conceito= "D";
        return conceito;
    }
    
    //imprimir
    public void imprimeBoletim(){
        calculaMedia();
        JOptionPane.showMessageDialog(null,"dados do boletim: "+"\nNota1: "+n1+"\nNota2: "+n2+"\nMedia: "+media+"\nConceito: "+boletim());
    }
}
