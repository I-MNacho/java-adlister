package dao;

import model.Product;
import model.Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductInMemoryDao implements Products {

    private List<Product> products;

    public ProductInMemoryDao(){
        this.products = new ArrayList<>(Arrays.asList(
                new Product(1, "hammer", 999),
                new Product(2, "screwdriver", 999),
                new Product(3, "drill", 1999)
        ));
    }

    public List<Product> findAll(){

        //SELECT * FROM products; just showing all products
        return products;
    }


    @Override
    public Product findById(long id) {
        return products.get((int) id);
    }

    @Override
    public void deleteById(long id) {
        products.remove((int) id);
    }

    @Override
    public long insert(Product product) {
        return 0;
    }

    @Override
    public void editProduct(Product product) {

    }
}
