package br.com.teteo.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

import br.com.teteo.model.Exame;

@WebService
public class ExameWS {

	private ExameService exameService = new ExameService();
	
	@ResponseWrapper(localName="Exames") // de TodosOsExames para Exames
	
	@WebMethod(operationName="ExameTodos") // de todosOsExames para ExameTodos 
	@WebResult(name="exame") // de return para exame
	public List<Exame> getTodosExames() {
		return exameService.getListaExame();
	}
	
	@WebMethod(operationName="ExameUnicoPaciente")
	@WebResult(name="exame")
	public List<Exame> getUnicoExame(@WebParam(name="nomePaciente") String nomePaciente) {
		return exameService.getListaExame(nomePaciente);
	}
	
}
