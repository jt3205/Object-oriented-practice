package test9;

public class Tv {
	private String name;
	private int price;
	private String description;
	
	public Tv() {
		setName("");
		setPrice(0);
		setDescription("");
	}
	
	public Tv(String name, int price, String description) {
		setName(name);
		setPrice(price);
		setDescription(description);
	}
	
	@Override
	public String toString() {
		return getName()+"\t"+getPrice()+"\t"+getDescription();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
