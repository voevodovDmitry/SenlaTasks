package Task6;

public class Item {
	private int weight;
	private int cost;
	
	public Item() {
		super();
	}

	public Item(int weight, int cost) {
		super();
		this.weight = weight;
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String showItem() {
		return "weight: " + this.weight + "; cost:" + this.cost;
	}
	
	public double getUnitCost() {    //метод возвращает удельную стоимость на единицу веса
		return this.cost / (double)this.weight;
	}
	
	

}
