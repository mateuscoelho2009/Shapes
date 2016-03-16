public class EquilaterTriangle extends Poligon {
	// Constructor
	EquilaterTriangle (String name, float side) {
		super(name, side);
	}
		
	// Methods
	@Override
	public double calculateArea() {
		double side = super.getSide();
		return side * side * Math.pow(3, 0.5) / 4;
	}
		
	@Override
	public String toString() {
		return "Name: " + super.getName() + "\n" + "Equilateral Triangle whose side is: " + super.getSide();
	}
}