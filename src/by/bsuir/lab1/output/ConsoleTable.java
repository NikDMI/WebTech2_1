package by.bsuir.lab1.output;

import java.io.*;

public class ConsoleTable {
	/**
	 * 
	 * @param rows Number of table rows
	 * @param columns Number of table columns
	 * @param cellWidth Min cell width in whitespaces
	 */
	public ConsoleTable(int rows, int columns, int cellWidth) {
		if(rows <= 0 || columns <= 0 || cellWidth <= 0) { 
			throw new IllegalArgumentException();
		}
		m_rowCount = rows;
		m_columnCount = columns;
		m_tableContext = new String[rows * columns];
		m_cellWidth = cellWidth;
		m_tableWidth = cellWidth * columns + (columns - 1);
	}
	
	
	public void addCellContent(int rowIndex, int columnIndex, String text) {
		if (rowIndex >= 0 && rowIndex < m_rowCount && columnIndex >= 0 &&
				columnIndex < m_columnCount) {
			m_tableContext[rowIndex * m_columnCount + columnIndex] = text;
		} else {
			throw new IllegalArgumentException("Cell index out of range");
		}
	}
	
	
	public void printTable(PrintStream outputStream) {
		outputStream.println("-".repeat(m_tableWidth));
		for(int i = 0; i < m_rowCount; ++i) {
			outputStream.print('|');
			for(int j = 0; j < m_columnCount; ++j) {
				String cellText = m_tableContext[i * m_columnCount + j];
				if(cellText != null) {
					outputStream.printf("%" + m_cellWidth +"s", cellText);
				}else {
					outputStream.printf("%" + m_cellWidth +"s", "");
				}
				outputStream.print('|');
			}
			outputStream.println();
		}
		outputStream.println("-".repeat(m_tableWidth));
	}
	
	
	private int m_rowCount;
	private int m_columnCount;
	private String[] m_tableContext;
	private int m_tableWidth;
	private int m_cellWidth;
}
