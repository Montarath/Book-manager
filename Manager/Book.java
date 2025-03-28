public class Book {
    private String booktitle;
    private String author;
    private int booklength;

    public Book(String title, String author, int booklength) {
        this.booktitle = title;
        this.author = author;
        this.booklength = booklength;
    }
    public String getTitle() {
        return booktitle;
    }
    public void setTitle(String title) {
        this.booktitle = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getBooklength() {
        return booklength;
    }
    public void setBooklength(int booklength) {
        this.booklength = booklength;
    }
}
