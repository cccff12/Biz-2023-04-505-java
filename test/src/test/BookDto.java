package test;

public class BookDto {

	private String ISBN;
	private String bookname;
	private String place;
	private String author;
	private String day;
	private int page;
	private int price;
	
	
	
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDto(String iSBN, String bookname, String place, String author, String day, int page, int price) {
		super();
		ISBN = iSBN;
		this.bookname = bookname;
		this.place = place;
		this.author = author;
		this.day = day;
		this.page = page;
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookDto [ISBN=" + ISBN + ", bookname=" + bookname + ", place=" + place + ", author=" + author + ", day="
				+ day + ", page=" + page + ", price=" + price + "]";
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}