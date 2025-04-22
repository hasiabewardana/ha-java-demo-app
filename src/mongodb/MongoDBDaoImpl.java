package mongodb;

/*import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

public class MongoDBDaoImpl implements MongoDBDao {

    @Override
    public void createProduct(Product product) {
        Document productDocument = new Document("name", product.getName())
                .append("price", product.getPrice())
                .append("description", product.getDescription())
                .append("details", product.getDetails());

        MongoClient mongoClient = MongoDBConfig.getMongoDBClient();
        MongoCollection<Document> documentMongoCollection = mongoClient.getDatabase("shop").getCollection("products");
        documentMongoCollection.insertOne(productDocument);
        mongoClient.close();
    }

    @Override
    public void readProducts() {
        MongoClient mongoClient = MongoDBConfig.getMongoDBClient();
        MongoCollection<Document> documentMongoCollection = mongoClient.getDatabase("shop").getCollection("products");
        // Retrieve all documents
        MongoCursor<Document> mongoCursor = documentMongoCollection.find().iterator();

        try {
            // Print each document
            while (mongoCursor.hasNext()) {
                System.out.println(mongoCursor.next().toJson());
            }
        } finally {
            // Close the cursor and the client
            mongoCursor.close();
            mongoClient.close();
        }
    }

    @Override
    public void readProduct(String name) {
        MongoClient mongoClient = MongoDBConfig.getMongoDBClient();
        MongoCollection<Document> documentMongoCollection = mongoClient.getDatabase("shop").getCollection("products");

        // Retrieve all documents
        Document document = documentMongoCollection.find(new Document("name", name)).first();
        System.out.println(document.toJson());
        mongoClient.close();
    }

    @Override
    public void updateProduct(String name, Product newProduct) {
        MongoClient mongoClient = MongoDBConfig.getMongoDBClient();
        MongoCollection<Document> documentMongoCollection = mongoClient.getDatabase("shop").getCollection("products");
        mongoClient.getDatabase("shop").getCollection("products").updateOne(new Document("name", name), new Document("$set", new Document("price", newProduct.getPrice())));
        mongoClient.close();
    }

    @Override
    public void deleteProduct(String name) {
        MongoClient mongoClient = MongoDBConfig.getMongoDBClient();
        MongoCollection<Document> documentMongoCollection = mongoClient.getDatabase("shop").getCollection("products");
        documentMongoCollection.deleteOne(new Document("name", name));
        mongoClient.close();
    }
}*/
