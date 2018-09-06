package main.java.main.java.stream;

public class Product {

    public Product(long productId, String productName, String productRating) {
        this.productId = productId;
        this.productName = productName;
        this.productRating = productRating;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductRating() {
        return productRating;
    }

    public void setProductRating(String productRating) {
        this.productRating = productRating;
    }

    long productId;
    String productName;
    String productRating;

    @Override
    public String toString() {
        return this.productName;
    }
}
