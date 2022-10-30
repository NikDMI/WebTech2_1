package by.bsuir.lab1.books.comparators;

import java.util.Comparator;

import by.bsuir.lab1.books.Book;

public class AuthorTitlePriceComparator implements Comparator<Book>{
	
	@Override
	public int compare(Book o1, Book o2) {
		AuthorTitleComparator authorTitleComparator = new AuthorTitleComparator();
		int compare = authorTitleComparator.compare(o1, o2);
		if (compare != 0) {
			return compare;
		}
		int price1 = o1.getPrice();
		int price2 = o2.getPrice();
		if (price1 == price2) {
			return 0;
		}
		return price1 > price2 ? 1 : -1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() == getClass()) return true;
		return false;
	}
}
