package com.customer.rewards.repository;

import com.customer.rewards.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
public interface TransactionRepository extends JpaRepository<Transactions,Long> {

    public List<Transactions> findAllByCustomerId(Long customerId);

    public List<Transactions> findAllByCustomerIdAndTransactionDateBetween(Long customerId, Timestamp from,Timestamp to);
}
