package ca.concordia.soen343.controller;

import ca.concordia.soen343.model.Cart;
import ca.concordia.soen343.repository.ICartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")
public class CartController implements ICartController {

    @Autowired
    private ICartRepository cartRepository;

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET)
    public Cart createCart(@PathVariable int userId) {
        return cartRepository.createCart(userId);
    }
}
