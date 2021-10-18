package dao;

import model.Products;

public class DaoFactory {

    //variable
    private static Products productsDao;

    //constructor
    public static Products getProductsDao(){
        //if there's not an instance of a doa, then it creates one
        if(productsDao == null){
            productsDao = new ProductInMemoryDao();
        }
        return productsDao;
    }


}
