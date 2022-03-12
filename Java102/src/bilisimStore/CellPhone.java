package bilisimStore;

import bilisimStore.exceptions.ProductNotFoundException;




public class CellPhone extends Product{

    private Integer batteryPower = null;

    private String color = null;


    public CellPhone(Integer price,
                     Integer discountPercentage,
                     Integer stockNumber,
                     String productName,
                     String brandName,
                     String ram,
                     String screenSize,
                     String memory,
                     Integer batteryPower,
                     String color) {
        super(price, discountPercentage, stockNumber, productName, brandName, ram, screenSize, memory);
        this.batteryPower=batteryPower;
        this.color=color;
    }

    public CellPhone() {
    }

    public Integer getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(Integer batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
