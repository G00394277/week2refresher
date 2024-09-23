package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final List<Product> products = new ArrayList<>();

    // GET request to retrieve all products
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    // POST request to add a new product
    @PostMapping
    public void addProduct(@RequestBody Product product) {
        products.add(product);
    }
}
