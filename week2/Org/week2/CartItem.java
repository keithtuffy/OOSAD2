package Org.week2;

public class CartItem {

	public CartItem() {
	}

	public int getItemID() {
		return this.itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTaxBand() {
		return this.taxBand;
	}

	public void setTaxBand(int taxBand) {
		this.taxBand = taxBand;
	}

	private int itemID;
	private double price;
	private int taxBand;

}
