package by.bsuir.lab1.ball;


public class Ball {
	public enum Color {
		red, blue, none;
		
		public static Color getColor(int colorNumber) {
			for(Color color: Color.values()) {
				if(color.ordinal() == colorNumber) {
					return color;
				}
			}
			return none;
		}
		
		public static int getMaxValue() {
			return none.ordinal();
		}
	};
	
	public Ball(int weight, Color color) {
		if(weight <= 0) {
			throw new IllegalArgumentException("Weigth of the ball less than 1");
		}
		this.weight = weight;
		this.color = color;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public Color getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "Ball: weight = " + weight + " color = " + color;
	}
	
	private int weight;
	private Color color;
}
