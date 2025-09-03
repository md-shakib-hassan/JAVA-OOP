
class LibraryMember{
    String memberName;
    String membershipType;
    int booksBorrowed;

    void borrowBook() { 
        booksBorrowed++;
     }
    void returnBook() { 
        if (booksBorrowed > 0) {
            booksBorrowed--;
        }
         }
    void showStatus() {
        System.out.println(memberName + " (" + membershipType + ") - Books: " + booksBorrowed);
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryMember m = new LibraryMember();
        m.memberName = "Shakib";
        m.membershipType = "Premium";
        m.booksBorrowed = 0;

        m.borrowBook();
        m.borrowBook();
        m.returnBook();
        m.showStatus();
    }
}

