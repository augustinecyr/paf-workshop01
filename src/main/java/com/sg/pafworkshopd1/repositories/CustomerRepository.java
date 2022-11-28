package com.sg.pafworkshopd1.repositories;

import static com.sg.pafworkshopd1.repositories.Queries.*;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.sg.pafworkshopd1.models.Customer;
import com.sg.pafworkshopd1.models.CustomerRowMapper;
import com.sg.pafworkshopd1.models.Order;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Get All Customers record
     * 
     * @param offset
     * @param limit
     * @return
     */
    public List<Customer> getAllCustomer(Integer offset, Integer limit) {
        // prevent inheritance
        final List<Customer> custs = new LinkedList<>();

        // perform the query

        final SqlRowSet rs = jdbcTemplate.queryForRowSet(SQL_SELECT_ALL_CUSTOMERS, offset, limit);

        while (rs.next()) {
            custs.add(Customer.create(rs));
        }
        return custs;
    }

    /**
     * Get single customer record by Id
     * 
     * @param id
     * @return
     */
    public Customer findCustomerById(Integer id) {
        List<Customer> custs = jdbcTemplate.query(SQL_SELECT_CUSTOMERS_BY_ID, new CustomerRowMapper(),
                new Object[] { id });
        return (Customer) custs.get(0);
    }

    public List<Order> getCustomersOrder(Integer id) {
        // prevent inheritance
        final List<Order> orders = new LinkedList<>();

        // perform the query

        final SqlRowSet rs = jdbcTemplate.queryForRowSet(SQL_SELECT_ALL_CUSTOMERS_ORDER, id);

        while (rs.next()) {
            orders.add(Order.create(rs));
        }
        return orders;
    }
}

