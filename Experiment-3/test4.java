class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public char getGender() { return gender; }
    public void setGender(char gender) { this.gender = gender; }

    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQtyInStock() { return qtyInStock; }
    public void setQtyInStock(int qtyInStock) { this.qtyInStock = qtyInStock; }
}

class test4 {
    public static void main(String[] args) {
        Author auth = new Author("Herbert Schildt", "herbert@mcgrawhill.com", 'M');
        Book book = new Book("Java: The Complete Reference", auth, 650.0, 50);

        System.out.println("Book Details:");
        System.out.println("Title: " + book.getName());
        System.out.println("Author: " + book.getAuthor().getName() + " (" + book.getAuthor().getEmail() + ", " + book.getAuthor().getGender() + ")");
        System.out.println("Price: Rs. " + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
    }
}

