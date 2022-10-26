package by.bsuir.lab1.output;
import by.bsuir.lab1.tasks.*;

public class ConsoleOutput {
	
	public static void main(String[] args) {
		System.out.println("Task #1: " + SimpleTasks.getValue(90, 10));
		System.out.println("Task #2: " + SimpleTasks.isDotInsideSpace(3, -1));
		ConsoleTable table = SimpleTasks.getFunctionValue(5, 10, 0.5);
		if(table != null) {
			System.out.println("Task #3: ");
			table.printTable(System.out);
		}
	}
	
}
