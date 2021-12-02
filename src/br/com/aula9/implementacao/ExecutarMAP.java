package br.com.aula9.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarMAP {

	public static void main(String[] args) {
		Map<Integer, String> h_map = new HashMap<Integer, String>();

		// Adicionando elementos.

		h_map.put(1, "Azul");
		h_map.put(2, "Verde");
		h_map.put(3, "Preto");
		h_map.put(4, "Branco");

		// Listando a linha de código
		System.out.println(h_map.entrySet());
		System.out.println(h_map.keySet());
		System.out.println(h_map.values());

		h_map.put(4, "Azul");
		System.out.println(h_map.entrySet());

		for (Map.Entry conteudo : h_map.entrySet()) {
			System.out.println("Chave: " + conteudo.getKey() + "Valor: " + conteudo.getValue());

			// Como procurar conteúdo.
			System.out.println("Tem a chave 3? " + h_map.containsKey(3));
			System.out.println("Tem o valor Azul? " + h_map.containsValue("Azul"));

			// Removendo uma chave
			h_map.remove(4);
			System.out.println(h_map.entrySet());

		}

	}

}
