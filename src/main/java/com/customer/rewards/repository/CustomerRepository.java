package com.customer.rewards.repository;

import com.customer.rewards.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);

    public Customer findByCustomerName(String customerName);

}
