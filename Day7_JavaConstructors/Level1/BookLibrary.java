class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);  
        System.out.println("Title: " + title); 
        System.out.println("Author: " + getAuthor());
        }
}

