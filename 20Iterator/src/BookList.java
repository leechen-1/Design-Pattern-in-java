import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BookList {
	private List<Book> bookList;
	private int index;
	private Iterator iterator;
	
	public BookList() {
		bookList = new ArrayList<Book>();
	}
	
	//添加书籍
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	//删除书籍
	public void deleteBook(Book book) {
		int bookIndex = bookList.indexOf(book);
		bookList.remove(bookIndex);
	}
	
//	//判断是否有下一本书
//	public boolean hasNext() {
//		if(index >= bookList.size()) {
//			return false;
//		}
//		return true;
//	}
//	
//	//获得下一本书
//	public Book getNext() {
//		return bookList.get(index++);
//	}
	
//	public List<Book> getBookList() {
//		return bookList;
//	}
	
	public Iterator Iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator{

		public boolean hasNext() {
			if(index >= bookList.size()) {
				return false;
			}
			return true;
		}

		public Object next() {
			return bookList.get(index++);
		}

		public void remove() {
			
		}
		
	}
	
}
