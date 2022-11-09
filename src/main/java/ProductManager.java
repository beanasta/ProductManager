public class ProductManager {

    protected ProductRepository repo;

    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }

    public void add(Product product) {
        repo.save(product);
    }


    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }

    }


    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product: repo.findAll()) {
            if (matches(product, text)) {
                //result[product] = repo[];
                ///
            }
        }
        return result;
    }
}
