package br.com.teteo.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.teteo.dao.Database;

public class ExameRemoveAcao extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Database database;
	private Integer id;
	private String msg = null;
	private int check = 0;
	
	public String execute() {
		database = new Database();
		check = database.deleteExame(id);
		return "success";
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
