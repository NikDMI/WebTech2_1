package by.bsuir.lab1.tasks;

import by.bsuir.lab1.output.ConsoleTable;
import by.bsuir.lab1.math.*;

import java.util.*;

public class SimpleTasks {
	/**
	 * Solve of Task #1: count value of predefined function 
	 * @param x - arg of the function
	 * @param y - arg of the function
	 * @return Value of the function according to Task #1
	 */
	public static double getValue(double x, double y){
		double z = Math.sin(x + y);
		double numerator = 1 + z*z;
		double denominator = 2 + Math.abs(x - (2 * x)/(1 + x * x * y * y));
		return numerator/denominator + x;
	}
	
	
	/**
	 * Task #2: is dot inside some space
	 * @param x - coord
	 * @param y - coord
	 * @return
	 */
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
	
	
	/**
	 * Task #3: Count function in [a;b] with step h
	 * @param a
	 * @param b
	 * @param h
	 * @return Table with counted values
	 */
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
	
	
	/**
	 * Task #4: get indexes of simple numbers
	 * @param elementArray list of integral numbers
	 * @return list of indexes
	 */
	public static List<Integer> getSimpleNumbersInArray(int[] elementArray) {
		List<Integer> foundedIndexes = new ArrayList<Integer>();
		for(int i=0 ; i < elementArray.length; ++i) {
			boolean isSimple = true;
			int element = elementArray[i];
			for(int j = 2; j < (int)Math.sqrt(element); ++j) {
				if(element % j == 0) {
					isSimple = false;
					break;
				}
			}
			if(isSimple) {
				foundedIndexes.add(i);
			}
		}
		return foundedIndexes;
	}
	
}
