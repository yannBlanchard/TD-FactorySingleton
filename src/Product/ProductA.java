package Product;

/**
 * Created by yablanch on 28/09/2015.
 */

public final class ProductA extends Produits {

    private ProductA(){
        super();
    }

    static{
        ProductFactory.registryProducts("ProductA", new ProductA());
    }

    @Override
    public void doStuff(){
        System.out.println("I'm a Product A,doing my stuff");
    }

    @Override
    public void doIT() {
        System.out.println (" I ’m a ProductA , doing it");
    }

    @Override
    public void perform() {

    }

    @Override
    public Product createProduct() {
        return new ProductA();
    }

    @Override
    public String toString() {
        return "Je suis un ProductA";
    }
}
