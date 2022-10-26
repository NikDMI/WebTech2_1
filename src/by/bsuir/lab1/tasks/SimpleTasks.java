package by.bsuir.lab1.tasks;

import by.bsuir.lab1.output.ConsoleTable;

public class SimpleTasks {
	
	public static final double epsilon = 0.000001f;
	
	
	public static double getValue(double x, double y){
		double z = Math.sin(x + y);
		double numerator = 1 + z*z;
		double denominator = 2 + Math.abs(x - (2 * x)/(1 + x * x * y * y));
		return numerator/denominator + x;
	}
	
	
	public static boolean isDotInsideSpace(int x, int y) {
		//Accorging to symetric of figure
		x = Math.abs(x);
		if (x >= 6) {
			return false;
		}
		if (y >= 5 || y<=-3) {
			return false;
		}
		if(x<4) {
			return true;
		}
		if(y<0) {
			return true;
		}
		return false;
	}
	
	
	public static ConsoleTable getFunctionValue(double a, double b, double h) {
		int rowCount = (int)((b - a) / h) + 1;
		if(rowCount <= 0) {
			return null;
		}
		ConsoleTable table = new ConsoleTable(rowCount + 1, 2, 20);
		table.addCellContent(0, 0, "arg");
		table.addCellContent(0, 1, "F(arg)");
		for(int i = 1; i <= rowCount; ++i) {
			table.addCellContent(i, 0, Double.toString(a));
			table.addCellContent(i, 1, Double.toString(Math.tan(a)));
			a += h;
		}
		return table;
	}
	
}
