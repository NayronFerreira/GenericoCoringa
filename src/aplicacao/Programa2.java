package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {
		List<Integer> listaInt = Arrays.asList(1, 2, 3, 4);
		List<Double> listaDou = Arrays.asList(3.2, 4.0, 6.6);
		List<Object> listaObj = new ArrayList<Object>();

		copia(listaInt, listaObj);
		copia(listaDou, listaObj);

		imprimaLista(listaObj);

	}

	public static void copia(List<? extends Number> origem, List<? super Number> listaDestino) {
		for (Number x : origem) {
			listaDestino.add(x);
		}

	}

	public static void imprimaLista(List<? super Number> lista) {
		for (Object x : lista) {
			System.out.println(x);
		}
	}

}
