

	class ShoppingCartEntry {
		public float price;
		public int quantity;
	}

	class ShoppingCart {
		public ShoppingCartEntry items;
	}

	class Order {
		private ShoppingCart cart;
		private float salesTax;

		public Order(ShoppingCart cart, float salesTax) {
			this.cart = cart;
			this.salesTax = salesTax;
		}
		
		
		public float orderTotalPrice(){
			float cartTotalPrice=0;
			for(int i=0;i<cart.items.length;i++){
				cartTotalPrice+=cart.items[i].price*cart.items[i].quantity;
			}
			cartTotalPrice+=cartTotalPrice*salesTax;
			return cartTotalPrice;
		}
	}
	public class CouplingExamplesProblem {
}
