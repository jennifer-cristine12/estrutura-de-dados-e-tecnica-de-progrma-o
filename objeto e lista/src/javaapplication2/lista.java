
package javaapplication2;


public class lista {
    No inicio;
    No fim;
    int tamanho;
    int i=0;
    
    lista(){//tamanho da lista
        inicio = null;
        fim = null;
        tamanho=0;
    }
    void adicionar(String nome, String tel){//cria um elemento novo
        No no = new No(nome,tel);
     //   no.info = info;
        if(tamanho == 0){//se a lista estiver vazia
            inicio = no;
            
        }
        else{//liga o prox a um proximo elemento
            fim.proximo = no;
           
        }
        fim = no;
        tamanho++;//adiciona um item na lista
    }
    boolean estaVazia(){
       return tamanho == 0;
    }
    void imprimirLista(){
        No no = inicio;
        while(i<tamanho){
        System.out.println(no.nome);
        no = no.proximo;
        i++;
        }
       
    }
    String buscaTelefone(String nome){
        No no = inicio;
        i=0;
        while(i<tamanho){
            if(no.nome.equals(nome)){
                return no.tel;
            }
        }
        return "não localizado";
    }
    
    public static void main(String[] args) {
          lista no = new lista();
          no.imprimirLista();
      
        
        
    }

   
}
