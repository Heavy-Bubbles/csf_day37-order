package sg.edu.nus.iss.orderserver.services;

public class OrderException extends Exception{

    public OrderException() {}

    public OrderException(String message) {
        super(message);
    }
    
}
