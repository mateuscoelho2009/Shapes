
public class Circle extends Shape {
	// Attributes
	private float radius;
	
	// Constructor
	Circle (String name, float radius) {
		super(name);
		
		this.radius = radius;
	}
	
	// Methods
	@Override
	public double calculateArea() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Name: " + super.getName() + "\n" + "Circle whose radius is: " + radius;
	}
}
