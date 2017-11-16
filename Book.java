package mainAssignment;


public class Book {

	//INSTANCE VARIABLES
	
	private int bookID;
	private String title;
	private String author;
	private String genre;
	private String publishDate;
	private int numOfPages;
	private String format;
	private boolean onLoan;

	
	//CONSTRUCTOR
	
	Book(int bookID, String title, String author, String genre, String publishDate, int numOfPages, String format, boolean onLoan)
	{
		this.bookID=bookID;
		this.title=title;
		this.author=author;
		this.genre=genre;
		this.publishDate=publishDate;
		this.numOfPages=numOfPages;
		this.format=format;
		this.onLoan=onLoan;
	}
	
	
	//MUTATOR METHODS
	
	

	public void setLoan(boolean onLoan) 
	{
		this.onLoan = onLoan;
	}


	public void setBookID(int bookID)
	{
		this.bookID=bookID;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	
	public void setPublishDate(String publishDate)
	{
		this.publishDate=publishDate;
	}
	
	public void setNumOfPages(int numOfPages)
	{
		this.numOfPages=numOfPages;
	}
	
	public void setFormat(String format)
	{
		this.format=format;
	}
	


	//ACCESSORS -GETTERS
	
	public boolean getLoan() {
		return onLoan;
	}

	
	public int getBookID()
	{
		return bookID;
	}
	
	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	
	public String getPublishDate()
	{
		return publishDate;
	}
	
	public int getNumOfPages()
	{
		return numOfPages;
	}
	
	public String getFormat()
	{
		return format;
	}
	

	//Print details method
	
	public void printDetails()
	{
		System.out.println("Book Name and ID: " + title + ", " +bookID);
		System.out.println("Book Author: " + author);
		System.out.println("Book Genre: " + genre);
		System.out.println("Book's publish date: " +publishDate);
		System.out.println("Number of Page's in the Book: " +numOfPages);
		System.out.println("Format of the Book: " +format);
		
		
	
	}
}
