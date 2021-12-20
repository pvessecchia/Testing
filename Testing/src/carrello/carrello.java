package carrello;

public class carrello {
	private int amount;
	
	public carrello() {
		amount=0;
	}

	public int getAmount() {
		return amount;
	}

	public void insertOneProduct() {
		amount++;
	}
	
	public void removeOneProduct() {
		amount--;
	}
	
	

}
