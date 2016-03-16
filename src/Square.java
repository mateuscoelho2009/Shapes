
public class Square extends Poligon {	
	// Constructor
	Square (String name, float side) {
		super(name, side);
	}
	
	// Methods
	@Override
	public double calculateArea() {
		double side = super.getSide();
		return side * side;
	}
	
	@Override
	public String toString() {
		return "Name: " + super.getName() + "\n" + "Square whose side is: " + super.getSide();
	}
}
