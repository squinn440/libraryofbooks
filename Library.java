package mainAssignment;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
/**
 * @author Shannon
 *
 */
public class Library {

	/**
	 * Array List for Books
	 */
	private ArrayList<Book>myBooks= new ArrayList <Book>();

	/**	instance variables
	 */	
	private String libraryName;
	private String address;
	private String postcode;
	private String email;
	private boolean onLoan;
	private int numOnLoan=5;
	private int quantity=4;
	private int numTimesLoaned;
	static int i;

	/**
	 * Constructor for the Library Class
	 * @param libraryName
	 * @param myBooks
	 * @param address
	 * @param postcode
	 * @param email
	 * @param onLoan
	 * @param numOnLoan
	 * @param quantity
	 * @param numTimesLoaned
	 */
	public Library(String libraryName, ArrayList<Book> myBooks, String address, String postcode, String email, boolean onLoan, int numOnLoan, int quantity, int numTimesLoaned) 
	{
		this.libraryName=libraryName;
		this.myBooks=myBooks;
		this.address=address;
		this.postcode=postcode;
		this.email=email;
		this.onLoan=onLoan;
		this.numOnLoan=numOnLoan;
		this.quantity=quantity;
		this.numTimesLoaned=numTimesLoaned;

	}

	/**
	 * 	Mutator methods- which enable the user to set values to each instance variable
	 * @param myBooks
	 */
	public void setMyBook(ArrayList<Book>myBooks)
	{
		this.myBooks= myBooks;
	}

	public void setName(String libraryName)
	{
		this.libraryName=libraryName;
	}

	public void setAddress(String address)
	{
		this.address=address;
	}

	public void setPostcode(String postcode)
	{
		this.postcode=postcode;
	}

	public void setEmail(String email)
	{
		this.email=email;
	}

	public void setLoan(boolean onLoan)
	{
		this.onLoan=onLoan;
	}

