package br.com.teteo.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.teteo.dao.Database;

public class ExameRegistroAcao extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String dataExame;
	private String nomePaciente;
	private String historico;
	private String diagnostico;
	private Database database;
	private String msg = null;
	private int check = 0;
	
	public String execute() {
		database = new Database();
		check = database.registrarExame(dataExame,nomePaciente,historico,diagnostico);
		if( check == 0) {
			msg = "Falha... Há algo errado com o preenchimento";
			return "failure";
		}
		msg = "Cadastro " +nomePaciente+ " realizado com sucesso";
		return "success";
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
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
