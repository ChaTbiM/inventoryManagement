package sample;

public class Product {
    protected String designation;
    protected String reference;
    protected int category;
    protected String type;
    protected float buyingPrice;
    protected float sellingPrice;
    protected int quantity;
    protected boolean inStock; // stock null
    protected int minimumInStock;

    // Constructors
    public Product(String designation, float buyingPrice, int minimumInStock) {
        this.designation = designation;

        this.reference = String.valueOf(this.designation.charAt(0));
        this.reference += this.designation.charAt(1);
        this.reference += this.designation.charAt(2);


        this.buyingPrice = buyingPrice;
        this.minimumInStock = minimumInStock;

            // quantity
        this.inStock = false;
    }

    Product(String designation){
        this.designation = designation ;
    }
    // Getters And Setters

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getMinimumInStock() {
        return minimumInStock;
    }

    public void setMinimumInStock(int minimumInStock) {
        this.minimumInStock = minimumInStock;
    }


}