	public void setNumOnLoan(int numOnLoan)
	{
		this.numOnLoan=numOnLoan;
	}

	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}

	public void setNumTimesLoaned(int numTimesLoaned)
	{
		this.numTimesLoaned=numTimesLoaned;
	}


	/**	Accessor methods- enable the user to gain access to the private instance variables
	 */

	public ArrayList<Book> getMyBooks()
	{
		return myBooks;
	}

	public String getName()
	{
		return libraryName;
	}

	public String getAddress()
	{
		return address;
	}

	public String getPostcode()
	{
		return postcode;
	}

	public String getEmail()
	{
		return email;
	}

	public boolean getLoan()
	{
		return onLoan;
	}

	public int getNumOfLoans()
	{
		return numOnLoan;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public int getNumTimesLoaned()
	{
		return numTimesLoaned;
	}


	/**
	 * add a book method
	 * @param newBook
	 */
	public void addBook(Book newBook)
	{
		this.myBooks.add(newBook);
	}

	/**
	 * The addBook method will enable the user to add a book to the myBooks ArrayList
	 * @param in
	 * @param myLibrary
	 */
	public void addBook(Scanner in, Library myLibrary)
	{
		/**		Method to enter the Book's ID
		 */		
		System.out.println("Enter the Book's ID: ");
		while (!in.hasNextInt()) 
		{       
			/**			If the user has not entered an integer they will be asked to re-enter another integer
			 */
			System.out.print("Error-- Please enter an integer: "); 
			in.nextLine();
		}
		int bookID= in.nextInt();
		in.nextLine();

		/**
		 * Method ensures that the same BookID cannot be entered twice.
		 * i.e More than one book cannot have the same ID
		 */
		/*boolean Temp = false;
		for (int i=0; i<myBooks.size(); i++)
		{
			*//**			if the bookID exists within the array list, the book will be removed
			 *//*			
			if(bookID==myBooks.get(i).getBookID())
			{
				Temp=true;
				myBooks.addBook(in, myLibrary);*/
		
		

		/**		The Method will enable the user to enter the Book's Title
		 */
		System.out.println("Enter the Book's title: ");

		while (in.hasNextInt()) 
		{       
			/**			If the user has not entered a String they will be asked to re-enter a String.
			 */
			System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
			in.nextLine();
		}

		String title=in.nextLine();


		/**		This will prompt the user to enter the Book's author
		 */
		System.out.println("Enter the Book's author: ");
		while (in.hasNextInt()) 
		{       
			/**			If the user has not entered a String they will be asked to re-enter a String.
			 */
			System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
			in.nextLine();
		}
		String author=in.nextLine();


		/**		This method enables the user to enter the Book's genre
		 */	
		System.out.println("Enter the Book's genre: ");
		while (in.hasNextInt()) 
		{       
			/**			If the user has not entered a String they will be asked to re-enter a String.
			 */	
			System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
			in.nextLine();
		}
		String genre=in.nextLine();


		/**		Method to enter the Book's publish Book
		 */	
		System.out.println("Enter the Book's publish date: ");
		while (in.hasNextInt()) 
		{       
			/**			If the user has not entered a String they will be asked to re-enter a String.
			 */		
			System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
			in.nextLine();
		}
		String publishDate=in.nextLine();


		/**		Method to enter the number of pages in the book
		 */		
		System.out.println("Enter the number of pages in the Book: ");
		{       
			while (!in.hasNextInt()) 
			{       
				/**			If the user has not entered an integer they will be asked to re-enter another integer
				 */		
				System.out.print("Error-- Please enter an integer: "); 
				in.nextLine();
			}		
			int numOfPages= in.nextInt();
			in.nextLine();


			/**		This method enables you to enter the format of the book
			 */
			System.out.println("Enter the format of the Book(Hardcover/Paperback):");
			while (in.hasNextInt()) 
			{       
				/**			If the user has not entered a String they will be asked to re-enter a String.
				 */		
				System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
				in.nextLine();
			}
			String format=in.nextLine();


			/**
			 * This addBook method follows the preset layout of the Book constructor when adding a new book	
			 */
			addBook(new Book(bookID, title, author, genre, publishDate, numOfPages, format, false));
			System.out.println("The book " +title +" has been added to the library");
		}
	}

	/**
	 * The deleteBook method allows the user to delete a book of their choice	
	 * @param in
	 * @param myLibrary
	 */
	public void deleteBook(Scanner in, Library myLibrary)
	{

		System.out.println("Enter the BookID of the book would you would like to delete: ");
		while (!in.hasNextInt()) 
		{       
			/**			If the user has not entered an integer they will be asked to re-enter another integer
			 */			
			System.out.print("Error-- Please enter an integer: "); 
			in.nextLine();
		}
		int BookID=in.nextInt();
		in.nextLine();
		System.out.println("The bookID of the book you want to delete is: " +BookID);

		/**		Validation to ensure the BookID exists within the myBook ArrayList
		 */		
		boolean Temp = false;
		for (int i=0; i<myBooks.size(); i++)
		{
			/**			if the bookID exists within the array list, the book will be removed
			 */			
			if(BookID==myBooks.get(i).getBookID())
			{
				Temp=true;
				myBooks.remove(i);
				System.out.println("The book " +myBooks.get(i).getTitle() + " has been deleted");
				break;
			}
			else 
				/**if the bookID doesn't exist within the array List, an error message is displayed
				the method is called again to enabled user to re-enter a valid BookID*/
			{
				Temp= false;
				continue;
			}
		}
		if(Temp==false)
		{
			System.out.println("Error-- A book with this ID doesn't exist.");
			deleteBook(in, myLibrary);
		}
	}


	/**Edit a book method- using a switch method to enable the user to 
	chose which part of the particular book they want to edit*/
	public void editBook()
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the ID of the book you wish to edit: ");
		while (!in.hasNextInt()) 
		{       
			/**			If the user has not entered an integer they will be asked to re-enter another integer
			 */		
			System.out.print("Error-- Please enter an integer: "); 
			in.nextLine();
		}
		int bookID= in.nextInt();
		in.nextLine();


		for(Book b: myBooks)
		{

			if (bookID==b.getBookID())
			{

				System.out.println("The book you want to edit is: " + b.getTitle());

				int userOption=printMenu(in);
				switch (userOption)
				{
				case 1: 
					System.out.println("\nEnter the new title of the Book: ");
					while (in.hasNextInt()) 
					{       
						/**			If the user has not entered a String they will be asked to re-enter a String.
						 */		
						System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
						in.nextLine();
					}
					String title=in.nextLine();
					myBooks.get(i).setTitle(title);
					System.out.println("The new title is: " + title);
					break;

				case 2:
					System.out.println("\nEnter the new Author of the Book: ");
					while (in.hasNextInt()) 
					{       
						/**	If the user has not entered a String they will be asked to re-enter a String.*/	
						System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
						in.nextLine();
					}
					String author=in.nextLine();
					myBooks.get(i).setAuthor(author);
					System.out.println("The new Author is: " + author);
					break;

				case 3:
					System.out.println("\nEnter the new Genre of the Book:");
					while (in.hasNextInt()) 
					{       
						/** If the user has not entered a String they will be asked to re-enter a String.	*/	
						System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
						in.nextLine();
					}
					String genre=in.nextLine();
					myBooks.get(i).setGenre(genre);	
					break;
				case 4:			
					System.out.println("\nEnter the new Publish Date of the Book: ");
					while (in.hasNextInt()) 
					{       
						/** If the user has not entered a String they will be asked to re-enter a String.*/	
						System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
						in.nextLine();
					}
					String publishDate=in.nextLine();
					myBooks.get(i).setAuthor(publishDate);	
					break;
				case 5:			
					System.out.println("\nEnter the new number of pages in the Book: ");
					while (!in.hasNextInt()) 
					{       
						/** If the user has not entered an integer they will be asked to re-enter another integer*/
						System.out.print("Error-- Please enter an integer: "); 
						in.nextLine();
					}
					int numOfPages=in.nextInt();
					myBooks.get(i).setNumOfPages(numOfPages);
					break;
				case 6:	
					System.out.println("\nEnter the new format of the Book(Paperback/Hardcover: ");
					while (in.hasNextInt()) 
					{       
						/**	If the user has not entered a String they will be asked to re-enter a String.*/
						System.out.print("Error-- No integers allowed. Try Again. (Enter a String) "); 
						in.nextLine();
					}
					String format=in.nextLine();
					myBooks.get(i).setFormat(format);
					break;
				}
			}
		}

	}


	/**	Print Menu method to display the edit a book options available to the user
	 */	
	public int printMenu(Scanner in)
	{
		System.out.println("1: Edit the Book’s title");
		System.out.println("2: Edit the Book’s Author");
		System.out.println("3: Edit the Book’s Genre");
		System.out.println("4: Edit the Book’s Publish date");
		System.out.println("5: Edit the Book’s number of pages");
		System.out.println("6: Edit the Book’s format");
		System.out.println("7:Exit System");
		System.out.println("Please enter your option: ");
		int Option=in.nextInt();
		in.nextLine();
		return Option;
	}



	/**	Method to print all Books in the library
	 * @param myBooks
	 */
	public void printAllBooks(ArrayList<Book> myBooks)
	{
		/**This for statement will check all the books in the myBooks arrayList
		and print out the following details for each book*/

		for (int i =0; i<myBooks.size(); i++)
		{
			System.out.println("Book Details: ");
			System.out.println("____________________");
			System.out.println("Book ID: " + myBooks.get(i).getBookID());
			System.out.println("Book title: " + myBooks.get(i).getTitle());
			System.out.println("Book Author: " +myBooks.get(i).getAuthor());
			System.out.println("Book Genre: " +myBooks.get(i).getGenre());
			System.out.println("Number of pages in the Book: " +myBooks.get(i).getNumOfPages());
			System.out.println("Publish Date of the book: " +myBooks.get(i).getPublishDate());
			System.out.println("Book's format: " +myBooks.get(i).getFormat());
			System.out.println();
		}
	}


	/**	This enables the user to loan out a book of their choice using the BookID
	 */
	public void loanBook(ArrayList<Book> myBooks, int number)
	{

		/**This checks that for each book element in myBooks arrayList
		the number entered by the user is equal to an existing BookID */
		for(Book b: myBooks)
		{
			if (number==b.getBookID())
			{
				/**				If the book is not on loan, set the Loan to true to indicate it is on loan
				 *   */		
				if (!b.getLoan()){
					numOnLoan++;
					b.setLoan(true);

					System.out.println(b.getTitle()+ " is now on loan");
				}
				else if(b.getLoan()){
					System.out.println("This book is unavailable to loan out.");
				}

			}
		}

	}

	/**
	 * Method to return a book that has been loaned
	 * @param myBooks
	 * @param number
	 */
	public void returnBook(ArrayList<Book> myBooks, int number)
	{

		/**
		 * checks that for every book element in the array list*
		 */

		for(Book b: myBooks)
		{
			/**
			 *if the number entered by the user is an existing id
			 **/

			if (number==b.getBookID())
			{
				if (b.getLoan())
				{
					numOnLoan--;
					System.out.println(b.getTitle() + " has now been returned");
					numTimesLoaned++;
				}
				else
				{
					System.out.println("This book has already been returned");
				}
			}
		}
	}


	/**
	 * Get user input for loan/return methods
	 * @param answer
	 * @param in
	 * @return
	 */
	public int getUserInputInt(String answer, Scanner in)
	{
		int bookID=0;

		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Please enter the book ID for the book");
			while (!in.hasNextInt()) 
			{       
				/**			If the user has not entered an integer they will be asked to re-enter another integer
				 */			
				System.out.print("Error-- Please enter an integer: "); 
				in.nextLine();
			}
			bookID= in.nextInt();
			in.nextLine();

		}
		else
		{
			System.out.println("Ok no problem");
		}
		return bookID;
	}

	/**
	 * Method which provides the message to be entered into the switch in the library tester
	 * @param message
	 * @param in
	 * @return
	 */
	public String printMessage(String message, Scanner in)
	{
		System.out.println(" Do you wish to " + message +" a book? (yes/no)");
		String answer =  in.nextLine();
		return answer;
	}

	/**	Method to check if there is a fee to be paid on a book
	 * based on how long the user has had it on loan
	 * @param myBooks
	 */
	public void FeeCharged(ArrayList<Book> myBooks)
	{
		System.out.println("Please enter the length of time was on loan: ");
		Scanner in=new Scanner(System.in);
		while (!in.hasNextInt()) 
		{       
			/**			If the user has not entered an integer they will be asked to re-enter another integer
			 */			
			System.out.print("Error-- Please enter an integer: "); 
			in.nextLine();
		}
		int loanLength=in.nextInt();
		in.nextLine();

		/**
		 * if the loan length is greater than 40 (days) then it will print the following statement
	    	and if its less than 40 then it will enter the following else statement.
		 */

		if (loanLength>40)
		{
			System.out.println("There is a fee on this book of £10");
		}

		else
		{

			/**if the loan length is greater than 20 (days) then it will print the following statement
		   	and if its less than 20 then it will enter the following else statement.*/
			if (loanLength>20)
			{
				System.out.println("There is a fee of £5 on this book");
			}
			else
			{

				/**if the loan length is less than or equal to 15 (days) then it will print the following statement*/
				if (loanLength<=20)
				{
					System.out.println("No fee to be charged");

				}
			}
		}
	}

	/** This method will enable the user to enter the title of a book to 
	 * view what genre it has
	 * @param myBooks
	 * */
	public void searchGenre(ArrayList <Book> myBooks)
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter the ID of the book to view it's genre");
		while (!in.hasNextInt()) 
		{       
			/**			If the user has not entered an integer they will be asked to re-enter another integer
			 */			
			System.out.print("Error-- Please enter an integer: "); 
			in.nextLine();
		}
		int bookid= in.nextInt();
		boolean temp= false;
		for(int i=0; i<myBooks.size(); i++)
		{
			/**If the ID is an existing BookID then it will print the genre of the books
			 * @param myBooks
			 * */
			if(myBooks.get(i).getBookID()== bookid)
			{
				temp= true;
				System.out.println("The genre of " + myBooks.get(i).getTitle()+ " is " +myBooks.get(i).getGenre());
			}
		}

	}


	/**This method will display the chosen format of books to the user
	 * @param myBooks
	 */

	public void seeFormat(ArrayList <Book> myBooks)
	{
		Scanner in=new Scanner(System.in);
		String format="";
		/**	    	while the format variable is a string, the statement will print out.*/	    	

		while(true){
			System.out.println("Enter a format(either Hardcover/Paperback) to display all books of that type");

			/**	    	here we try to convert the format to a integer, and if you can't*/	    	
			try{
				format=in.next();
				int xx = Integer.parseInt(format);
				System.out.println("Do not enter numbers");

			}
			catch(Exception e)
			{
				break;
			}
		}
		for(int i=0; i<myBooks.size(); i++)
		{
			/**		   	if the format variable is hardcover, then it will enter the next if statement,and
			 * 			if not then it will enter the else statement
			 */		    		
			if (format.equalsIgnoreCase("hardcover"))
			{
				/**		    			this if statement gets the format and prints the title of books with that format
				 */		    			if(myBooks.get(i).getFormat().equalsIgnoreCase("hardcover"))
					 System.out.println(myBooks.get(i).getTitle());
			}
			/**
			 * 		if the format variable is paperback, then it will enter following if statement

			 */
			else if(format.equalsIgnoreCase("Paperback"))
			{
				/**		    		this if statement will get the title of the books in the myBooks Arraylist that have the paperback format
				 */		    			if(myBooks.get(i).getFormat().equalsIgnoreCase("paperback"))
					 System.out.println(myBooks.get(i).getTitle());
			}

		}
	}

	/**	   this method will print the current number of books in the Library
	 * by going through each element in the array list and adding the number of Books
	 * @param myBooks
	 */	    
	
	public void printCurrentNo(ArrayList <Book> myBooks)
	{
		int sum=0;
		for(int i=0; i<=myBooks.size(); i++)
		{
			sum=+i;
		}
		System.out.println("Current Number of Books: "+sum );
	}


	/**This will print the current number of books onLoan
	 *
	 * @param myBooks
	 */
	public void numberOnLoan(ArrayList <Book> myBooks)
	{
		System.out.println(numOnLoan);
	}

	/**
	 * This will print the number of books currently not on loan, available to the user
	 * @param myBooks
	 */
	public void availableBooks(ArrayList<Book>myBooks)
	{
		int sum=0;
		for(int i=0; i<=myBooks.size(); i++)
		{
			sum=+i;
		}
		int available=0;
		available=sum-numOnLoan;
		System.out.println("Available books to loan: " +available );
	}

	/**	print the Library's details method
	 */	
	public void printDetails()
	{
		System.out.println("_____________________________");
		System.out.println("Library name: " +libraryName);
		System.out.println("Address: " + address);
		System.out.println("Postcode: " +postcode);
		System.out.println("E-Mail: " +email);
		System.out.println("_____________________________");


	}

}
