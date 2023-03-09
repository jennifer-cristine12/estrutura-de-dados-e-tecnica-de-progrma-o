
package javaapplication2;

public class main {
  public static void main (String args[]){
    lista Lista = new lista();
    Lista.adicionar("ana", "1249");
    Lista.adicionar("joão","6748");
    Lista.imprimirLista();
    String tel = Lista.buscaTelefone("ana");
      System.out.println(tel);
       tel = Lista.buscaTelefone("maria");
       System.out.println(tel);
}
     
}
