package sg.edu.nus.iss.orderserver.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.orderserver.Utils;
import sg.edu.nus.iss.orderserver.models.Order;

@Repository
public class OrderRepo {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createOrder(String orderId, Order order) {
        
        // throws unchecked exception
        jdbcTemplate.update(Utils.SQL_INSERT_ORDER,
            orderId, order.name(), order.email(), order.express());
    }
}
