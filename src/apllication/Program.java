package apllication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.db.DB;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	
		System.out.println("==== TEST 1: department FindById ====");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = new ArrayList<Department>();
		list = departmentDao.findAll();
		for(Department depFindAll : list) {
			System.out.println(depFindAll);
		}
		
		DB.closeConnection();
	}

}