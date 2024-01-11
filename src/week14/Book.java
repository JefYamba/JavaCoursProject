package week14;

public class Book implements Comparable<Book>{
    private final String  name;
    private final Double price;

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    private Double totalPrice(){
        return price + (8.0/100)*price;
    }

    @Override
    public int compareTo(Book b) {
        return Double.compare(this.price, b.price);
    }

    @Override
    public String toString() {
        return name + "   Price : " + price ;
    }
}
