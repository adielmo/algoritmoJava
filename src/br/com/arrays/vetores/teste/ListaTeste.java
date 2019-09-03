package br.com.arrays.vetores.teste;

import java.util.ArrayList;
import java.util.List;

public class ListaTeste {
	public static void main(String[] args) {
		String[] a = {"S", "H", " J", "F"};
		ArrayList<String> lis = new ArrayList<>();
		lis.add("g");
		lis.add("f");
		lis.add("a");
		lis.add("p");
		
		ArrayList<String> list = new ArrayList<>(1);
		
		list.add("A");
		list.add("C");
		System.out.println(list);
		list.add(1, "B");
		System.out.println( "New list "+ list);
		list.addAll(lis);
		System.out.println(list);
		list.add(3, "x");
		System.out.println(list);
		//list.clear();		
		//System.out.println("Clear" + list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		/*list.remove(7);
		System.out.println(list);*/
		System.out.println("ssa "+list.containsAll(lis));
		 String ds= list.get(0);
		 System.out.println(list.indexOf("p"));
	
		
	}

}
