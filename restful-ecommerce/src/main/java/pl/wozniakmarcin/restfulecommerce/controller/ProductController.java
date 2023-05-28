package pl.wozniakmarcin.restfulecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wozniakmarcin.restfulecommerce.controller.model.ProductID;
import pl.wozniakmarcin.restfulecommerce.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/product")
    public ResponseEntity<ProductID> createProduct(@RequestBody final Product product){
        System.out.print(product);
        ProductID result  = new ProductID(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(result);
    }

    @GetMapping("/product")
    public List<Product> getAllProduct() {
        List<Product> result = new ArrayList<>();
        result.add(new Product("1",
                "Smartphone",
                new BigDecimal("153.24")));
        result.add(new Product("2",
                "TV",
                new BigDecimal("1513.24")));
        result.add(new Product("3",
                "Tablet",
                new BigDecimal("79.24")));
    return result;
    }

    @GetMapping("/product/{id")
    public Product getProductById(@PathVariable final String id) {
        System.out.print(id);
        return new Product("300",
                "Tablet",
                new BigDecimal("79.24"));
    }

    @PatchMapping("/product")
    public void patchProduct(@RequestBody Product product) {
        System.out.println(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable final String id)
    {
        System.out.println(id);
    }
}
