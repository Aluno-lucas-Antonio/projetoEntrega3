package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexaojdbc.SingleConnection;
import model.Televisao;

public class ClasseDAO {
   private Connection connection;
   
   
   public ClasseDAO() {
	  connection = SingleConnection.getConnetion();
   }
   public void salvar(Televisao televisao) {
   try {
		String sql = "insert into televisaojdbc(marca, id, modelo) values(?,?,?)";
		//String sql = "insert into televisaojdbc(marca, modelo) values(?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		 statement.setLong(1,1);
		 statement.setString(2, "philco");
		 statement.setString(3,"03020203440");
		 
	  /* statement.setLong(1, televisao.getMarca());
		statement.setString(2, televisao.getCodigo());
		statement.setString(3, televisao.getModelo());
		 
		statement.setString(1, televisao.getMarca());	
		statement.setString(2, televisao.getModelo());*/
		
		statement.execute();
		connection.commit();// Executa no banco

	} catch (Exception e) {
		try {
			connection.rollback();// Reverte a operação
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		e.printStackTrace();
	}
   }
   
   	
   	public List<Televisao> listar() throws Exception {
   		
   		List<Televisao> list = new ArrayList<Televisao>();

   		String sql = "select * from televisaojdbc";

   		PreparedStatement statement = connection.prepareStatement(sql);

   		ResultSet resultado = statement.executeQuery();

   		while (resultado.next()) {
   			Televisao televisao = new Televisao();
   			televisao.setId(resultado.getLong("id"));
   			televisao.setMarca(sql);
   			televisao.setModelo(sql);

   			list.add(televisao);

   		}

   		return list;
   	}
   	
 

   	public Televisao buscar(Long id) throws Exception {
   		Televisao televisao = new Televisao();

   		String sql = "select * from televisaojdbc where id =" + id;

   		PreparedStatement statement = connection.prepareStatement(sql);

   		ResultSet resultado = statement.executeQuery();

   		while (resultado.next()) {
   			
			televisao.setId(resultado.getLong("id"));
			televisao.setMarca(resultado.getString("marca"));
			televisao.setModelo(resultado.getString("modelo"));


   		}

   		return televisao;
   	}

   	public void atualizar(Televisao televisao) {

   		try {
   			String sql = "update televisaojdbc set nome = ? where id = " + televisao.getId();
   			PreparedStatement statement = connection.prepareStatement(sql);
   			statement.setString(1, televisao.getMarca());
   			statement.execute();
   			connection.commit();
   		} catch (SQLException e) {
   			try {
   				connection.rollback();
   			} catch (SQLException e1) {
   				e1.printStackTrace();
   			}
   			e.printStackTrace();
   		}
   	}
   	
   	public void deletar(Long id) {
   		try {
   			String sql = "delete from televisaojdbc where id = "+id;
   			PreparedStatement statement = connection.prepareStatement(sql);
   			statement.execute();
   			connection.commit();
   		} catch (Exception e) {
   			try {
   				connection.rollback();
   			} catch (SQLException e1) {
   				e1.printStackTrace();
   			}
   			e.printStackTrace();
   		}	
   	}
   	
   	public void deletarCascata(Long id) {
   		try {
   			
   			String sqltelevisao = "delete from televisaojdbc where id = "+id;
   			
   			PreparedStatement statement = connection.prepareStatement(sqltelevisao);
   			statement.execute();
   			connection.commit();
   			
   			statement = connection.prepareStatement(sqltelevisao);
   			statement.execute();
   			connection.commit();
   		} catch (Exception e) {
   			try {
   				connection.rollback();
   			} catch (SQLException e1) {
   				e1.printStackTrace();
   			}
   			e.printStackTrace();
   		}
   		
   	}

   }

