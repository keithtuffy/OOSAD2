package Week3.JobsTypes;

public class Pilot extends Professional {

	private int licence;
	private String airline;
	private Rating rating;

	public int getLicence() {
		return this.licence;
	}

	public void setLicence(int licence) {
		this.licence = licence;
	}

	public String getAirline() {
		return this.airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

}