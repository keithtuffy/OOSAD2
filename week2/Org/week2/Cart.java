package Org.week2;

import java.util.*;

public class Cart {

	private CartItem cartItem1;
	private CartItem cartItem2;
	protected Collection<CartItem> cartItems;

	public Cart() {
	cartItems = new Collection<CartItem>;
	system.out.println("Hello");

	cartItem1 = new CartItem();
	cartItem1.setPrice(50);
	cartItem1.setItemId(1);
	cartItem1.setTaxBand(21);
	cartItems.add(cartItem1);

	cartItem2 = new CartItem();
	cartItem2.setPrice(30);
	cartItem2.setItemId(2);
	cartItem2.setTaxBand(52);
	cartItems.add(cartItem2);

	
	for(int i = 0; i < cartItems.size;i++)
	{
		system.out.print("Item " + cartItems[i].getItemId() + "costs " + cartItems[i].getPrice() )
		
	}
	
	}
	
}
