import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product product = new Product(1, "Product1", "Category1", 10.0);
        try (FileOutputStream fileOutputStream = new FileOutputStream("product.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(product);
        }
        try (FileInputStream fileInputStream = new FileInputStream("product.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Product deserializedProduct = (Product) objectInputStream.readObject();
            System.out.println("Deserialized Product: " + deserializedProduct);
        }
    }
}
