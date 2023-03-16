
package estrutura.de.dados;

public class Pilha {
    int tamanho;
    No topo;

   Pilha(){
       tamanho = 0;
       topo = null;
   }
   boolean estaVazia(){
        return tamanho == 0;
    }
   void empilhar(Object info){
       No no = new No(info);
       if (!estaVazia()){
          topo.ponteiro = no; 
       }
       topo = no;
       tamanho++;
       
   }
   Object desempilhar(){
       if (estaVazia()){
          return "pilha vazia";
       }
      Object info = topo;
      topo = topo.ponteiro;
       tamanho--;
        return info;
       
   }
  Object topo(){
       if (estaVazia()){
          return "pilha vazia";
   }
       else{
          return topo.info; 
       }
        
   }
}
    
    

