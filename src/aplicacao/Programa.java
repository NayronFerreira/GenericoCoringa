package aplicacao;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(2,3,4,5,6,7,8);
		List<String> lista2 = Arrays.asList("Ingrid Santanna", "Ingrid Santanna","Ingrid Santanna","Ingrid Santanna","Ingrid Santanna");
		imprimirLista(lista2);
		imprimirLista(lista);
	}

	public static void imprimirLista(List<?> lista) {
		for (Object x : lista) {
			System.out.println(x);
		}

	}
}
