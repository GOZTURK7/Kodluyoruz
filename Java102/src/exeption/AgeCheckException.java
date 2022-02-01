package exeption;

public class AgeCheckException extends Exception{
    public AgeCheckException(String message) {
        super(message);
        System.out.println("Hata Yakalandı.");
    }

    @Override
    public String toString() {
        return "Bu AgeCheck sınıfına ait bir exceptiondır.";
    }
}
