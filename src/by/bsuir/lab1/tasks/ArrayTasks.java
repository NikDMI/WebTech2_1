package by.bsuir.lab1.tasks;

import java.util.*;
import java.io.PrintStream;

public class ArrayTasks {
	
	/*
	public static int getBetterSequence(int[] sequence) {
		int minValue = Arrays.stream(sequence).min().getAsInt();
		int maxValue = Arrays.stream(sequence).max().getAsInt();
		int maxElementCount = maxValue - minValue + 1;
		
		for(int i = 0; i < sequence.length; ++i) {
			//Key - index Value - number
			List<Integer> currentSequence = new ArrayList<>();
			int currentElement = sequence[i];
			currentSequence.add(currentElement);
			for(int j = i + 1; j< sequence.length; ++j) {
				if(sequence[j] >= currentElement) {
					currentSequence.add(sequence[j]);
				}
			}
		}
		return 0;
	}
	
	
	private static int getSortedElementCount(List<Integer> elements) {
		Integer lowerBound = elements.get(0);
		int lowerIndex = 0;
		return 0;
	}
	*/
	
	
	/**
	 * Task #6: create matrix with cicle shift of array elements
	 * @param elements - first row of matrix
	 * @return
	 */
	public static Integer[][] getMatrixFromArray(int[] elements) {
		int elementsCount = elements.length;
		Integer[][] resultMatrix = new Integer[elementsCount][elementsCount];
		for(int i = 0; i < elementsCount; ++i) {
			int currentIndex = i;
			for(int j = 0; j < elementsCount; ++j) {
				resultMatrix[i][j] = elements[currentIndex];
				currentIndex = (currentIndex + 1) % elementsCount;
			}
		}
		return resultMatrix;
	}
	
	
	/**
	 * Task #7: Shell sort
	 * @param doubleArray
	 */
	public static void sortShell(double[] doubleArray) {
		int h = 123;
		int arrayLength = doubleArray.length;
		while(h >= 1) {
			int lastIndex = arrayLength - h;
			for(int i = 0; i < lastIndex; i += h) {
				int j = i;
				if(j + h < arrayLength) {
					while(j >= 0 && doubleArray[j + h] < doubleArray[j]) {
						double temp = doubleArray[j];
						doubleArray[j] = doubleArray[j + h];
						doubleArray[j + h] = temp;
						j -= h;
					}
				}
			}
			h /= 2;
		}
	}
	
	
	/**
	 * Task #8: merging sorted arrays
	 * @param a - 
	 * @param b
	 * @return indexes of array a, where to insert b's elements
	 */
	public static Integer[] arrayMerge(double[] a, double[] b) {
		Integer[] insertedIndexes = new Integer[b.length];
		int currentInsertedIndex = 0;
		for(int i = 0; i < a.length && currentInsertedIndex < b.length; ++i) {
			while(b[currentInsertedIndex] <= a[i]) {
				insertedIndexes[currentInsertedIndex] = i;
				currentInsertedIndex++;
				if(currentInsertedIndex >= b.length) {
					break;
				}
			}
		}
		while(currentInsertedIndex < b.length) {
			insertedIndexes[currentInsertedIndex] = a.length;
			currentInsertedIndex++;
		}
		return insertedIndexes;
	}
	
	
	public static <T> void printArray(T[] elementArray, PrintStream outputStream){
		for(T element: elementArray) {
			outputStream.print(element.toString() + " ");
		}
		outputStream.println();
	}
	
	
	/**
	 * Write matrix in special print stream
	 * @param matrix
	 * @param outputStream
	 */
	public static void printMatrix(Integer[][] matrix, PrintStream outputStream) {
		for(int i = 0; i < matrix.length; ++i) {
			printArray(matrix[i], outputStream);
		}
	}
	
	
	
	
}
