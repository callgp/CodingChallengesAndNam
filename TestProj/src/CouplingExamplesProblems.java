import java.util.List;

class ShoppingCartEntrys {
	float pricedummy;
	int quantity;

	public float getTotalPrice() {
		return pricedummy * quantity;
	}
}

class CartContents {
	ShoppingCartEntrys[] items;

	public float getTotalPrice() {
		float totalPrice = 0;
		for (ShoppingCartEntrys item : items) {
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
}

/*
 * class ShoppingCartEntry { public float price; public int quantity; public
 * float getTotalPrice(){ return price*quantity; } }
 * 
 * class ShoppingCart { public ShoppingCartEntry items; }
 */

class Orders {
	private CartContents cart;
	private float salesTax;

	public Orders(CartContents cart, float salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}

	public float totalPrice(){
			return cart.getTotalPrice()*(1.0f+salesTax);
		}


	/*
	 * public float orderTotalPrice(){ float cartTotalPrice=0; for(int
	 * i=0;i<cart.items.length;i++){
	 * cartTotalPrice+=cart.items[i].price*cart.items[i].quantity; }
	 */
	//cartTotalPrice+=cartTotalPrice*salesTax;return cartTotalPrice;
}

public class CouplingExamplesProblems {
}
