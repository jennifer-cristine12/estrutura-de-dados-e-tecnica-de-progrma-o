
package javaapplication2;


public class lista {
    No inicio;
    No fim;
    int tamanho;
    
    lista(){
        inicio = null;
        fim = null;
        tamanho=0;
    }
    void adicionar(object info){
        No no = new No(info);
        no.info = info;
        if(tamanho == 0){//se a lista estiver vazia
            inicio = no;
            System.out.println("inicio");
        }
        else{
            fim.proximo = no;
            System.out.println("fim");
        }
        fim = no;
        tamanho++;
    }

    public static void main(String[] args) {
       
    }
    
}
