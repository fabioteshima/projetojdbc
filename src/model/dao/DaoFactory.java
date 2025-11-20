package model.dao;

import model.dao.impl.DepartmentDaoJDBC;
import model.db.DB;

public class DaoFactory {

	public static DepartmentDao createDepartmentDao () {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
