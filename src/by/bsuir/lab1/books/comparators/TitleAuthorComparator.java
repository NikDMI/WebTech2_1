package by.bsuir.lab1.books.comparators;

import java.util.Comparator;
import by.bsuir.lab1.books.*;

public class TitleAuthorComparator implements Comparator<Book>{
	
	@Override
	public int compare(Book o1, Book o2) {
		TitleComparator titleComparator = new TitleComparator();
		int compare = titleComparator.compare(o1, o2);
		if (compare != 0) {
			return compare;
		}
		AuthorComparator authorComparator = new AuthorComparator();
		return authorComparator.compare(o1, o2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() == getClass()) return true;
		return false;
	}
}
