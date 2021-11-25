package controller;

import java.util.LinkedList;
import java.util.List;

public class ListaBuilder {
	LinkedList<Integer> lista1 = new LinkedList<Integer>();
	LinkedList<Integer> lista2 = new LinkedList<Integer>();
	LinkedList<Integer> listas_unidas = new LinkedList<Integer>();

	public void gerarlistas() {
		int elemento = (int) (Math.random() * 101);
		lista1.add(elemento);
		elemento = (int) (Math.random() * 101);
		lista2.add(elemento);
	}

	public void concatenarlistas(int posicao) {
		listas_unidas.add(lista1.get(posicao));
		listas_unidas.add(lista2.get(posicao));
	}

	public LinkedList<Integer> mostrarlista() {
		System.out.println("Lista 1");
		System.out.println(lista1.toString() + "\n");
		System.out.println("Lista 2");
		System.out.println(lista2.toString() + "\n");
		System.out.println("Lista Unida");
		System.out.println(listas_unidas.toString() + "\n");
		return listas_unidas;
	
	}

	public void dividirlistas(List<Integer> list, int splitBy) {
		List<List<Integer>> listas = new LinkedList<List<Integer>>();
		int listSize = list.size();
		if (listSize / splitBy < 1) {
			throw new Error("Não é possível dividir a lista por " + splitBy);
		}
		for (int i = 0; i < listSize; i += splitBy) {
			listas.add(new LinkedList<Integer>(
					list.subList(i, Math.min(listSize, i + splitBy))
			));
		}
		System.out.println("Listas Divididas");
		System.out.println(listas);
	}
}
