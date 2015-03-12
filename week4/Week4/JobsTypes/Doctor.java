package Week4.JobsTypes;

public class Doctor extends Professional {

	private String areaOfWork;
	private String gender;

	public String getAreaOfWork() {
		return this.areaOfWork;
	}

	public void setAreaOfWork(String areaOfWork) {
		this.areaOfWork = areaOfWork;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}