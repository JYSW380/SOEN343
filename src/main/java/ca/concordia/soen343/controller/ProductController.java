package ca.concordia.soen343.controller;

import ca.concordia.soen343.model.Product;
import ca.concordia.soen343.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController implements IProductController {

    @Autowired
    private IProductRepository productRepository;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }

    @RequestMapping(path = "/{productId}/{qty}", method = RequestMethod.GET)
    public void addProducts(
            @PathVariable int productId, @PathVariable int qty){
        productRepository.addProducts(productId, qty);
    }


}
