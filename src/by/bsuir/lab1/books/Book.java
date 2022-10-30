package by.bsuir.lab1.books;

public class Book implements Cloneable, Comparable<Book> {
	
	@Override
	public boolean equals(Object obj) {
		if (null == obj) return false;
		if (this == obj) return true;
		if(getClass() != obj.getClass()) return false;
		Book objBook = (Book)obj;
		if (title != objBook.title || author != objBook.author ||
				price != objBook.price) {
			return false;
		}
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Book: " + title + ", " + author + ", " + price + " BYN"; 
	}
	
	
	@Override
	public int hashCode() {
		String hashString = title + author + price;
		int hash = price % 5;
		for (int i = 0; i < hashString.length(); ++i) {
			hash +=  hashString.charAt(0) << (i % 3);
		}
		return hash;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	@Override
	public int compareTo(Book o) {
		if (isbn == o.isbn) return 0;
		return isbn > o.isbn? 1: -1;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	private String title;
	private String author;
	private int price;
	private int isbn;
	private static int edition;
}
