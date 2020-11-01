package com.anzinuse.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anzinuse.model.AccountTransactions;

public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions
, Long> {

List<AccountTransactions> findByAccountNumber(Long accountNumber);

}