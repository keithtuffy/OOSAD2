/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListWeek10Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employee...");
		mysqltest.Employee[] mysqltestEmployees = mysqltest.Employee.listEmployeeByQuery(null, null);
		int length = Math.min(mysqltestEmployees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(mysqltestEmployees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employee by Criteria...");
		mysqltest.EmployeeCriteria lmysqltestEmployeeCriteria = new mysqltest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmysqltestEmployeeCriteria.id.eq();
		lmysqltestEmployeeCriteria.setMaxResults(ROW_COUNT);
		mysqltest.Employee[] mysqltestEmployees = lmysqltestEmployeeCriteria.listEmployee();
		int length =mysqltestEmployees== null ? 0 : Math.min(mysqltestEmployees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(mysqltestEmployees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListWeek10Data listWeek10Data = new ListWeek10Data();
			try {
				listWeek10Data.listTestData();
				//listWeek10Data.listByCriteria();
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
