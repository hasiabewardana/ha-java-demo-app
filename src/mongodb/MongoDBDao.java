package mongodb;

import org.bson.Document;

public interface MongoDBDao {
    void createProduct(Product product);
    void readProducts();
    void readProduct(String name);
    void updateProduct(String name, Product newProduct);
    void deleteProduct(String name);
}
