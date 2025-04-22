/*package mongodb;

public class MongoDBDaoDemo {
    public static void demoMongoDBAccess(){
        MongoDBDaoImpl mongoDao = new MongoDBDaoImpl();

        Product product = new Product();
        product.setName("A magazine");
        product.setPrice(10);
        product.setDescription("New magazine");

        mongoDao.createProduct(product);
        mongoDao.readProducts();

        product.setPrice(20);
        mongoDao.updateProduct(product.getName(), product);

        mongoDao.deleteProduct("A pen");
    }
}*/
