package StaticDemo;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.id = 123;
        product.name = "keyboard";
        product.price = 289.90;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        DataBaseHelper.Crud.Connection.createConnection();

    };  
    
}
