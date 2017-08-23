package object;

public class Sales {
	private String item;
	private int qty;
	private int cost;
	
	public Sales(String item, int qty, int cost) {
		setItem(item);
		setQty(qty);
		setCost(cost);
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPrice() {
		return getCost() * getQty();
	}
	
	@Override
	public String toString() {
		return "품목 : "+getItem()+"\n수량 : "+getQty()+"\n단가 : "+getCost()+"\n금액 : "+getPrice()+"원";
	}
}
