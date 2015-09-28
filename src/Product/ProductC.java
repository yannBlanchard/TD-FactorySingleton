package Product;

/**
 * Created by yablanch on 28/09/2015.
 */
public final class ProductC extends Produits {

    private ProductC(){
        super();
    }

    static{
        ProductFactory.registryProducts("ProductC", new ProductC());
    }


    @Override
    public void doStuff() {
        System.out.println("I'm a ProductC,doing my stuff");
    }

    @Override
    public void doIT() {
        System.out.println (" I ’m a ProductC , doing it");
    }

    @Override
    public void perform(){
        System.out.println(" I ’m a ProductC , performing ");
    }

    @Override
    public Product createProduct() {
        return new ProductC();
    }

    @Override
    public String toString() {
        return "ProductC{}";
    }
}
