package sg.edu.nus.iss.orderserver.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.orderserver.Utils;
import sg.edu.nus.iss.orderserver.models.LineItem;

@Repository
public class LineItemRepo {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLineItem(String orderId, LineItem lineItem){
        jdbcTemplate.update(Utils.SQL_INSERT_LINEITEM, orderId, lineItem.name(),
            lineItem.quantity(), lineItem.unitPrice());
    }
}
