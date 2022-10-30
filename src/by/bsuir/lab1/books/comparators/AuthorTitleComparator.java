package by.bsuir.lab1.books.comparators;

import java.util.Comparator;

import by.bsuir.lab1.books.Book;

public class AuthorTitleComparator implements Comparator<Book>{
	
	@Override
	public int compare(Book o1, Book o2) {
		AuthorComparator authorComparator = new AuthorComparator();
		int compare = authorComparator.compare(o1, o2);
		if (compare != 0) {
			return compare;
		}
		TitleComparator titleComparator = new TitleComparator();
		return titleComparator.compare(o1, o2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() == getClass()) return true;
		return false;
	}
}
