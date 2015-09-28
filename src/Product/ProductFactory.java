package Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yablanch on 28/09/2015.
 */
public final class ProductFactory {
    private static final Map<String, Produits> registry = new HashMap<String, Produits>();

    /*
        Cas sans singleton

     */
    //private static final ProductFactory pf = new ProductFactory();

     /*public static ProductFactory getInstance(){
        return pf;
    }
    */
    public static void registryProducts(String name, Produits p){
        registry.put(name,p);
    }

    public Product creerProducts(String name){
        return registry.get(name).createProduct();
    }



    /*Cas avec singleton*/
    private static final class ProductFactoryHolder{
        private static final ProductFactory INSTANCE = new ProductFactory();
    }

    public static ProductFactory getInstance () {
        return ProductFactoryHolder.INSTANCE ;
    }

}
