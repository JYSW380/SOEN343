package ca.concordia.soen343.repository;

import ca.concordia.soen343.model.Product;

import java.util.List;

public interface IProductRepository {

    public List<Product> getAllProducts();

    public void addProducts(int productId, int Qty);

    public void removeProducts(int productId, int Qty) throws Exception;

    public Product updateProduct(int productId, Product product);

    public Product getProductById(int productId);
}
