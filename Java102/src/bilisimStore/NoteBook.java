package bilisimStore;

public class NoteBook extends Product{


    public NoteBook(Integer price,
                    Integer discountPercentage,
                    Integer stockNumber,
                    String productName,
                    String brandName,
                    String ram,
                    String screenSize,
                    String memory) {
        super(price,
                discountPercentage,
                stockNumber,
                productName,
                brandName,
                ram,
                screenSize,
                memory);
    }

    public NoteBook() {
    }


}
