package mainAssignment;
import java.util.ArrayList;
import java.util.Scanner;
public class Library_Tester {

	public static void main(String[] args) {

/**
 * create book object and Library object
*/
		ArrayList<Book> myBooks= InfoUtilities.generateBooks();
		Library myLibrary= new Library("The McClay Library", myBooks, "10 College Park", "BT60 0GD", "library@qub.ac.uk", false, 0,0,0);

		Scanner in = new Scanner(System.in);
		
		/**Loop to ensure printMenu keeps printing unless the user exits the system.*/
		while(1<2)
		{
		int userOption=printMenu(in, myLibrary);
		
		/**Method to validate the switch, to ensure the user can only enter an integer
		that corresponds to the printMenu.*/
		
/*		try
		{
			userOption=in.nextInt();
		}
		catch (Exception Error)
		{
			System.out.println("Please enter a suitable value");
		}
		*/
		
		
		switch (userOption)
		{
/**		If the user enters 1, it will call the addBook method from the Library class
*/		case 1: myLibrary.addBook(in, myLibrary);
		break;
		
/**		If the user enters 2, it will call the loanBook method from the Library class*/
		case 2:
			String option = "loan";
			myLibrary.loanBook(myBooks, myLibrary.getUserInputInt(myLibrary.printMessage(option, in), in));
			break;
			
/**		If the user enters 3, it will call the return method from the Library class*/
		case 3:
			String option2 = "return";
			myLibrary.returnBook(myBooks, myLibrary.getUserInputInt(myLibrary.printMessage(option2, in), in));
			break;
			
/**		If the user enters 4, it will call the editBook method from the Library class*/
		case 4:
			myLibrary.editBook();
			break;
			
/**		If the user enters 5, it will call the deleteBook method from the Library class*/
		case 5:
			myLibrary.deleteBook(in, myLibrary);
			System.out.println("\n\n");
			break;
			
/**		If the user enters 6, it will call the printAllBooks method from the Library class*/
		case 6: 
			myLibrary.printAllBooks(myBooks);
			break;
			
/**		If the user enters 7, it will call the FeeCharged method from the Library class*/
		case 7:
			myLibrary.FeeCharged(myBooks);
			break;
			
/**If the user enters 8, it will call the search genre method from the library class
 *  which will display the genre of the user's chosen book*/
		case 8:
			myLibrary.searchGenre(myBooks);
			break;
			
			/**If the user enters 9, it will call the seeFormat method from the library class
			 * and it will display either all the Hardcover or paperback books
			 */
		case 9:
			myLibrary.seeFormat(myBooks);
			break;
		/**
		 * If the user enters 10, it will print the current number of Library Books*/
		case 10:
			myLibrary.printCurrentNo(myBooks);
			break;
		/**
		 * If the user enters 11, it will print the number of books on loan
		 */
		case 11:
			myLibrary.numberOnLoan(myBooks);
			break;
		/**
		 * If the user enters 12, the number of books available to loan will be printed
		 */
		case 12:
			myLibrary.availableBooks(myBooks);
			break;
		/**If the user enters 13, it will exit the system*/
		case 13:
			System.out.println("The system has now been exited");
			System.exit(1);
		}
	}
	}

/**
 * The printMenu method allows the user to see all the options they can avail off
 * @param in
 * @param myLibrary
 * @return
 */
	public static int printMenu(Scanner in, Library myLibrary)
	{
		myLibrary.printDetails();
		System.out.println("1: Add Book");
		System.out.println("2:Loan out a Book");
		System.out.println("3:Return a Book");
		System.out.println("4:Edit a Book");
		System.out.println("5:Delete a Book");
		System.out.println("6:Print a list of all books");
		System.out.println("7:Calculate Fee charged on a book");
		System.out.println("8:Search for a Book's Genre");
		System.out.println("9:See books of a particular format");
		System.out.println("10:See the current number of Library Books");
		System.out.println("11:See the current number of Books on Loan");
		System.out.println("12:See the number of available books to loan");
		System.out.println("13:Exit the System");
		System.out.println("Please enter your option: ");
		int Option=in.nextInt();
		in.nextLine();
		return Option;
	}



}