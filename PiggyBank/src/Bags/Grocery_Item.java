package Bags;

class Grocery_Item {

	int weight;
	String size;
	boolean sturdy;
	boolean fragile;
	
	public Grocery_Item() {
		weight = 0;
		size = "large";
		sturdy = false;
		fragile = false;
	}

	public Grocery_Item(int w, String sz, boolean st, boolean fr){
		weight = w;
		size = sz;
		sturdy = st;
		fragile = fr;
	}

	
	//Weight constructors
	private void setWeight(int w){
		weight = w;
	}
	public int getWeight(){
		return weight;
	}
	
	
	//Size constructors
	private void setSize(String s){
		size = s;
	}
	public String getSize(){
		return size;
	}
	
	
	//Sturdy constructor
	private void setSturdy(boolean s){
		sturdy = s;
	}
	public boolean getSturdy(){
		return sturdy;
	}
	
	
	//Fragile constructor
	private void setFragile(boolean f){
		fragile = f;
	}
	public boolean getFragile(){
		return fragile;
	}
	
	
	public String toString() {
		return "Item weight: " + weight + "\n  Size: " + size + "\n  Sturdy: " + sturdy + "\n  Fragile: " + fragile; 
	}
}