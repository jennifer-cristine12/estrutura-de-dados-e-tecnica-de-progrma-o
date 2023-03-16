
package estrutura.de.dados;

public class Multirec {

    double Multirec(double v1, double v2){
        if (v2 == 1){
            return v1;
        }
        else{
            return v1+Multirec(v1,v2-1);
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }
    
}
