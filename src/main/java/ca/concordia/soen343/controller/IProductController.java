package ca.concordia.soen343.controller;

import ca.concordia.soen343.model.Product;

import java.util.List;

public interface IProductController {

    public List<Product> getAllProducts();

    public void addProducts(int productId,int qty);

    public void deleteProducts(int productId, int qty) throws Exception;
}
