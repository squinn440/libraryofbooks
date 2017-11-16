package mainAssignment;

import java.util.ArrayList;

public class InfoUtilities {

	
	private static String[] title=
		{
			"Harry Potter and the Deathly Hallows", "Pretty little liars", 
			"Game of thrones", "The Hunger Games", "Scooby Doo", "Horrid Henry", 
			"Perks of being a Wallflower","Alice in Wonderland", "Through the looking glass",
			"Diary of a wimpy kid", "Paradise Lost", "The fault in our stars", "Looking for alaska",
			"Paper Towns", "The cat in the hat", "Fantastic Mr.Fox", "Vampire academy",
			"The outsiders","The princess diaries","Charlie and the chocolate factory",
			"The vampire diaries"
		};
	
	private static int[] BookID=
		{
				1001,1002,1003,1004,1005,1006,1007,
				1008,1009,1010,1011,1012,1013,1014,
				1015,1016,1017,1018,1019,1020,1021
		};
	
	private static String[] author=
		{
				"J.K Rowling", "John Green", "Jacqueline Wilson", 
				"Aileen Gates", "Sionainn Rose", "James Potter", "Rose O'neill",
				"Rebecca Goodwin", "Benny O'Donnell", "Jordan Fling", "Emma Lee",
				"Luke Pollock", "Katherine Pierce", "Christopher Fong", "Olivia Quinn",
				"Alice Gervin", "Aidan MacMahon", "Ronan McCurry", "Meabh Holland", 
				"Abigail James", "Charles Dickens"
		};
	
	
	private static String[] genre=
		{
				"Fantasy", "Romance", "Drama", "Fantasy",
				"Science-fiction", "Fiction", "Thriller", "Sport",
				"Comedy", "Action", "Sport", "War", "Tradegy", "Romantic Comedy",
				"Sattire", "Historical", "Poetry", "Horror", "Fantasy", 
				"Thriller", "Comedy"
		};
	
	private static String [] publishDate=
		{
			"12/10/1997", "9/12/1998", "7/9/2003", "10/5/2007", "12/10/1999",
			"20/10/2006", "11/12/1999", "10/5/2012", "18/10/1999", "12/12/2012",
			"10/10/2010", "22/12/2014", "13/11/2016","10/11/2012", "19/10/1999", 
			"19/12/2015", "1/1/2014", "25/9/2016", "30/11/2013", "28/10/2011",
			"19/8/2010"
		};
	
	private static int[] numOfPages=
		{
				200,233,100,673,401,689,222,444,222,555,294,299,
				112,208,983,783,892,239,239,230,238,
		};
	
	
	private static String[] format=
		{
		"Paperback", "Hardcover","Hardcover","Hardcover", "Paperback","Hardcover",
		"Hardcover","Paperback", "Paperback", "Hardcover","Hardcover","Paperback",
		"Paperback","Paperback", "Hardcover","Paperback", "Paperback", "Hardcover",
		"Hardcover","Paperback", "Hardcover"
		};
	
	
	public static ArrayList<Book>generateBooks()
	{
		ArrayList<Book>myBooks=new ArrayList<Book>();
		
		for(int i=0; i<title.length; i++)
		{
			myBooks.add(new Book(BookID[i],title[i], author[i], genre[i], publishDate[i], numOfPages[i], format[i], false ));
		}
		return myBooks;
	}
}
