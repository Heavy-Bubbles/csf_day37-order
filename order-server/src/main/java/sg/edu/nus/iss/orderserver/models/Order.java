package sg.edu.nus.iss.orderserver.models;

import java.util.List;

public record Order (String name, String email, Boolean express, List<LineItem> lineItems) {
    
}
