package br.com.aula9.implementacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ExecutarCatracaMAP {

	public static void main(String[] args) {
		Map<String, String> catraca = new HashMap<String, String>();

		String cracha, tipo;

		System.out.println("Controle de Acesso");
		while (true) {

			tipo = JOptionPane.showInputDialog("Digite <E>ntrada ou <S>aida:");
			cracha = JOptionPane.showInputDialog("Leitor de Cracha:");

			// Utilizar o equalsIgnoreCase permite que o usuário digite Maiusculo ou
			// Minusculo.
			if (tipo.equalsIgnoreCase("E")) {
				if (catraca.containsKey(cracha)) {
					JOptionPane.showMessageDialog(null,
							"Entrada ja registrada: " + catraca.get(cracha) + " - Bloqueado");
				} else {
					DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Date dataSistema = new Date();
					catraca.put(cracha, dataFormat.format(dataSistema));

					JOptionPane.showMessageDialog(null, "Bem vindo...! " + catraca.get(cracha));
				}
			}
			if (tipo.equalsIgnoreCase("S")) {
				if (!catraca.containsKey(cracha)) {
					JOptionPane.showMessageDialog(null, "Crachá não registrado: " + cracha + " - Saída bloqueada");
				} else {
					JOptionPane.showMessageDialog(null, "Obrigado pela visita" + catraca.get(cracha));
					catraca.remove(cracha);
				}

			}

			System.out.println(catraca.entrySet());
		}

	}

}