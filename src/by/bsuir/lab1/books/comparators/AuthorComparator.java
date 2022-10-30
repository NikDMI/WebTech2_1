package by.bsuir.lab1.books.comparators;

import java.util.Comparator;
import by.bsuir.lab1.books.*;

public class AuthorComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book o1, Book o2) {
		String author1 = o1.getAuthor();
		String author2 = o2.getAuthor();
		return author1.compareTo(author2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() == getClass()) return true;
		return false;
	}
}
