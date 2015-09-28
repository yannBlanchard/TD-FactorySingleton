import Product.Product;
import Product.ProductFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class Main {

    static{
        try{
            Class.forName("Product.ProductA");
            Class.forName("Product.ProductB");
            Class.forName("Product.ProductC");
            /*Properties p = new Properties();
            InputStream in = Files.newInputStream(Paths.get("classes.properties"));
            p.load(in);

            Set<Map.Entry<Object, Object>> val = p.entrySet();
            for(Map.Entry<Object,Object>entry : val){
                Class.forName((String)entry.getValue());
            }*/
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } /*catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public static void main(String[] args) {
        ProductFactory productFactory = ProductFactory.getInstance();
        Product p1 = productFactory.creerProducts("ProductA");
        System.out.println(p1);

        p1.doStuff();


    }
}
