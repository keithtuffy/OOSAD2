package Week3.JobsTypes;

public class Rating extends Qualification {

	private int rating;
	private String attribute = rateType;

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getAttribute() {
		return this.attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

}