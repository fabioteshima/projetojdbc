package apllication;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.db.DB;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
		Department dep = new Department(1, "Vendas");
		System.out.println(dep);
		
		Seller sel = new Seller(1, "Bob", "bob@gmail.com", LocalDate.parse("11/11/2011", dtf), 10000.0, dep);
		System.out.println(sel);
	}

}
