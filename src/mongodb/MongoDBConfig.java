package mongodb;

/*import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;*/

public class MongoDBConfig {
    private static MongoDBConfig mongoDBConfig = null;

    private MongoDBConfig() {
        // private constructor to prevent instantiation
    }

    public static MongoDBConfig getMongoDBConnection() {
        if (mongoDBConfig == null) {
            mongoDBConfig = new MongoDBConfig();
        }
        return mongoDBConfig;
    }

    /*public static MongoClient getMongoDBClient() {
        // Connect to MongoDB
        MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
        return mongoClient;
    }*/
}
