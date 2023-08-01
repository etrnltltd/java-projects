package projects.interfaces.productDatabase;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);
    Product[] getProducts();
    Optional<Product> findByTitle(String productTitle);

}
