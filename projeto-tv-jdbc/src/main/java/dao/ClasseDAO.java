package dao;

import java.sql.Connection;

import conexaojdbc.SingleConnection;

public class ClasseDAO {
   private Connection connection;
   
   
   public ClasseDAO() {
	  connection = SingleConnection.getConnetion();
   }
   
}
