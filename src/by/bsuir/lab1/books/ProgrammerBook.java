package by.bsuir.lab1.books;

public class ProgrammerBook extends Book {
	
	@Override
	public boolean equals(Object obj) {
		if (null == obj) return false;
		if (this == obj) return true;
		if(getClass() != obj.getClass()) return false;
		ProgrammerBook objBook = (ProgrammerBook)obj;
		if (programmingLanguage != objBook.programmingLanguage || level != objBook.level) {
			return false;
		}
		return super.equals(obj);
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " , Category: for programmers, " + programmingLanguage + ", " +
				"level: " + level; 
	}
	
	
	@Override
	public int hashCode() {
		int hash = super.hashCode() + level;
		for (int i = 0; i < programmingLanguage.length(); ++i) {
			hash +=  programmingLanguage.charAt(0) << (i % 3);
		}
		return hash;
	}

	private String programmingLanguage;
	private int level;
}
