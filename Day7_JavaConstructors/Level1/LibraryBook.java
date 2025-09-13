class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    // Constructor
    LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Price: " + price + ", Available: " + availability);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Data Structures", "Mark Allen", 450.0, true);

        lb.display();
        lb.borrowBook();
        lb.display();
    }
}

