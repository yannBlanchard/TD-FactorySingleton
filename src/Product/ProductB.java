package Product;

/**
 * Created by yablanch on 28/09/2015.
 */
public final class ProductB extends Produits {

    private ProductB(){
        super();
    }

    static{
        ProductFactory.registryProducts("ProductB", new ProductB());
    }

    @Override
    public void doStuff() {
        System.out.println("I'm a Product B,doing my stuff");
    }

    @Override
    public void doIT() {
        System.out.println (" I ’m a ProductB , doing it");
    }

    @Override
    public void perform() {
        System.out.println(" I ’m a ProductB , performing ");
    }

    @Override
    public Product createProduct() {
        return new ProductB();
    }

}