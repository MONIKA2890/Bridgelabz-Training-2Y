
import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId; this.title = title; this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println(itemId + " - " + title + " by " + author);
    }

    public abstract int getLoanDuration(); // days
}

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(String id, String t, String a) { super(id,t,a); }
    @Override public int getLoanDuration() { return 21; }
    @Override public boolean reserveItem(String userId) { if (available) { available=false; return true; } return false; }
    @Override public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String t) { super(id,t,"Editorial"); }
    @Override public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String id, String t, String director) { super(id,t,director); }
    @Override public int getLoanDuration() { return 5; }
}

public class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> items = Arrays.asList(
            new Book("B001","Java Fundamentals","Ramesh"),
            new Magazine("M101","Tech Monthly"),
            new DVD("D500","Inception","Nolan")
        );
        for (LibraryItem it : items) {
            it.getItemDetails();
            System.out.println("Loan days: " + it.getLoanDuration());
            if (it instanceof Reservable) {
                System.out.println("Available: " + ((Reservable)it).checkAvailability());
            }
            System.out.println();
        }
    }
}

