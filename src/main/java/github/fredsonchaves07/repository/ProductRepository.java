package github.fredsonchaves07.repository;

import github.fredsonchaves07.entities.Product;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductRepository {

    public void create(Product product) {
        product.persist();
    }
}
