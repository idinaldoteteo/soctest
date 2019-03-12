package br.com.teteo.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.teteo.dao.Database;
import br.com.teteo.model.Exame;

public class ExameUpdateAcao  extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Database database;
	private Exame exame;
	private Integer id;
	private String dataExame;
	private String nomePaciente;
	private String historico;
	private String diagnostico;
	private String msg = null;
	private int check = 0;
	
	
	public String execute() {
		database = new Database();
		exame = new Exame();
		exame.setDataExame(dataExame);
		exame.setNomePaciente(nomePaciente);
		exame.setHistorico(historico);
		exame.setDiagnostico(diagnostico);
		check = database.updateExame(id, exame);
		if( check == 0) {
			msg = "Falha... Há algo errado com o preenchimento";
			return "failure";
		}
		msg = "Atualização " +nomePaciente+ " realizada com sucesso";
		return "success";
	}


	public Exame getExame() {
		return exame;
	}


	public void setExame(Exame exame) {
		this.exame = exame;
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


	public int getCheck() {
		return check;
	}


	public void setCheck(int check) {
		this.check = check;
	}

	
}
