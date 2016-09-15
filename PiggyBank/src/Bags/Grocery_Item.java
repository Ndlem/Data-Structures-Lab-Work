package Bags;

class Grocery_Item {

	int weight;
	String size;
	boolean sturdy;
	boolean fragile;

	public Grocery_Item(int w, String sz, boolean st, boolean fr){
		int weight = w;
		String size = sz;
		boolean sturdy = st;
		boolean fragile = fr;
	}

	
	//Weight constructors
	private void setWeight(int w){
		weight = w;
	}
	private int getWeight(){
		return weight;
	}
	
	
	//Size constructors
	private void setSize(String s){
		size = s;
	}
	private String getSize(){
		return size;
	}
	
	
	//Sturdy constructor
	private void setSturdy(boolean s){
		sturdy = s;
	}
	private boolean getSturdy(){
		return sturdy;
	}
	
	
	//Fragile constructor
	private void setFragile(boolean f){
		fragile = f;
	}
	private boolean getFragile(){
		return fragile;
	}
	
	
	public String toString() {
		return "Item weight: " + weight + "\n  Size: " + size + "\n  Sturdy: " + sturdy + "\n  Fragile: " + fragile; 
	}
}