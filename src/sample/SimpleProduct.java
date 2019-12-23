package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SimpleProduct extends Product {
    SimpleProduct(String designation, float buyingPrice, int minimumInStock, int category) {
        super(designation, buyingPrice, minimumInStock);
//        if(category == 1)	{
//            // read price from user
//            int price = 0;
//            System.out.println("enter Price for product");
//            this.setSellingPrice(price);
//        }
//        else if(category == 2) this.setSellingPrice((float) (buyingPrice * 1.30));

        this.category=category;
        this.type = "simple";
    }

    SimpleProduct(String designation){
        super(designation);
    }


    public void insert() {
        String sql = "INSERT INTO product(designation,reference,category,type,buying_price,quantity,minimum_in_stock," +
                "in_stock) VALUES(?,?,?,?,?,?,?,?)";

        try (Connection conn = SqliteConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, this.getDesignation());
            pstmt.setString(2, this.getReference());
            pstmt.setInt(3,this.getCategory());
            pstmt.setString(4, this.getType());
            pstmt.setFloat(5, this.getBuyingPrice());
            pstmt.setInt(6, 0);
            pstmt.setInt(7,5);
            pstmt.setInt(8,0);

            pstmt.executeUpdate();

            System.out.println("done");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
