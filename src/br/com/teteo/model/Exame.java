package br.com.teteo.model;

public class Exame {

	private Integer id;
	private String dataExame;
	private String nomePaciente;
	private String historico;
	private String diagnostico;
	
	public Exame() {}

	public Exame(String dataExame, String nomePaciente, String historico, String diagnostico) {
		this.dataExame = dataExame;
		this.nomePaciente = nomePaciente;
		this.historico = historico;
		this.diagnostico = diagnostico;
	}
	
	public Exame(Integer id, String dataExame, String nomePaciente, String historico, String diagnostico) {
		this.id = id;
		this.dataExame = dataExame;
		this.nomePaciente = nomePaciente;
		this.historico = historico;
		this.diagnostico = diagnostico;
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
	
	
	
}
