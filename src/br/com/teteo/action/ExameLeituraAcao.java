package br.com.teteo.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.teteo.dao.Database;
import br.com.teteo.model.Exame;

public class ExameLeituraAcao extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Database database;
	private List<Exame> listaExame;
	private String msg = null;
	
	public String execute()  {
		database = new Database();
		listaExame = new ArrayList<Exame>();
		listaExame = database.getListaExame();
		if( listaExame.size() == 0) {
			msg = "Não há dados para mostrar";
			return "failure";
		}
		return "success";
	}

	public List<Exame> getListaExame() {
		return listaExame;
	}

	public void setListaExame(List<Exame> listaExame) {
		this.listaExame = listaExame;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
