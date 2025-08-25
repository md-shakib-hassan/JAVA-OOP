
class LibraryMember {
    String memberName;
    String membershipType;
    int booksBorrowed;

    LibraryMember(String mN, String mType) {
        memberName = mN;
        membershipType = mType;
        booksBorrowed = 0;
    }

    void borrowBook() { 
        booksBorrowed++; 
    }
    void returnBook() {
         if (booksBorrowed > 0)
          booksBorrowed--; 
        }
    void showStatus() {
        System.out.println(memberName + " (" + membershipType + ") - Books: " + booksBorrowed);
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryMember m = new LibraryMember("Shakib", "Premium");
        m.borrowBook();
        m.borrowBook();
        m.returnBook();
        m.showStatus();
    }
}

