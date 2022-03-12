package bilisimStore;

import bilisimStore.exceptions.ProductNotFoundException;

public class Product implements ProductInterface {

    private Integer price = null;
    private Integer discountPercentage=null;
    private Integer stockNumber=null;
    private String productName=null;
    private String brandName=null;
    private String ram=null;
    private String screenSize=null;
    private String memory=null;

    public Product(Integer price, Integer discountPercentage, Integer stockNumber, String productName, String brandName, String ram, String screenSize, String memory) {
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.stockNumber = stockNumber;
        this.productName = productName;
        this.brandName = brandName;
        this.ram = ram;
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public Product() {
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public void listProducts() throws ProductNotFoundException {

    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProductWithId(Integer id) {

    }

    @Override
    public void listProductsWithBrandName(String brandName) {

    }

    @Override
    public void listProductsWithId(Integer id) {

    }
}
