package jpabook.jpashop.exception;

public class NotEnoughStockDataException extends RuntimeException {
    public NotEnoughStockDataException() {
        super();
    }

    public NotEnoughStockDataException(String message) {
        super(message);
    }

    public NotEnoughStockDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockDataException(Throwable cause) {
        super(cause);
    }

}
