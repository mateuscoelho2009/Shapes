abstract public class Shape {
	// Attributes
	private String name;
	
	// Constructor
	Shape (String name) {
		this.name = name;
	}
	
	// Methods
	public String getName() {
		return name; 
	}
	
	public double calculateArea() {
		return 0.0f;
	}
	
	public static void main (String argv[]) {
		Circle c = new Circle("Circle c", 4.0f);
		Square s = new Square("Square s", 4.0f);
		EquilaterTriangle et = new EquilaterTriangle("Equilateral Triangle et", 4.0f);
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(et);
	}
}
