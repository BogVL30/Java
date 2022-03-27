package Lesson4;

public class Pokupka extends Payment {

    private static Pokupka[] Payment;
    public String Product;
    public int Price;

    public Pokupka(String Product, int Price) {
        this.Product = Product;
        this.Price = Price;

    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = Price;

    }

    public void print(String Product) {
        System.out.println(Product);
    }

    @Override
    public String toString() {
        return "Product: " + Product + "\n" +
                "Price: " + Price;

    }
}

