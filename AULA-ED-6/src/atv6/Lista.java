package atv6;

import java.util.*;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<String> bandas = new ArrayList<String>();
		
		bandas.add("gojira");
		System.out.println("add banda");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		bandas.add("limp byzkit");
		System.out.println("add banda");
		System.out.println(Arrays.toString(bandas.toArray()));

		bandas.add("tool");
		System.out.println("add banda");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		
		bandas.add("lamb of god");
		System.out.println("add banda");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		System.out.println("pegando quem t� no index = 0");
		System.out.println(bandas.get(0));
		
		System.out.println("trocando gojira por metallica");
		bandas.add(bandas.indexOf("gojira"),"metallica");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		System.out.println("quantidade de itens na lista");
		System.out.println("a quantidade de itens �: "+bandas.size());
		
		System.out.println("removendo metallica");
		bandas.remove("metallica");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		System.out.println("limpando a bagun�a");
		bandas.clear();
		System.out.println(Arrays.toString(bandas.toArray()));
		
		
		
		
		
		
		
	}
}
