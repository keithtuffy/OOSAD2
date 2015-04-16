/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateWeek10Data {
	public void createTestData() throws PersistentException {

	PersistentTransaction t = mysqltest.Week10PersistentManager.instance().getSession().beginTransaction();
		try {
			for(int i = 0; i < 100; i++){
				mysqltest.Employee lmysqltestEmployee = mysqltest.Employee.createEmployee();
				// Initialize the properties of the persistent object here
				lmysqltestEmployee.setName("Rob Furevenlonger");
				lmysqltestEmployee.setAddress("72 Jobstown Tallaght Dublin 24");
				lmysqltestEmployee.setPps("m1589644");
				lmysqltestEmployee.save();
			}
				t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateWeek10Data createWeek10Data = new CreateWeek10Data();
			try {
				createWeek10Data.createTestData();
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
