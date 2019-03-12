package br.com.teteo.service;

import javax.xml.ws.Endpoint;

public class PublicaExameWS {

	public static void main(String[] args) {
		
		ExameWS implementacaoWS = new ExameWS();
		String URL = "http://localhost:8080/examews";
		Endpoint.publish(URL, implementacaoWS);
		System.out.println("Rodando: " + URL + "?wsdl");
	}
}
