package br.com.teteo.teste;

import java.util.List;

import br.com.teteo.dao.Database;
import br.com.teteo.model.Exame;

public class Teste {

	public static void main(String[] args) {
		
		Database database = new Database();
		List<Exame> listaExame = database.getListaExame();
		
		for (Exame ex : listaExame) {
			System.out.println(ex.getNomePaciente());
		}
	}
}
