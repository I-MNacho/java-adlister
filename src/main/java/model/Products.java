package model;

import java.util.List;

public interface Products {

    //return a list of all products
    List<Product> findAll();


    //return a specific product given an id
    Product findById(long id);

    //delete a product
    void deleteById(long id);

    //add a product
    long insert(Product product);

    //edit
    void editProduct(Product product);


}
