package bilisimStore;

import bilisimStore.exceptions.ProductNotFoundException;

public interface ProductInterface {


    public void listProducts() throws ProductNotFoundException;

    public void addProduct(Product product);

    public void deleteProductWithId(Integer id);

    public void listProductsWithBrandName(String brandName);

    public void listProductsWithId(Integer id);



}
