import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg){ super(msg); }
}
class InvalidReturnException extends Exception {
    InvalidReturnException(String msg){ super(msg); }
}
class UserLimitExceededException extends Exception {
    UserLimitExceededException(String msg){ super(msg); }
}

class Library {
    Map<String, Boolean> books = new HashMap<>();
    Map<String, List<String>> userRecords = new HashMap<>();

    public Library() {
        books.put("Java", true);
        books.put("Python", true);
    }

    public void borrowBook(String user, String book) throws Exception {
        if (!books.containsKey(book) || !books.get(book)) throw new BookNotAvailableException(book+" is not available!");
        List<String> borrowed = userRecords.getOrDefault(user, new ArrayList<>());
        if(borrowed.size() >= 5) throw new UserLimitExceededException("User cannot borrow more than 5 books");
        borrowed.add(book);
        userRecords.put(user, borrowed);
        books.put(book, false);
        System.out.println(user+" borrowed "+book);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrowBook("Alice", "Java");
            lib.borrowBook("Alice", "Java"); // Already borrowed
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

