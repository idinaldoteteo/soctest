package br.com.teteo.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.teteo.dao.Database;
import br.com.teteo.model.Exame;

public class ExameEditarAcao extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String dataExame;
	private String nomePaciente;
	private String historico;
	private String diagnostico;
	private Database database;
	private String msg = null;
	
	public String execute() {
		database = new Database();
		List<Exame> listaExame = database.getListaExame();
		for ( Exame exame : listaExame) {
			if ( exame.getId() == id) {
				id = exame.getId();
				dataExame = exame.getDataExame();
				nomePaciente = exame.getNomePaciente();
				historico = exame.getHistorico();
				diagnostico = exame.getDiagnostico();
			}
		}
		return "success";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDataExame() {
		return dataExame;
	}

	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	
}
