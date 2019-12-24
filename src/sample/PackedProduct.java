package sample;

public class PackedProduct extends Product {
    protected  String description;
    PackedProduct(int id,String designation, float buyingPrice, int minimumInStock , int category  ) {
        super(id,designation, buyingPrice, minimumInStock);

        this.type = "packed-product";
    }
}
