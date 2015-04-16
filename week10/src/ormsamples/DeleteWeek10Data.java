/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteWeek10Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = mysqltest.Week10PersistentManager.instance().getSession().beginTransaction();
		try {
			mysqltest.Employee lmysqltestEmployee = mysqltest.Employee.loadEmployeeByQuery(null, null);
			lmysqltestEmployee.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteWeek10Data deleteWeek10Data = new DeleteWeek10Data();
			try {
				deleteWeek10Data.deleteTestData();
			}
			finally {
				mysqltest.Week10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
