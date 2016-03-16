public abstract class Poligon extends Shape {
	// Atributes
	private double side;
	
	// Constructor
	Poligon (String name, double side) {
		super (name);
		
		this.side = side;
	}
	
	// Methods
	public double getSide() {
		return side;
	}
}
