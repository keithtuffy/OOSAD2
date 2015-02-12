package Week3.JobsTypes;

import java.util.*;

public class Teacher extends Professional {

	Collection<Module> teaches;
	private int numStudents;
	private int classYear;

	public int getNumStudents() {
		return this.numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getClassYear() {
		return this.classYear;
	}

	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}

}