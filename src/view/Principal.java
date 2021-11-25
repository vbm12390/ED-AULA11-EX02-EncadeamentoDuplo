package view;

import java.util.LinkedList;

import javax.swing.JOptionPane;
import controller.ListaBuilder;

public class Principal {

	public static void main(String[] args) {
		LinkedList<Integer> listas_unidas = new LinkedList<Integer>();
		ListaBuilder builder = new ListaBuilder();
		int qtd_elementos = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade de elementos para ser gerado dentro da lista: "));

		for (int i = 0; i < qtd_elementos; i++) {
			builder.gerarlistas();
			builder.concatenarlistas(i);
		}
		listas_unidas = builder.mostrarlista();
		int qtdelementos = Integer.parseInt(JOptionPane.showInputDialog("Quantos elementos você deseja em cada lista ?"));
		builder.dividirlistas(listas_unidas, qtdelementos);
	}
}
