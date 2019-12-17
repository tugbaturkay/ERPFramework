package objectCreation;

public class Apple {
	// Instance variables;
	int size;
	String type;
	String color;
	String taste;

	public void info() {
		if (size != 0) {
			System.out.println("Size: " + size);
		}
		if (type != null) {
			System.out.println("Type: " + type);
		}
		if (color != null) {
			System.out.println("Color: " + color);
		}
		if (taste != null) {
			System.out.println("Taste: " + taste);
		}

	}

}
