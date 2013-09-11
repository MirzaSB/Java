public class Library {
    // Add the missing implementation to this class
    String sAddress;
    Book[] aBooks = new Book[4];
    static int iBooks = 0;
   
    //Constructor to assign addresses to a particular Library instance
    Library(String sLibraryAddress) {
        sAddress = sLibraryAddress;
    }
   
    //Method to store a book into a library
    void addBook(Book oBookTitle){
        if (oBookTitle != null) {
            for (int i = 0; i <= aBooks.length; i++) {
                if (aBooks[i] == null) {
                    aBooks[i] = oBookTitle;
                    iBooks++;
                    break;
                }
            }
        }
    }
   
    //Method to print out library hours
    static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm");
    }
   
    //Method to print out library address
    void printAddress() {
        System.out.println(sAddress);
    }
   
    //Method to borrow books from the library
    void borrowBook(String sBookTitle) {
        boolean bBorrowed = false;
        boolean bEmpty = true;
       
        for (int i=0; i<aBooks.length; i++) {
          if (aBooks[i] != null) {
            bEmpty = false;
            break;
          }
        }
       
        if (bEmpty == true) {
            System.out.println("Sorry, this book is not in our catalog");
        }
       
        if (sBookTitle != null && bEmpty == false) {
            for (int i = 0; i <= aBooks.length-1; i++) {
                if (aBooks[i].title == sBookTitle) {
                    if (aBooks[i].isBorrowed() == false) {
                        aBooks[i].rented();
                        iBooks--;
                        bBorrowed = true;
                        System.out.println("You sucessfully borrowed " + sBookTitle);
                        break;
                    }
                    else {
                        System.out.println("Sorry, this book is already borrowed");
                        bBorrowed = true;
                        break;
                    }
                }
            }
            if (bBorrowed == false) {
                System.out.println("Sorry, this book is not available in our catalog");
            }
        }
    }
    
    //Method to print out available books present in a library
    void printAvailableBooks() {
    	
    	boolean bEmpty = true;
    	
    	for (int i=0; i<aBooks.length-1; i++) {
            if (aBooks[i] != null) {
              bEmpty = false;
              break;
            }
          }
         
          if (bEmpty == true) {
              System.out.println("No book in the catalog");
          }
          
    	if (bEmpty == false) {
    		for (int i = 0; i <= aBooks.length-1; i++) {
        		if (aBooks[i].isBorrowed() == false) {
        			System.out.println(aBooks[i].title);
        		}
        	}
    	}
    }
    
    //Method to return the book to the library
    void returnBook(String sBookTitle) {
    	if (sBookTitle != null) {
    		for (int i = 0; i <= aBooks.length-1; i++) {
    			if (aBooks[i].title == sBookTitle) {
    				if (aBooks[i].isBorrowed() == true) {
    					aBooks[i].returned();
    					iBooks++;
    					System.out.println("You sucessfully returned " + sBookTitle);
    					break;
    				}
    			}
    		}
    	}
    }
    
    //Main method
    public static void main(String[] args) {
         // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();

    }
}