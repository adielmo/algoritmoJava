package br.com.algoritmosjava.vetores.teste;

import br.com.algoritmosjava.vetores.VetorObject;

public class ObjectTeste {

	public static void main(String[] args) {
		
VetorObject object = new VetorObject(3);
Contato contato = new Contato("Contato 01", "87544-114", "contato1@email.com");
Contato contato02 = new Contato("Contato 02", "4465-8944", "contato2@email.com");
Contato contato03 = new Contato("Contato 03", "8551-1445", "contato3@email.com");
Contato contato04 = new Contato("Contato 03", "8551-1445", "contato3@email.com");

object.adiciona(contato);
object.adiciona(contato02);
object.adiciona(contato03);

System.out.println(object);

int pos = object.busca(contato04);
if (pos >= 0) {
	System.out.println("O elemento existe na posição " + pos);
} else {
System.out.println("Elemento não existe");
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 /*  VetorObject vetorObject = new VetorObject(3);
    vetorObject.adiciona(2.5);
     vetorObject.adiciona(9.8);
     vetorObject.adiciona(5.9);
     vetorObject.adiciona(0, 4.5);   
    
     
    vetorObject.tamanhoArray();
    vetorObject.quantidade();
    System.out.println(vetorObject);*/
	}

}
