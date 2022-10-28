package by.bsuir.lab1.output;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import by.bsuir.lab1.basket.*;
import by.bsuir.lab1.ball.*;
import by.bsuir.lab1.ball.Ball.Color;
import by.bsuir.lab1.tasks.*;

public class ConsoleOutput {
	
	public static void main(String[] args) {
		System.out.println("Task #1: " + SimpleTasks.getValue(90, 10));
		//
		System.out.println("Task #2: " + SimpleTasks.isDotInsideSpace(3, -1));
		ConsoleTable table = SimpleTasks.getFunctionValue(5, 10, 0.5);
		if(table != null) {
			System.out.println("Task #3: ");
			table.printTable(System.out);
		}
		//
		List<Integer> indexes = SimpleTasks.getSimpleNumbersInArray(new int[]{2,5,7,9,10,11,12});
		System.out.println("Task #4: " + indexes.toString());
		//
		Integer[][] matrix = ArrayTasks.getMatrixFromArray(new int[] {1,2,3,4});
		System.out.println("Task #6: ");
		ArrayTasks.printMatrix(matrix, System.out);
		//
		System.out.println("Task #7: ");
		double[] doubleArray = new double[arrayLenght];
		for(int i = 0; i < arrayLenght; ++i) {
			doubleArray[i] = random.nextInt() % 10;
		}
		System.out.print("Start array: ");
		ArrayTasks.printArray(Arrays.stream(doubleArray).boxed().toArray(), System.out);
		ArrayTasks.sortShell(doubleArray);
		System.out.print("End array: ");
		ArrayTasks.printArray(Arrays.stream(doubleArray).boxed().toArray(), System.out);
		//
		System.out.println("Task #8: ");
		double[] doubleArray2 = new double[arrayLenght];
		for(int i = 0; i < arrayLenght; ++i) {
			doubleArray2[i] = random.nextInt() % 10;
		}
		ArrayTasks.sortShell(doubleArray2);
		System.out.println("Start arrays: ");
		ArrayTasks.printArray(Arrays.stream(doubleArray).boxed().toArray(), System.out);
		ArrayTasks.printArray(Arrays.stream(doubleArray2).boxed().toArray(), System.out);
		Integer[] insertedIndexes = ArrayTasks.arrayMerge(doubleArray, doubleArray2);
		System.out.print("Inserted indexes into first array: ");
		ArrayTasks.printArray(insertedIndexes, System.out);
		//
		System.out.println("Task #9: ");
		Basket basket = new Basket(4);
		System.out.print(basket);
		System.out.println("Total weight: " + basket.getTotalBallsWeight() + 
				" Total red balls: " + basket.getCountOfSemicolorBalls(Color.red));
	}
	
	
	private static final int arrayLenght = 10;
	private static final Random random = new Random();
	
	
}
