public class Products {
    private int id;
    private String productName;
    private int price;

    public Products(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" + "id = " + getId() + " " +
                "Name = " + getProductName() + " " +
                "Price = " + getPrice() +
                "}";
    }

}
