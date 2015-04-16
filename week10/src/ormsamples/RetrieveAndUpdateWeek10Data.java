/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateWeek10Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = mysqltest.Week10PersistentManager.instance().getSession().beginTransaction();
		try {
			mysqltest.Employee lmysqltestEmployee = mysqltest.Employee.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			lmysqltestEmployee.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		mysqltest.EmployeeCriteria lmysqltestEmployeeCriteria = new mysqltest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmysqltestEmployeeCriteria.id.eq();
		System.out.println(lmysqltestEmployeeCriteria.uniqueEmployee());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateWeek10Data retrieveAndUpdateWeek10Data = new RetrieveAndUpdateWeek10Data();
			try {
				retrieveAndUpdateWeek10Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateWeek10Data.retrieveByCriteria();
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
