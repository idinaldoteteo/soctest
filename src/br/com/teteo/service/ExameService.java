package br.com.teteo.service;

import java.util.ArrayList;
import java.util.List;

import br.com.teteo.dao.Database;
import br.com.teteo.model.Exame;

public class ExameService {

	private List<Exame> listaExames;
	
	public List<Exame> getListaExame() {
		Database database = new Database();
		listaExames = database.getListaExame();
		return listaExames;
	}

	
	public List<Exame> getListaExame(String nome) {
		int check = 0;
		if(nome.length() > 0) {
			Database database = new Database();
			listaExames = database.getListaExame();
			for( Exame exame : listaExames) {
				if( exame.getNomePaciente().equals(nome)) {
					listaExames = new ArrayList<Exame>();
					listaExames.add(exame);
					check = 1;
					break;
				}
			}
		}else {
			throw new IllegalArgumentException("Informação errada");
			
		}
		if (check == 0) throw new IllegalArgumentException("Paciente não encontrado no banco de dados");
		return listaExames;
	}

	
}
