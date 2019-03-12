package br.com.teteo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.teteo.model.Exame;

public class Database {

	// create the connection
	public static Connection getConnection() throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/exame", "root", "teteo");
	}
		
	// method for create
	public int registrarExame(String dataExame, String nomePaciente, String historico, String diagnostico) {
		int check = 0;
		if (dataExame.isEmpty() || nomePaciente.isEmpty() || historico.isEmpty() || diagnostico.isEmpty()) {
			return check;
		}
		String sql = "INSERT INTO EXAME VALUES ( ?, ?, ?, ?, ? )";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1,0);
			ps.setString(2, dataExame);
			ps.setString(3, nomePaciente);
			ps.setString(4, historico);
			ps.setString(5, diagnostico);
			check = ps.executeUpdate();
			return check;
		} catch (Exception e) {
			e.printStackTrace();
			return check;
		}finally {
			try {
				if( getConnection() != null) {
					getConnection().close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// method for list // show list
	public List<Exame> getListaExame(){
		List<Exame> exames = new ArrayList<>();
		String sql = "SELECT * FROM EXAME";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.execute();
			ResultSet rs = ps.getResultSet();
			while(rs.next()) {
				exames.add(new Exame(
					rs.getInt("id"),
					rs.getString("dataExame"),
					rs.getString("nomePaciente"),
					rs.getString("historico"),
					rs.getString("diagnostico")	
															)
									);
			}
			return exames;	
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if( getConnection() != null) {
					getConnection().close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// method for delete 
	public int deleteExame(Integer id) {
		int check = 0;
		String sql = "DELETE FROM EXAME WHERE ID="+id;
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			check = ps.executeUpdate();
			return check;
		} catch (Exception e) {
			e.printStackTrace();
			return check;
		}finally {
			try {
				if( getConnection() != null) {
					getConnection().close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// method for update
	public int updateExame(Integer id, Exame exame) {
		int check = 0;
		String sql = "UPDATE EXAME SET	"
				+ "nomePaciente = '"+ exame.getNomePaciente() +"', "
				+ "dataExame = '"+ exame.getDataExame()+"', "
				+ "historico = '"+ exame.getHistorico()+"', "
				+ "diagnostico = '"+exame.getDiagnostico()+"' "
				+ "WHERE ID="+id;
	    		
		System.out.println(sql);
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			check = ps.executeUpdate();
			return check;
		} catch (Exception e) {
			e.printStackTrace();
			return check;
		}finally {
			try {
				if( getConnection() != null) {
					getConnection().close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
