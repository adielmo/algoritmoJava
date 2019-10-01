package br.com.algoritmo.pilhas;

import java.util.Stack;

public class PilhaStack {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();
		Stack<Integer> stack = new Stack<>();

		System.out.println(stack.isEmpty());
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);
		/*http://goo.gl/Ad5lAe
*/		System.out.println(stack.peek());
		System.out.println(stack.pop());
        System.out.println(stack);
	}
}