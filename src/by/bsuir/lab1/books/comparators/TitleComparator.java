package by.bsuir.lab1.books.comparators;

import java.util.Comparator;
import by.bsuir.lab1.books.*;

public class TitleComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book o1, Book o2) {
		String title1 = o1.getTitle();
		String title2 = o2.getTitle();
		return title1.compareTo(title2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() == getClass()) return true;
		return false;
	}
}
