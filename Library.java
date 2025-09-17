package laptrinh;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int year;
    static int count = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        count++;
    }

    public String toString() {
        return title + " - " + author + " (" + year + ")";
    }
}

class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("Tong so sach trong thu vien: " + Book.count);
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryManager lib = new LibraryManager();

        Book b1 = new Book("Lap trinh Java", "Phung Khac Truong", 2020);
        Book b2 = new Book("Co so du lieu", "Pham The Phong", 2021);
        Book b3 = new Book("Thuat toan", "Nguyen Duc Anh", 2019);
        

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.showBooks();
    }
}
