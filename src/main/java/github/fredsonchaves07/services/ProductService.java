package github.fredsonchaves07.services;

import github.fredsonchaves07.entities.Product;
import github.fredsonchaves07.repository.ProductRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ProductService {

    @Inject
    ProductRepository repository;

    @Transactional
    public void createProduct(Product product) {
        repository.create(product);
    }
}
